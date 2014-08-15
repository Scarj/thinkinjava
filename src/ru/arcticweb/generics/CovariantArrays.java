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

class Fruit { }
class Apple extends Fruit { }
class Jonathan extends Apple { }
class Orange extends Fruit { }

public class CovariantArrays {
  public static void main(String[] args) {
    Fruit[] fruits = new Apple[10];
    fruits[0] = new Apple();
    fruits[1] = new Jonathan();

    try
    {
      fruits[0] = new Fruit();
    } catch (Exception e) {
      System.out.println(e);
    }


    try
    {
      fruits[0] = new Orange();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
