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

import java.util.*;

/**
 * @author evgeniy
 */

class Frob { }
class Fnorkle { }
class Quark<Q> { }
class Particle<POSITION,MOMENTUM> { }

public class LostInformation {
  public static void main(String[] args) {
    List<Frob> list = new ArrayList<Frob>();
    Map<Frob,Fnorkle> map = new HashMap<Frob, Fnorkle>();
    Quark<Fnorkle> quark = new Quark<Fnorkle>();
    Particle<Long, Double> p = new Particle<Long, Double>();
    System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
    System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
    System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));
    System.out.println(Arrays.toString(p.getClass().getTypeParameters()));
  }
}
