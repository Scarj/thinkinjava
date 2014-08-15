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

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import ru.arcticweb.typeinfo.interfacea.A;
import ru.arcticweb.typeinfo.packageaccess.HiddenC;

/**
 * @author evgeniy
 */
public class HiddenImplementation {
  public static void main(String[] args) throws Exception  {
    A a = HiddenC.makeA();
    a.f();
    System.out.println(a.getClass().getName());
    //!!! if (a instanceof C)
    callHiddenMethod(a,"g");
    callHiddenMethod(a,"u");
    callHiddenMethod(a,"v");
    callHiddenMethod(a,"w");
  }

  static void callHiddenMethod(Object a, String methodName) throws Exception {
    Method g = a.getClass().getDeclaredMethod(methodName);
    g.setAccessible(true);
    g.invoke(a);
  }
}
