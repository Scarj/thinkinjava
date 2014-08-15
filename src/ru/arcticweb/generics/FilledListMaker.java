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
public class FilledListMaker<T> {
  List<T> create(T t, int n) {
    List<T> result = new ArrayList<T>();
    for (int i = 0; i < n; i++) {
      result.add(t);
    }
    return result;
  }

  public static void main(String[] args) {
    FilledListMaker<String> stringMaker = new FilledListMaker<String>();
    List<String> list = stringMaker.create("Hello",4);
    System.out.println(list);
  }
}
