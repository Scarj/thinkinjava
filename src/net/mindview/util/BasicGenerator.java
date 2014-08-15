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

import net.mindview.util.Generator;

/**
 * @author evgeniy
 */
public class BasicGenerator<T> implements Generator<T> {

  private Class<T> type;
  public BasicGenerator(Class<T> type) { this.type = type; }

  @Override
  public T next() {
    try {
      return type.newInstance();
    }
    catch (Exception e) {
      throw new RuntimeException();
    }
  }

  public static <T> Generator<T> create(Class<T> type) {
    return new BasicGenerator<T>(type);
  }
}
