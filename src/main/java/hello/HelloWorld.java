package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
  public static void main(String[] args) throws Exception {
    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is: " + currentTime);

    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());
    try {
        Thread.sleep(5000);
    } catch (Exception e) {
        throw e;
    }
  }
}
