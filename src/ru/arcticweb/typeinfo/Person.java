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

import net.mindview.util.Null;

/**
 * @author evgeniy
 */
class Person {
  public final String first;
  public final String last;
  public final String address;

  Person(String first, String last, String address) {
    this.first = first;
    this.last = last;
    this.address = address;
  }

  @Override
  public String toString() {
    return "Person: " + first + " " + last + " " + address;
  }

  public static class NullPerson extends Person implements Null {

    public NullPerson() {
      super("None", "None", "None");
    }

    @Override
    public String toString()
    {
      return "NullPerson";
    }
  }

  public static final Person NULL = new NullPerson();
}
