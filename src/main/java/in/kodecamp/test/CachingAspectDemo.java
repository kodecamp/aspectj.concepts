package in.kodecamp.test;

import in.kodecamp.services.ShoppingCartService;

public class CachingAspectDemo {
  private static ShoppingCartService cart = new ShoppingCartService();

  static {
    cart.addNew("item 1");
    cart.addNew("item 2");
    cart.addNew("item 3");
    cart.addNew("item 4");
  }

  public static void main(String[] args) {
    String item1 = cart.get(2);
    System.out.println("Item 1 : " + item1);
    String item2 = cart.get(1);
    System.out.println("Item 2 : " + item2);
    String item3 = cart.get(2);
    System.out.println("Item 3 : " + item3);
  }


}
