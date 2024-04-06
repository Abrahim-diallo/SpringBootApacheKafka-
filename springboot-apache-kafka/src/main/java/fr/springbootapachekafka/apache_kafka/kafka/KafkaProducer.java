package fr.springbootapachekafka.apache_kafka.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class KafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;
    // Méthode pour envoyer un message à un topic spécifique
    public void sendMessage(String message) {
        // Enregistrement de l'envoi du message dans les logs
        log.info("Sending message '{}'", message);
        // Envoi du message au topic spécifié
        kafkaTemplate.send("kafka-guide-practice", message);
    }
}
