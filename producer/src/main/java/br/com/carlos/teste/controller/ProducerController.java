package br.com.carlos.teste.controller;

import br.com.carlos.teste.producer.TopicProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class ProducerController {

    @Autowired
    TopicProducer topicProducer;

    @GetMapping
    public void createMessage(@RequestParam String message, @RequestParam String topic) {
        topicProducer.send(message, topic);
    }

}
