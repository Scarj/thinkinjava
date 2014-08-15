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

import static net.mindview.util.Print.print;

/**
 * @author evgeniy
 */

class ClassAsFactory<T> {
  T x;

  public ClassAsFactory(Class<T> kind) {
    try {
      x = kind.newInstance();
    }
    catch (Exception e) {
      throw new RuntimeException();
    }
  }
}

class Employee { }


public class InstantiateGenericType {
  public static void main(String[] args) {
    ClassAsFactory<Employee> fe = new ClassAsFactory<Employee>(Employee.class);
    print("ClassAsFactory<Employee> успех");

    try {
      ClassAsFactory<Integer> fi = new ClassAsFactory<Integer>(Integer.class);
    } catch (Exception e) {
      print("ClassAsFactory<Integer> неудача");
    }

  }

}
