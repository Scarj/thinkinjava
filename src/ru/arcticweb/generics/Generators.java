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
import java.util.Collection;

import net.mindview.util.Generator;

import ru.arcticweb.generics.coffee.Coffee;
import ru.arcticweb.generics.coffee.CoffeeGenerator;

/**
 * @author evgeniy
 */
public class Generators {
  public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
    for (int i = 0; i < n; i++) {
      coll.add(gen.next());
    }
    return coll;
  }

  public static void main(String[] args) {
    Collection<Coffee> coffees = fill(new ArrayList<Coffee>(),new CoffeeGenerator(),4);
    for (Coffee c: coffees) {
      System.out.print(c + " ");
    }

    System.out.println();

    Collection<Integer> fnumbers = fill(new ArrayList<Integer>(),new Fibonacci(),12);
    for (int i: fnumbers) {
      System.out.print(i + " ");
    }


  }
}
