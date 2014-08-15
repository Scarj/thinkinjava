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

import java.awt.Color;

/**
 * @author evgeniy
 */

class HoldItem<T> {
  T item;

  HoldItem(T item) {
    this.item = item;
  }

  public T getItem() {
    return item;
  }
}

class Colored2<T extends HasColor> extends HoldItem<T> {

  Colored2(T item) {
    super(item);
  }

  Color color() {
    return item.getColor();
  }
}

class ColoredDimension2<T extends Dimension & HasColor> extends Colored2<T> {

  ColoredDimension2(T item) {
    super(item);
  }

  int getX() { return item.x; }
  int getY() { return item.y; }
  int getZ() { return item.z; }
}

class Solid2<T extends Dimension & HasColor & Weight> extends ColoredDimension2<T> {
  Solid2(T item) {
    super(item);
  }

  int weight() { return item.weight(); }
}

public class InheritBounds {
  public static void main(String[] args)
  {
    Solid2<Bounded> solid2 = new Solid2<Bounded>(new Bounded());
    solid2.color();
    solid2.getY();
    solid2.getZ();
    solid2.weight();
  }
}
