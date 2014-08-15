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

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author evgeniy
 */

class MethodSelector implements InvocationHandler {
  private Object proxied;

  MethodSelector(Object proxied) {
    this.proxied = proxied;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    if(method.getName().equals("interesting"))
      print("посредник обнаружил интересный метод");
    return method.invoke(proxied,args);
  }
}

interface SomeMethods {
  void boring1();
  void boring2();
  void interesting(String arg);
  void boring3();
}

class Implementation implements SomeMethods {

  @Override
  public void boring1()
  {
    print("boring1");
  }

  @Override
  public void boring2()
  {
    print("boring2");

  }

  @Override
  public void interesting(String arg)
  {
    print("interesting " + arg);

  }

  @Override
  public void boring3()
  {
    print("boring3");
  }
}

public class SelectingMethods {
  public static void main(String[] args) {
    SomeMethods proxy = (SomeMethods) Proxy.newProxyInstance(
            SomeMethods.class.getClassLoader(),
            new Class[] { SomeMethods.class },
            new MethodSelector(new Implementation())
    );
    proxy.boring1();
    proxy.boring2();
    proxy.interesting("bonobo");
    proxy.boring3();
  }
}
