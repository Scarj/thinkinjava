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

/**
 * @author evgeniy
 */

class GenericBase<T> {
  private T element;

  public void setElement(T element) {
    this.element = element;
  }

  public T getElement() {
    return element;
  }
}

class Derived1<T> extends GenericBase<T> { }
class Derived2 extends GenericBase { }

//!! class Derived3 extends GenericBase<?> { }


public class ErasureAndInheritance {
  @SuppressWarnings("unchecked")
  public static void main(String[] args) {
    Derived2 d2 = new Derived2();
    Object obj = d2.getElement();
    d2.setElement(obj);
  }
}
