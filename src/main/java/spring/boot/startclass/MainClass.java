package spring.boot.startclass;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;

public class MainClass
{
  private static final Logger LOGGER = LoggerFactory.getLogger( MainClass.class);

  public static void main(String[] args)
  {
    LOGGER.info( "MainClass::main() : -> StartclassApplication.main( args)");
    StartclassApplication.main( args);
  }
}
