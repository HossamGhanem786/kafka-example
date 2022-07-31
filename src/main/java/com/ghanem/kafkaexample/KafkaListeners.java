package com.ghanem.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics="hossam-topic",groupId="groupId")
    void listener(String data){

        System.out.println("Listener Received  "+data);
    }
}
