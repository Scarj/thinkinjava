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

import net.mindview.util.Generator;

/**
 * @author evgeniy
 */
public class Fibonacci implements Generator<Integer>{
  private int count = 0;

  @Override
  public Integer next() { return fib(count++); }

  private int fib(int n) {
    if(n<2) return 1;
    return fib(n-2)+fib(n-1);
  }


  public static void main(String[] args) {
    Fibonacci gen = new Fibonacci();
    for (int i = 0; i < 56; i++) {
      System.out.print(gen.next() + " ");
    }
  }
}
