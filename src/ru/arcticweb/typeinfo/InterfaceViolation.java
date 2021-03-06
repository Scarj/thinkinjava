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

package ru.arcticweb.typeinfo;

import ru.arcticweb.typeinfo.interfacea.A;

/**
 * @author evgeniy
 */
class B implements A {

  @Override
  public void f(){ }

  public void g() { }
}

public class InterfaceViolation {
  public static void main(String[] args) {
    A a = new B();
    a.f();
    System.out.println(a.getClass().getName());
    if(a instanceof B) {
      B b = (B)a;
      b.g();
    }
  }
}
