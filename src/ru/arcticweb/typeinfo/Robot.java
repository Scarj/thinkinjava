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

import java.util.List;

import net.mindview.util.Null;

/**
 * @author evgeniy
 */
public interface Robot {
  String name();
  String model();

  List<Operation> operations();

  class Test {
    public static void test(Robot r) {
      if(r instanceof Null)
        System.out.println("[Null Robot]");

      System.out.println("Название:" + r.name());
      System.out.println("Модель:" + r.model());
      for (Operation operation: r.operations()) {
        System.out.println(operation.description());
        operation.command();
      }
    }
  }
}
