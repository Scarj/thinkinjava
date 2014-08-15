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

/**
 * @author evgeniy
 */
public class Position {
  private String title;
  private Person person;

  public Position(String jobTitle, Person employee) {
      this.title = jobTitle;
      this.person = employee;
      if(person == null)
        person = Person.NULL;
  }

  public Position(String title) {
    this.title = title;
    person = Person.NULL;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String newTitle) {
    this.title = newTitle;
  }

  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
    if(person == null)
      person = Person.NULL;
  }

  @Override
  public String toString() {
    return "Position: " + title + " " + person;
  }
}
