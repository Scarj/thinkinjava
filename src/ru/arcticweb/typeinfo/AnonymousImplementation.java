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

import static net.mindview.util.Print.print;

import ru.arcticweb.typeinfo.interfacea.A;

/**
 * @author evgeniy
 */

class AnonymousA {
  public static A makeA() {
    return new A() {
      @Override
      public void f() { print("public C.f()"); }
      public void g() { print("public C.g()"); }
      void u() { print("package C.u()"); }
      protected void v() {print("protected C.f()"); }
      protected void w() {print("protected C.w()"); }
    };
  }
}

public class AnonymousImplementation {
  public static void main(String[] args) throws Exception {
    A a = new AnonymousA().makeA();
    a.f();
    System.out.println(a.getClass().getName());
    HiddenImplementation.callHiddenMethod(a,"g");
    HiddenImplementation.callHiddenMethod(a,"u");
    HiddenImplementation.callHiddenMethod(a,"v");
    HiddenImplementation.callHiddenMethod(a,"w");
  }
}
