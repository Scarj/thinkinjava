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

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author evgeniy
 */

class DynamicProxyHandler implements InvocationHandler {
  private Object proxied;

  DynamicProxyHandler(Object proxied) {
    this.proxied = proxied;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
  {
    System.out.println("**** proxy: " + proxy.getClass() + ", method: " + method + ", args: " + args);
    if (args != null) {
      for (Object arg: args) {
        System.out.println(" " + arg);
      }
    }
    return method.invoke(proxied,args);
  }
}

public class SimpleDynamicProxy {
  public static void consumer(Interface iface) {
    iface.doSomething();
    iface.somethingElse("bonobo");
  }

  public static void main(String[] args) {
    RealObject real = new RealObject();
    consumer(real);

    Interface proxy = (Interface) Proxy.newProxyInstance(
            Interface.class.getClassLoader(),
            new Class[]{ Interface.class},
            new DynamicProxyHandler(real)
    );

    consumer(proxy);
  }
}
