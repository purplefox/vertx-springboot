package io.vertx.example.springboot;


import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.StaticHandler;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {

    System.out.println("In main!!");

    Vertx vertx = Vertx.vertx();

    Router router = Router.router(vertx);

    // Serve the static pages
    router.route().handler(StaticHandler.create());

    vertx.createHttpServer().requestHandler(router::accept).listen(8080);

    System.out.println("Server is started");
  }

}
