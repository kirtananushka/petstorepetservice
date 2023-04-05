package io.swagger;

import com.chtrembl.petstore.pet.model.ContainerEnvironment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EntityScan("com.chtrembl.petstore.pet.model")
@EnableJpaRepositories("com.chtrembl.petstore.pet.repository")
@ComponentScan(basePackages = {
  "io.swagger",
  "com.chtrembl.petstore.pet.api",
  "com.chtrembl.petstore.pet.service",
  "com.chtrembl.petstore.pet.repository",
  "io.swagger.configuration"
})
public class Swagger2SpringBoot implements CommandLineRunner {

  @Bean
  public ContainerEnvironment containerEnvvironment() {
    return new ContainerEnvironment();
  }

  @Override
  public void run(String... arg0) throws Exception {
    if (arg0.length > 0 && arg0[0].equals("exitcode")) {
      throw new ExitException();
    }
  }

  public static void main(String[] args) throws Exception {
    new SpringApplication(Swagger2SpringBoot.class).run(args);
  }

  class ExitException extends RuntimeException implements ExitCodeGenerator {
    private static final long serialVersionUID = 1L;

    @Override
    public int getExitCode() {
      return 10;
    }
  }
}
