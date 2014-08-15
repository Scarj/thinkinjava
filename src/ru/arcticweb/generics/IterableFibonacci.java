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

import java.util.Iterator;

/**
 * @author evgeniy
 */
public class IterableFibonacci extends Fibonacci implements Iterable<Integer>{
  private int n;

  public IterableFibonacci(int count) { this.n = count; }

  @Override
  public Iterator<Integer> iterator() {
    return new Iterator<Integer>()
    {
      @Override
      public boolean hasNext() { return n > 0; }

      @Override
      public Integer next() {
        n--;
        return IterableFibonacci.this.next();
      }

      @Override
      public void remove(){
        //Не реализован
        throw new UnsupportedOperationException();
      }
    };
  }

  public static void main(String[] args) {
    for (int i : new IterableFibonacci(18)) {
      System.out.print(i + " ");
    }
  }
}
