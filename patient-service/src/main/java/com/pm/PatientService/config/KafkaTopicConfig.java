package com.pm.PatientService.config;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic patientTopic() {
        return new NewTopic("patients", 1, (short) 1);
    }
}
