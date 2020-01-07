package in.kodecamp.aspects.aj;

import in.kodecamp.aspects.Sample;
import in.kodecamp.services.ISampleService;

public aspect SampleAspect {

//  pointcut callAt() : call(* Sample1.doSomething()) || call(* Sample2.doSomething());
  pointcut callAt() : call(* ISampleService.doSomething()) || call(@Sample * *());


  after() returning() : callAt() {
    System.out.println("@SampleAspect : after returning"); 
  } 
  
  before() : callAt() {
    System.out.println("@SampleAspced : before"); 
  }
  
  String around() : callAt() {
    System.out.println("@SampleAspect"); 
    System.out.println("Target : " + thisJoinPoint.getTarget());
    System.out.println("This : " + thisJoinPoint.getThis());
    System.out.println("Args : " + thisJoinPoint.getArgs());
    String orgValue = proceed();
    return "Hello From Aspect : " + orgValue;
  }
}
