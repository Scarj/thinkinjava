package ru.arcticweb.typeinfo.pets;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator
{

  private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();
  private static String[] typeNames =
          {
                  "ru.arcticweb.typeinfo.pets.Mutt",
                  "ru.arcticweb.typeinfo.pets.Pug",
                  "ru.arcticweb.typeinfo.pets.EgyptianMau",
                  "ru.arcticweb.typeinfo.pets.Manx",
                  "ru.arcticweb.typeinfo.pets.Cymric",
                  "ru.arcticweb.typeinfo.pets.Rat",
                  "ru.arcticweb.typeinfo.pets.Mouse",
                  "ru.arcticweb.typeinfo.pets.Hamster"
          };

  @SuppressWarnings("unchecked")
  private static void loader()
  {
    try
    {
      for (String name : typeNames)
        types.add((Class<? extends Pet>) Class.forName(name));
    }
    catch (ClassNotFoundException e)
    {
      throw new RuntimeException(e);
    }
  }

  static
  {
    loader();
  }

  @Override
  public List<Class<? extends Pet>> types()
  {
    return types;
  }
}
