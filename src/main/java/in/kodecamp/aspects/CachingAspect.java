package in.kodecamp.aspects;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CachingAspect {
  private List<String> list = new ArrayList<>();

  public CachingAspect() {
    System.out.println("CachingAspect : Constructor");
  }

//  @Pointcut("call(@Cached * *(..)) && @annotation(cached)")
  public void cacheAt(Cached cached) {
  }

//  @Around("cacheAt(cached)")
  public boolean cachingAdvice(ProceedingJoinPoint pjp, Cached cached)
      throws Throwable {
    String item = (String) pjp.getArgs()[0];
    if (list.contains(item)) {
      System.out.println("@IN CACHE -> Returning : "+ item);
      return false;
    }
    System.out.println("@NOT IN CACHE -> " + item + " : Hitting Service...");
    list.add(item);
    Object obj = pjp.proceed(new Object[] {item});
//    return (boolean) obj;
    return true;
  }

}
