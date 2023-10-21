package br.com.unicsul.petshop.configuration;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;

import java.util.TimeZone;

@Configuration
public class SpringTimeZoneConfig {

    @PostConstruct
    public void timeZoneConfig(){
        TimeZone.setDefault(TimeZone.getTimeZone("America/São_Paulo"));
    }
}
