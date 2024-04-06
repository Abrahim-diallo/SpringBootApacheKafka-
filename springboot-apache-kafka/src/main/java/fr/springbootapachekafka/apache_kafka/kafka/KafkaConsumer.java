package fr.springbootapachekafka.apache_kafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    // Initialisation du logger avec LoggerFactory
    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    // Méthode annotée avec @KafkaListener pour écouter les messages du topic "kafka-guide-practice"
    // avec le groupe de consommateurs "myGroup".
    @KafkaListener(topics = "kafka-guide-practice", groupId = "myGroup")
    public void consumer(String message){
        // Lorsqu'un message est reçu, cette méthode est invoquée automatiquement par Spring Kafka.
        // Le message reçu est passé en tant que paramètre.

        // Enregistrement du message reçu dans les logs.
        logger.info("Message received -> {}", message);
    }
}
