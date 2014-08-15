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

/**
 * @author evgeniy
 */
public class Tuple {
  public static <A,B> TwoTuple<A,B> tuple(A a, B b) {
    return new TwoTuple<A, B>(a, b);
  }

  public static <A,B,C> ThreeTuple<A,B,C> tuple(A a,B b, C c) {
    return new ThreeTuple<A, B, C>(a,b,c);
  }

  public static <A,B,C,D> FourTuple<A,B,C,D> tuple(A a, B b,C c, D d) {
    return new FourTuple<A, B, C, D>(a,b,c,d);
  }

  public static <A,B,C,D,E> FiveTuple<A,B,C,D,E> tuple(A a, B b,C c, D d, E e) {
    return new FiveTuple<A, B, C, D, E>(a,b,c,d,e);
  }
}
