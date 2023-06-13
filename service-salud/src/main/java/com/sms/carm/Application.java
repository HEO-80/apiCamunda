package com.sms.carm;

import com.sms.carm.controller.ExpedienteController;
import com.sms.carm.controller.ProcedimientoController;
import com.sms.carm.controller.ProductController;
import com.sms.carm.controller.ServicioController;
import org.camunda.bpm.spring.boot.starter.rest.CamundaJerseyResourceConfig;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@SpringBootApplication
@ComponentScan("com.sms.carm.controller")
public class Application {

  public static void main(String... args) {
    SpringApplication.run(Application.class, args);
  }

  @Component
  @ApplicationPath("/engine-rest")
  public class JerseyConfig extends CamundaJerseyResourceConfig {


      @Override
    protected void registerAdditionalResources() {
      packages(true, "com.sms.carm.controller");
      register(ProductController.class)
            .register(ServicioController.class)
             .register(ProcedimientoController.class)
            .register(ExpedienteController.class);
    }

  }
}