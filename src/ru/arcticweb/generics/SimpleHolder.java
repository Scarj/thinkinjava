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
public class SimpleHolder {
  private Object object;

  public void setObject(Object object) {
    this.object = object;
  }

  public Object getObject() {
    return object;
  }

  public static void main(String[] args) {
    SimpleHolder holder = new SimpleHolder();
    holder.setObject("Item");
    String s = (String)holder.getObject();
  }
}
