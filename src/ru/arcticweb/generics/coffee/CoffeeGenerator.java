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

package ru.arcticweb.generics.coffee;

import static net.mindview.util.Print.print;

import java.util.Iterator;
import java.util.Random;

import net.mindview.util.Generator;

/**
 * @author evgeniy
 */
public class CoffeeGenerator implements Generator<Coffee>,Iterable<Coffee> {

  private Class[] types = { Latte.class, Mocha.class, Cappuccino.class, Americano.class, Breve.class };
  private static Random random = new Random(47);
  public CoffeeGenerator() { }
  private int size = 0;
  public CoffeeGenerator(int size) { this.size = size; }


  @Override
  public Coffee next() {
    try {
      return (Coffee) types[random.nextInt(types.length)].newInstance();
    }
    catch (Exception e) {
      throw new RuntimeException();
    }
  }

  class CoffeeIterator implements Iterator<Coffee> {

    int count = size;

    @Override
    public boolean hasNext() { return count>0; }

    @Override
    public Coffee next() { count--; return CoffeeGenerator.this.next(); }

    @Override
    public void remove() {
      throw new UnsupportedOperationException();
    }
  }

  @Override
  public Iterator<Coffee> iterator() {
    return new CoffeeIterator();
  }

  public static void main(String[] args) {
    CoffeeGenerator gen = new CoffeeGenerator();
    for (int i = 0; i < 5; i++) {
      print(gen.next());
    }

    for (Coffee c : new CoffeeGenerator(5)) {
      System.out.println(c);
    }
  }
}
