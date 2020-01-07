package in.kodecamp.services;
public class SampleService1 implements ISampleService {
  
  @Override
  public String doSomething() {
    System.out.println("Sample 1 : doSomething");
    return "Done Something 1";
  }
}
