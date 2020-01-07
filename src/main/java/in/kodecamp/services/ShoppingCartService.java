package in.kodecamp.services;

import java.util.LinkedHashMap;
import java.util.Map;

import in.kodecamp.aspects.Cached;
import in.kodecamp.aspects.Debug;

public class ShoppingCartService {

  // ordered hashset
  private Map<Integer, String> db = new LinkedHashMap<>();
  private static int count = 1;

  public ShoppingCartService() {

  }

  public void addNew(final String item) {
    this.db.put(count, item);
    count += 1;
  }

  @Cached(isAlways = true)
  public String get(final int id) {
    System.out.println("ShoppingCartService : getting : " + id);
    return db.get(id);
  }

}
