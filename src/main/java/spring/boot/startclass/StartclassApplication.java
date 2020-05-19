package spring.boot.startclass;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot: Configuring a Main Class
 * https://www.baeldung.com/spring-boot-main-class
 * java -cp bootApp.jar -Dloader.main=com.baeldung.DemoApplication org.springframework.boot.loader.PropertiesLauncher
 *
 * Igazabol nem ertem, mikor van erre szukseg...
 */

// @SpringBootApplication
public class StartclassApplication
{
	private static final Logger LOGGER = LoggerFactory.getLogger( StartclassApplication.class);

	public static void main(String[] args)
	{
		LOGGER.info( "StartclassApplication::main() : -> SpringApplication.run(...)");
		SpringApplication.run(StartclassApplication.class, args);
	}
}
