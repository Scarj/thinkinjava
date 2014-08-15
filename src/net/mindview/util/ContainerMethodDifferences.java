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

package net.mindview.util;

import java.lang.reflect.Method;
import java.util.*;

/**
 * @author evgeniy
 */
public class ContainerMethodDifferences {
  static Set<String> methodSet(Class<?> type) {
    Set<String> result = new TreeSet<String>();
    for (Method m: type.getMethods()) {
      result.add(m.getName());
    }
    return result;
  }

  static void interfaces(Class<?> type) {
    System.out.print("Interfaces in " + type.getSimpleName() + ": ");
    List<String> result = new ArrayList<String>();

    for (Class<?> c: type.getInterfaces()) {
      result.add(c.getSimpleName());
    }

    System.out.println(result);
  }

  static Set<String> object = methodSet(Object.class);
  static { object.add("clone"); }

  static void difference(Class<?> superset, Class<?> subset) {
    System.out.print(superset.getSimpleName() + " extends " + subset.getSimpleName() + ", adds: ");
    Set<String> comp = Sets.difference(methodSet(superset),methodSet(subset));
    comp.removeAll(object);
    System.out.println(comp);
    interfaces(superset);
  }

  public static void main(String[] args) {
    System.out.println("Collection: " + methodSet(Collection.class));
    interfaces(Collection.class);
    difference(Set.class,Collection.class);
    difference(HashSet.class,Set.class);
    difference(LinkedHashSet.class,HashSet.class);
    difference(TreeSet.class,Set.class);
    difference(List.class,Collection.class);
    difference(ArrayList.class,List.class);
    difference(LinkedList.class,List.class);
    difference(Queue.class,Collection.class);
    difference(PriorityQueue.class,Queue.class);

    System.out.println("Map: " + methodSet(Map.class));
    difference(HashMap.class,Map.class);
    difference(LinkedHashMap.class,HashMap.class);
    difference(SortedMap.class,Map.class);
    difference(TreeMap.class,Map.class);
  }
}
