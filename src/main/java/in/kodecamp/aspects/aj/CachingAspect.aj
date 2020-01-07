package in.kodecamp.aspects.aj;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import in.kodecamp.aspects.Cached;

public aspect CachingAspect {

  private Map<Integer, String> cache = new HashMap<>();

  pointcut callAt(Cached cached) : call(@Cached * *(..)) && @annotation(cached);

  Object around(Cached cached) : callAt(cached) {
    System.out.println(cached.isAlways());
    int key = Integer.valueOf(thisJoinPoint.getArgs()[0].toString());
    return cache.compute(key,
        (k, value) -> Objects.isNull(value) ? (String) proceed(cached) : value);
  }

}
