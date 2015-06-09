package io.vertx.example.springboot.conf;

import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.ext.web.Router;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

public class ServerConf {

    @Value("${server.port:9090}")
    private int port;

    @Bean
    public HttpServer server(Vertx vertx, Router router) {
        HttpServer server = vertx.createHttpServer();
        server.requestHandler(router::accept).listen(port);
        return server;
    }

}
