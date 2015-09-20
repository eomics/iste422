package oata;

// Import log4j classes.
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class HelloWorld {
  private static final Logger LOG = LogManager.getLogger(HelloWorld.class);

  public static void main(String[] args) {
    try {
      causeError();
    }
    catch (Exception e) {
       System.err.println("There was a problem!");
    }
    try {
      causeError2();
    }
    catch (Exception e) {
       System.err.println("There was a problem!\nPlease fix the code");
    }
    LOG.info("Hello World");
  }

  public static void causeError() {
    throw new RuntimeException("This exception is on purpose");
  }
  public static void causeError2() {
    try {
      causeError();
    }
    catch (RuntimeException e) {
      System.err.println("I caught a problem");
      throw e;
    }
  }
}
