package io.vertx.example.springboot.conf;

import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.StaticHandler;
import org.springframework.context.annotation.Bean;

public class RouterConf {

    @Bean
    public Router router(Vertx vertx) {
        Router router = Router.router(vertx);
        router.route("/*").handler(StaticHandler.create());
        return router;
    }
}
