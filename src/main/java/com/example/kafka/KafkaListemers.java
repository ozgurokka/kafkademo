package com.example.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListemers {
    @KafkaListener(topics = "okka", groupId = "ozgur")
    void listener(String data){
        System.out.println("listen:" + data);
    }
}
