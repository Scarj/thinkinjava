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

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/**
 * @author evgeniy
 */
public class ShowMethods {
  private static String usage =
          "usage:\n" +
          "ShowMethods qualified.class.name\n" +
          "To show all methods in class or:\n" +
          "ShowMethods qualified.class.name word\n" +
          "To search for methods inbolving 'word'";
  private static Pattern p = Pattern.compile("\\w+\\.");

  public static void main(String[] args)
  {
    if(args.length<1){
      print(usage);
      System.exit(0);
    }

    int lines = 0;
    try
    {
      Class<?> c = Class.forName(args[0]);
      Method[] methods = c.getMethods();
      Constructor[] ctors = c.getConstructors();
      if (args.length==1){
        for (Method method: methods) {
          print(p.matcher(method.toString()).replaceAll(""));
        }

        for (Constructor ctor: ctors){
          print(p.matcher(ctor.toString()).replaceAll(""));
        }

        lines = methods.length + ctors.length;
      } else {
        for (Method method: methods) {
          if (method.toString().indexOf(args[1])!=-1) {
            print(p.matcher(method.toString()).replaceAll(""));
          }
        }

        for (Constructor ctor : ctors){
          if (ctor.toString().indexOf(args[1])!=1){
            print(p.matcher(ctor.toString()).replaceAll(""));
            lines++;
          }
        }
      }
    }
    catch (ClassNotFoundException e)
    {
      print("No such class: " + e);
    }
  }
}
