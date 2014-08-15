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

class Base { }
class Derived extends Base { }

public class FamilyVsExactType
{
  static void test(Object x) {
    print("Тестируем x типа: " + x.getClass());
    print( "x instanceof Base " + (x instanceof Base));
    print( "x instanceof Derived " + (x instanceof Derived));
    print("Base.isInstance(x) " + Base.class.isInstance(x));
    print("Derived.isInstance(x) " + Derived.class.isInstance(x));
    print("x.getClass()==Base.class " + (x.getClass()==Base.class));
    print("x.getClass()==Derived.class " + (x.getClass()==Derived.class));
    print("x.getClass().qualse(Base.class) " + (x.getClass().equals(Base.class)));
    print("x.getClass().qualse(Derived.class) " + (x.getClass().equals(Derived.class)));
  }

  public static void main(String[] args)
  {
    test(new Base());
    test(new Derived());
  }
}
