package in.kodecamp.services;

import in.kodecamp.aspects.Sample;

public class SampleService2 {

  @Sample
  public String doSomethingXyz() {
    System.out.println("Sample 2 : doSomething");
    return "Done Something 2";
  }
}