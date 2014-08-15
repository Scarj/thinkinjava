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
public class LinkedStack<T> {
  private static class Node<U> {
    U item;
    Node<U> next;
    Node() { item = null; next = null; }

    Node(U item, Node<U> next) {
      this.item = item;
      this.next = next;
    }

    boolean end() {
      return item==null && next == null;
    }
  }

  private Node<T> top = new Node<T>();

  public void push(T item) {
    top = new Node<T>(item,top);
  }

  public T pop() {
    T result = top.item;
    if(!top.end())
      top = top.next;
    return result;
  }

  public static void main(String[] args) {
    LinkedStack<String> lss = new LinkedStack<String>();
    for (String s: "Phasers on stun!".split(" "))
      lss.push(s);
    String s;
    while ((s = lss.pop()) != null )
      System.out.println(s);
  }
}
