package com.company;

public class Main {

  public static void main(String[] args) {

    Person person1 = new Person("Kirill", 18, 71, 125, " Yellow", " White", "Europe", true);

//person1.introduce();
//
    Person person2 = new Person("Sonya", 19, 111, 176, " Green", " White", "europ", false);
//person2.introduce();
//
    Person person3 = new Person("Saiman", 25, 78, 183, " Green", " White", "Afro", true);
//person3.introduce();
//
    Person person4 = new Person("Alex", 22, 227, 111, " Purple", " black", "Mongol", true);
//person4.introduce();
    Person person5 = new Person("Mixael", 7, 30, 112, " Blue", " White", "Europe", true);
//        person5.introduce();
//
//        System.out.println("Количество мужского пола = " +Person.getCount1()+ "," + "Кол-во женского пола = " + Person.getCount2());

    int[] personListAnniversary = {person1.getNumberOfAnniversaryBeforePension(),
        person2.getNumberOfAnniversaryBeforePension(),
        person3.getNumberOfAnniversaryBeforePension(),
        person4.getNumberOfAnniversaryBeforePension(),
        person5.getNumberOfAnniversaryBeforePension(),};
    Person.printAnniversary(personListAnniversary);

    String[] personListNames = {person1.name, person2.name, person3.name, person4.name,
        person5.name};
    Person.printNames(personListNames);

    int[] personListAges = {person1.getAge(), person2.getAge(), person3.getAge(), person4.getAge(),
        person5.getAge()};
    Person.selectSortUp(personListAges);


  }
}
