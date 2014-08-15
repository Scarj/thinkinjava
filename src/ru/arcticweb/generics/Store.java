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

import java.util.ArrayList;
import java.util.Random;

import net.mindview.util.Generator;

/**
 * @author evgeniy
 */

class Product {
  private final int id;
  private String description;
  private double price;

  Product(int id, String description, double price) {
    this.id = id;
    this.description = description;
    this.price = price;
    System.out.println(toString());
  }

  @Override
  public String toString() {
    return "Product{ " + id + ": description=" + description + " $" + price + '}';
  }

  public void priceChange(double change) {
    price+=change;
  }

  public static Generator<Product> generator = new Generator<Product>() {
    private Random random = new Random(47);
    @Override
    public Product next() {
      return new Product(random.nextInt(1000), "Test", Math.round(random.nextDouble()*1000.0) + 0.99);
    }
  };
}

class Shelf extends ArrayList<Product> {
  Shelf(int nProducts)  {
    Generators.fill(this, Product.generator, nProducts);
  }
}

class Aisle extends ArrayList<Shelf> {
  Aisle(int nShelves, int nProducts) {
    for (int i = 0; i < nShelves; i++) {
      add(new Shelf(nProducts));
    }
  }
}

class CheckoutStand { }
class Office { }

public class Store extends ArrayList<Aisle> {
  private ArrayList<CheckoutStand> checkouts = new ArrayList<CheckoutStand>();
  private Office office = new Office();

  public Store(int nAisles, int nShelves, int nProducts) {
    for (int i = 0; i < nAisles; i++) {
      add(new Aisle(nShelves,nProducts));
    }
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    for (Aisle aisle: this) {
      for (Shelf shelf: aisle) {
        for (Product product: shelf) {
          result.append(product);
          result.append("\n");
        }
      }
    }
    return result.toString();
  }

  public static void main(String[] args) {
    System.out.println(new Store(14,5,10));
  }
}
