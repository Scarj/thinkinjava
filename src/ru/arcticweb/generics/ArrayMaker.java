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
import java.util.Arrays;

/**
 * @author evgeniy
 */
public class ArrayMaker<T> {
  private Class<T> kind;

  public ArrayMaker(Class<T> kind) {
    this.kind = kind;
  }

  @SuppressWarnings("unchecked")
  T[] create (int size) {
    return (T[]) Array.newInstance(kind,size);
  }

  public static void main(String[] args) {
    ArrayMaker<String> stringMaker = new ArrayMaker<String>(String.class);
    String[] stringArray = stringMaker.create(9);
    System.out.println(Arrays.toString(stringArray));
  }
}
