package br.com.carlos.teste.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.kafka.core.KafkaTemplate;


@Slf4j
@Service
@RequiredArgsConstructor
public class TopicProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void send(String message, String topic) {
        log.info("Message: [{}] / Topic: [{}]", message, topic);
        kafkaTemplate.send(topic, message);
    }

}
