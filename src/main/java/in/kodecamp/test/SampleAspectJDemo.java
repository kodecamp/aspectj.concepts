package in.kodecamp.test;

import in.kodecamp.services.SampleService1;
import in.kodecamp.services.SampleService2;

public class SampleAspectJDemo {

  public static void main(String[] args) {
    SampleService1 sample1 = new SampleService1();
    System.out.println("Main : sample1 : " + sample1);
    String someValue1 = sample1.doSomething();
    System.out.println("Main : someValue 1 : " + someValue1);

    SampleService2 sample2 = new SampleService2();
    System.out.println("Main : sample2 : " + sample2);
    String someValue2 = sample2.doSomethingXyz();
    System.out.println("Main : someValue 2 : " + someValue2);
  }

}



