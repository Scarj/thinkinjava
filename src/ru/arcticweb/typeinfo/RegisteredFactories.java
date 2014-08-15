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

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ru.arcticweb.typeinfo.factory.Factory;

/**
 * @author evgeniy
 */

class Part {
  @Override
  public String toString() {
    return getClass().getSimpleName();
  }

  static List<Factory<? extends Part>> partFactories = new ArrayList<Factory<? extends Part>>();

  static {
    partFactories.add(new FuelFilter.Factory());
    partFactories.add(new AirFilter.Factory());
    partFactories.add(new CabinAirFilter.Factory());
    partFactories.add(new OilFilter.Factory());
    partFactories.add(new FanBelt.Factory());
    partFactories.add(new PowerSteeringBelt.Factory());
    partFactories.add(new GeneratorBelt.Factory());
  }

  private static Random random = new Random(47);
  public static Part createRandom() {
    int n = random.nextInt(partFactories.size());
    return partFactories.get(n).create();
  }

}

class Filter extends Part { }

class FuelFilter extends Filter {
  public static class Factory implements ru.arcticweb.typeinfo.factory.Factory<FuelFilter> {

    @Override
    public FuelFilter create() { return new FuelFilter(); }
  }
}

class AirFilter extends Filter {
  public static class Factory implements ru.arcticweb.typeinfo.factory.Factory<AirFilter>{

    @Override
    public AirFilter create()
    {
      return new AirFilter();
    }
  }
}

class CabinAirFilter extends Filter {

  public static class Factory implements ru.arcticweb.typeinfo.factory.Factory<CabinAirFilter>
  {
    @Override
    public CabinAirFilter create()
    {
      return new CabinAirFilter();
    }
  }
}

class OilFilter extends Filter {
  public static class Factory implements ru.arcticweb.typeinfo.factory.Factory<OilFilter> {

    @Override
    public OilFilter create()
    {
      return new OilFilter();
    }
  }
}

class Belt extends Part {

}

class FanBelt extends Belt {
  public static class Factory implements ru.arcticweb.typeinfo.factory.Factory<FanBelt> {

    @Override
    public FanBelt create()
    {
      return new FanBelt();
    }
  }
}

class GeneratorBelt extends Belt {
  public static class Factory implements ru.arcticweb.typeinfo.factory.Factory<GeneratorBelt> {

    @Override
    public GeneratorBelt create()
    {
      return new GeneratorBelt();
    }
  }
}


class PowerSteeringBelt extends Belt {
  public static class Factory implements ru.arcticweb.typeinfo.factory.Factory<PowerSteeringBelt> {

    @Override
    public PowerSteeringBelt create()
    {
      return new PowerSteeringBelt();
    }
  }
}


public class RegisteredFactories {
  public static void main(String[] args)
  {
    for (int i = 0; i < 10; i++) {
      System.out.println(Part.createRandom());
    }
  }
}