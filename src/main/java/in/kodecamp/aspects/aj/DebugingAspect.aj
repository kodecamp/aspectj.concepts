package in.kodecamp.aspects.aj;

import java.util.Arrays;
import java.util.stream.Collectors;

import in.kodecamp.aspects.Debug;

public aspect DebugingAspect {
 
  // Set of join points = point cuts
  pointcut callAt() : call(@Debug * *(..));
 
  // Advice
  Object around() : callAt() {
    String target = thisJoinPoint.getTarget().getClass().getName();
    String method = thisJoinPoint.getSignature().getName();
    Object[] args = thisJoinPoint.getArgs();
    String argsString = Arrays.stream(args).map(String::valueOf).collect(Collectors.joining(", "));
    System.out.println(String.format("[ %s ] -> %s(%s)",target, method,argsString));
    // call the method or next advice 
    return proceed();
  }
  
  
  
  

}
