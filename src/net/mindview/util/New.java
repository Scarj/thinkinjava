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

import java.util.*;

/**
 * @author evgeniy
 */
public class New {
  public static <K,V> Map<K,V> map() {
    return new HashMap<K, V>();
  }

  public static <T> List<T> list() {
    return new ArrayList<T>();
  }

  public static <T> LinkedList<T> lList() {
    return new LinkedList<T>();
  }

  public static <T> Set<T> set() {
    return new HashSet<T>();
  }

  public static <T> Queue<T> queue() {
    return new LinkedList<T>();
  }

  public static void main(String[] args) {
    Map<String, List<String>> sls = New.map();
    List<String> ls = New.list();
    LinkedList<String> lls = New.lList();
    Set<String> ss = New.set();
    Queue<String> qs = New.queue();
  }
}


