package in.kodecamp.services;

import in.kodecamp.aspects.Debug;

public class Proccessor {
  
  @Debug public void process(int x, int y, int z) {
    System.out.println("Method : process");
  }
}