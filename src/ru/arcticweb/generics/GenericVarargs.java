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
import java.util.List;

/**
 * @author evgeniy
 */
public class GenericVarargs {
  public static <T> List<T> makeList(T... args) {
    List<T> result = new ArrayList<T>();
    for (T item: args) {
      result.add(item);
    }

    return result;
  }

  public static void main(String[] args) {
    List<String> ls = makeList("ABC");
    System.out.println(ls);
    ls = makeList("A","B","C");
    System.out.println(ls);
    ls = makeList("ABCDEFGHIJKLMNOPQRSTUVWXYZ".split(""));
    System.out.println(ls);
  }
}
