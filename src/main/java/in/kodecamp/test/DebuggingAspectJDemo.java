package in.kodecamp.test;

import in.kodecamp.services.Proccessor;

public class DebuggingAspectJDemo {

  public static void main(String[] args) {
    Proccessor p = new Proccessor();
    p.process(4,5,6);
  }

}
