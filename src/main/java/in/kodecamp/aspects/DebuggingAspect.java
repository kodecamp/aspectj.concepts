package in.kodecamp.aspects;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class DebuggingAspect {
  // JointPoint is @Secured return type name and args does not matter
  //
  @Pointcut("call(* Logger.log(..))")
  public void logAt() {
  }

  @Around("logAt()")
  public Object around(ProceedingJoinPoint pjp) throws Throwable {
    System.out.println("Class : " + pjp.getTarget());
    System.out.println("Method : " + pjp.getSignature().getName());
    Object[] args = pjp.getArgs();
    String argString = Arrays.stream(args).map(String::valueOf).collect(Collectors.joining("-"));
    System.out.println("Args : " + argString);
    return pjp.proceed();
  }
}