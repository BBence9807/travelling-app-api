package hu.bb.travellingappapi;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Travelling Rest API", description = "Rest application for travelling app",version = "1.0"))
public class TravellingAppApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravellingAppApiApplication.class, args);
	}

}
