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

import net.mindview.util.Generator;

/**
 * @author evgeniy
 */

class Customer {
  private static long counter = 1;
  private final long id = counter++;

  Customer() { }

  @Override
  public String toString() {
    return "Customer{" + "id=" + id + '}';
  }

  public static Generator<Customer> generator() {
    return new Generator<Customer>() {
      @Override
      public Customer next() {
        return new Customer();
      }
    };
  }
}

class Teller {
  private static long counter = 1;
  private final long id = counter++;

  Teller() { }
  @Override
  public String toString() { return "Teller{" + "id=" + id + '}'; }
  public static Generator<Teller> generator = new Generator<Teller>() {
    @Override
    public Teller next() {
      return new Teller();
    }
  };
}

public class BankTeller {
  public static void serve(Teller teller, Customer customer) {
    System.out.println(teller + " обслуживает " + customer);
  }

  public static void main(String[] args) {
    Random random = new Random(47);
    Queue<Customer> line = new LinkedList<Customer>();
    Generators.fill(line,Customer.generator(),15);
    List<Teller> tellers = new ArrayList<Teller>();
    Generators.fill(tellers,Teller.generator,4);
    for (Customer c: line) {
      serve(tellers.get(random.nextInt(tellers.size())),c);
    }
  }
}
