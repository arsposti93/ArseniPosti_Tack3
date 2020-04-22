package com.company;

public class PersonList {

  static Person[] personList;

  public static Person[] addPerson(Person person) {
    if (personList == null) {
      personList  = new Person[1];
      personList[0] = person;

      return personList;
    }

    Person[] newPersonList = new Person[personList.length + 1];

    for (int i = 0; i < personList.length; i++) {
      newPersonList[i] = personList[i];
    }
    newPersonList[personList.length] = person;
    personList = newPersonList;

    return newPersonList;
  }

  public static void printPersonList() {
    for (Person person : personList) {
      System.out.println(person.toString());
    }
  }
}