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
public class TwoTuple<A,B> {
  public final A first;
  public final B second;

  public TwoTuple(A first, B second) { this.first = first; this.second = second; }

  @Override
  public String toString() {
    return "("+first+", "+second+")";
  }
}
