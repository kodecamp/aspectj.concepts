package in.kodecamp.services;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Logger {
  
  public void log(Object ...args) {
    String str = Arrays.stream(args).map(String::valueOf).collect(Collectors.joining("|"));
    System.out.println(str);
  }

}
