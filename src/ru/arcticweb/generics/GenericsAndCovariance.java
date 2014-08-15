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

import java.util.ArrayList;
import java.util.List;

/**
 * @author evgeniy
 */
public class GenericsAndCovariance {
  public static void main(String[] args)
  {
    List<? extends Fruit> fruits = new ArrayList<Apple>();

//    fruits.add(new Apple());
//    fruits.add(new Fruit());
//    fruits.add(new Object());
    fruits.add(null);

    Fruit f = fruits.get(0);
  }
}
