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

package ru.arcticweb.typeinfo.pets;

import java.util.LinkedHashMap;
import java.util.Map;

import net.mindview.util.MapData;

/**
 * @author evgeniy
 */

public class PetCount3
{
  static class PetCounter extends LinkedHashMap<Class<? extends Pet>, Integer> {
    PetCounter()
    {
      super(MapData.map(LiteralPetCreator.allTypes, 0));
    }

    public void count(Pet pet) {
      for (Map.Entry<Class<? extends Pet>,Integer> pair : entrySet()) {
        if (pair.getKey().isInstance(pet)) {
          put(pair.getKey(),pair.getValue()+1);
        }
      }
    }

    public String toString() {
      StringBuilder result = new StringBuilder("{");
      for (Map.Entry<Class<? extends Pet>,Integer> pair: entrySet()){
        result.append(pair.getKey().getSimpleName());
        result.append("=");
        result.append(pair.getValue());
        result.append(", ");
      }
      result.delete(result.length()-2,result.length());
      result.append("}");
      return result.toString();
    }

    public static void main(String[] args)
    {
      PetCounter petCount = new PetCounter();
      for (Pet pet: Pets.createArray(20)) {
        System.out.println(pet.getClass().getSimpleName()+ " ");
        petCount.count(pet);
      }
      System.out.println();
      System.out.println(petCount);

    }
  }
}
