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

import static net.mindview.util.Print.print;
import static net.mindview.util.Sets.*;

import java.util.EnumSet;
import java.util.Set;

/**
 * @author evgeniy
 */
public class WatercolorSets {
  public static void main(String[] args) {
    Set<Watercolors> set1 = EnumSet.range(Watercolors.BRILLIANT_RED, Watercolors.VIRIDIAN_HUE);
    Set<Watercolors> set2 = EnumSet.range(Watercolors.CERULEAN_BLUE_HUE,Watercolors.BURNT_UMBER);

    print("set1: " + set1);
    print("set2: " + set2);

    print("union(set1,set2): " + union(set1,set2));

    Set<Watercolors> subset = intersection(set1,set2);

    print("interesection: " + subset);

    print("difference1: " + difference(set1,subset));
    print("difference2: " + difference(set2,subset));

    print("complement: " + complement(set1,set2));
  }
}
