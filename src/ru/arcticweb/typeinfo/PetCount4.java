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
import static net.mindview.util.Print.printnb;

import net.mindview.util.TypeCounter;

import ru.arcticweb.typeinfo.pets.*;

/**
 * @author evgeniy
 */
public class PetCount4
{
  public static void main(String[] args)
  {
    TypeCounter counter = new TypeCounter(Pet.class);
    for (Pet pet: Pets.createArray(20)) {
      printnb(pet.getClass().getSimpleName() + " ");
      counter.count(pet);
    }
    print();
    print(counter);
  }
}
