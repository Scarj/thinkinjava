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

import java.lang.reflect.Array;

/**
 * @author evgeniy
 */
public class GenericArrayWithToken<T> {
  private T[] array;

  public GenericArrayWithToken(Class<T> type, int size) {
    this.array = (T[]) Array.newInstance(type,size);
  }

  public void put(int index, T item) {
    array[index] = item;
  }

  public T get(int index) {
    return array[index];
  }

  public T[] rep() {
    return array;
  }

  public static void main(String[] args)
  {
    GenericArrayWithToken<Integer> gai = new GenericArrayWithToken<Integer>(Integer.class,10);
    Integer[] ia = gai.rep();
  }
}
