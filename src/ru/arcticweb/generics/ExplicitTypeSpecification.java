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

import java.util.List;
import java.util.Map;

import net.mindview.util.New;

import ru.arcticweb.typeinfo.pets.Person;
import ru.arcticweb.typeinfo.pets.Pet;

/**
 * @author evgeniy
 */
public class ExplicitTypeSpecification {
  static void f(Map<Person,List<Pet>> petPeople) { }

  public static void main(String[] args) {
    f(New.<Person, List<Pet>>map());
  }
}
