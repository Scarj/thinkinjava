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

interface HasColor {
  Color getColor();
}

class Colored<T extends HasColor> {
  T item;

  Colored(T item) {
    this.item = item;
  }

  public T getItem() {
    return item;
  }

  Color color() {
    return item.getColor();
  }
}

class Dimension {
  public int x,y,z;
}

class ColoredDimension<T extends Dimension & HasColor> {
  T item;

  ColoredDimension(T item) {
    this.item = item;
  }

  public T getItem() {
    return item;
  }

  Color color() {
    return item.getColor();
  }

  int getX() {
    return item.x;
  }

  int getY() {
    return item.y;
  }

  int getZ() {
    return item.z;
  }
}

interface Weight {
  int weight();
}

class Solid<T extends Dimension & HasColor & Weight> {
  T item;

  Solid(T item) {
    this.item = item;
  }

  public T getItem() {
    return item;
  }

  Color color() {
    return item.getColor();
  }

  int getX() { return item.x; }
  int getY() { return item.y; }
  int getZ() { return item.z; }
  int weight() { return item.weight(); }
}

class Bounded extends Dimension implements HasColor, Weight {

  @Override
  public Color getColor() { return null; }
  @Override
  public int weight() { return 0; }
}

public class BasicBounds {
  public static void main(String[] args)
  {
    Solid<Bounded> solid = new Solid<Bounded>(new Bounded());
    solid.color();
    solid.getY();
    solid.weight();
  }
}
