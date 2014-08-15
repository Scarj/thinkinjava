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

import java.util.Arrays;
import java.util.List;

/**
 * @author evgeniy
 */
public class SnowRemovalRobot implements Robot {
  private String name;

  public SnowRemovalRobot(String name) { this.name = name; }

  @Override
  public String name() { return name; }

  @Override
  public String model() { return "SnowBot Series 11"; }

  @Override
  public List<Operation> operations() {
    return Arrays.asList(
            new Operation() {
              @Override
              public String description() {
                return name + " может убирать снег";
              }
              @Override
              public void command() {
                System.out.println(name + " убирает снег");
              }
            },

            new Operation() {
              @Override
              public String description() {
                return name + " может колоть лед";
              }
              @Override
              public void command() {
                System.out.println(name + " колет лед");
              }
            },

            new Operation()
            {
              @Override
              public String description() {
                return name + " может чистить крышу";
              }
              @Override
              public void command() {
                System.out.println(name + " чистит крышу");
              }
            }
    );
  }

  public static void main(String[] args)
  {
    Robot.Test.test(new SnowRemovalRobot("Снеговичок"));
  }
}
