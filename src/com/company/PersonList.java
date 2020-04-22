package com.company;

import java.util.Arrays;

public class PersonList {

  Person[] personList;

  public Person[] addPerson() {

    System.out.println(Arrays.toString(personList));
    return personList;
  }


}
