package io.vertx.example.springboot.conf;

import io.vertx.core.Vertx;
import org.springframework.context.annotation.Bean;

public class VertxConf {
    @Bean
    public Vertx vertx() {
        return Vertx.vertx();
    }
}
