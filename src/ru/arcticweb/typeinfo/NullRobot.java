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

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.List;

import net.mindview.util.Null;

/**
 * @author evgeniy
 */

class NullRobotProxyHandler implements InvocationHandler {
  private String nullName;
  private Robot proxied = new NRobot();

  NullRobotProxyHandler(Class<? extends Robot> type) {
    nullName = type.getSimpleName() + " NullRobot";
  }

  private class NRobot implements Null,Robot {
    @Override
    public String name() { return nullName; }
    @Override
    public String model() { return nullName; }
    @Override
    public List<Operation> operations() {
      return Collections.emptyList();
    }
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
  {
    return method.invoke(proxied,args);
  }


}

public class NullRobot {
  public static Robot newNullRobot(Class<? extends Robot> type) {
    return (Robot) Proxy.newProxyInstance(
            NullRobot.class.getClassLoader(),
            new Class[]{Null.class, Robot.class},
            new NullRobotProxyHandler(type));
  }

  public static void main(String[] args) {
    Robot[] bots = {
            new SnowRemovalRobot("SnowBee"),
            newNullRobot(SnowRemovalRobot.class)
    };
    for (Robot bot: bots) {
      Robot.Test.test(bot);
    }
  }
}
