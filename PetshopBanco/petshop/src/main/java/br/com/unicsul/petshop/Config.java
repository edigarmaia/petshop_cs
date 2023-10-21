package br.com.unicsul.petshop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean(name = "servicos")
    public String rotaServicos() {
        return "servicos";
    }
    @Bean(name = "saudacao")
    public String rotaSaudacao() {
        return "saudacao";
    }

    @Bean(name = "quemsomos")
    public String rotaQuemSomos() {
        return "quemsomos";
    }
}
