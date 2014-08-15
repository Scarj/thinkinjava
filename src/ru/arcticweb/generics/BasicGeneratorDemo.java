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

import net.mindview.util.BasicGenerator;
import net.mindview.util.Generator;

/**
 * @author evgeniy
 */
public class BasicGeneratorDemo {
  public static void main(String[] args) {
    Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);

    for (int i = 0; i < 5; i++) {
      System.out.println(gen.next());
    }
  }
}
