/*********************************************************************
 * The Initial Developer of the content of this file is NOVARDIS.
 * All portions of the code written by NOVARDIS are property of
 * NOVARDIS. All Rights Reserved.
 *
 * NOVARDIS
 * Detskaya st. 5A, 199106 
 * Saint Petersburg, Russian Federation 
 * Tel: +7 (812) 331 01 71
 * Fax: +7 (812) 331 01 70
 * www.novardis.com
 *
 * (c) 2014 by NOVARDIS
 *********************************************************************/

package ru.arcticweb.generics;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author evgeniy
 */
public class RandomList<T> {
  private ArrayList<T> storage = new ArrayList<T>();
  private Random random = new Random(47);

  public void add(T item) {
    storage.add(item);
  }

  public T select() {
    return storage.get(random.nextInt(storage.size()));
  }

  public static void main(String[] args) {
    RandomList<String> rs = new RandomList<String>();
    for (String s: ("The quick brown fox jumped over the lazy brown dog").split(" ")) {
      rs.add(s);
    }
    for (int i = 0; i<11; i++) {
      System.out.print(rs.select() + " ");
    }
  }

}
