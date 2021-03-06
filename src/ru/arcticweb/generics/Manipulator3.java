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
public class Manipulator3 {
  private HasF obj;
  public Manipulator3(HasF x) { obj = x; }
  public void manipulate() { obj.f(); }


  public static void main(String[] args) {
    HasF hf = new HasF();
    Manipulator3 manipulator = new Manipulator3(hf);
    manipulator.manipulate();
  }
}
