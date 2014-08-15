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

/**
 * @author evgeniy
 */

interface Interface {
  void doSomething();
  void somethingElse(String arg);
}

class RealObject implements Interface {

  @Override
  public void doSomething()
  {
    print("doSomething");
  }

  @Override
  public void somethingElse(String arg) {
    print("somethingElse " + arg);
  }
}

class SimpleProxy implements Interface {
  private Interface proxied;

  SimpleProxy(Interface proxied)
  {
    this.proxied = proxied;
  }

  @Override
  public void doSomething()
  {
    print("SimpleProxy.doSomething");
    proxied.doSomething();
  }

  @Override
  public void somethingElse(String arg)
  {
    print("SimpleProxy.somethingElse " + arg);
    proxied.somethingElse(arg);
  }
}


public class SimpleProxyDemo {

  public static void consumer(Interface iface) {
    iface.doSomething();
    iface.somethingElse("bonobo");
  }

  public static void main(String[] args) {
    consumer(new RealObject());
    consumer(new SimpleProxy(new RealObject()));
  }
}
