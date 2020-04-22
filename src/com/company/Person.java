package com.company;

import java.util.Arrays;

public class Person {

  final private static int yearsTo = 65;
  public static int ID;
  private static int count1;
  private static int count2;
  String name;
  private int age;
  private double weight;
  private String colorOfSkin;
  private String colorOfEyes;
  private double length;
  private double index;
  private String constitution;
  private String rase;
  private String lengthBigOrSmall;
  private boolean sex;
  private int numberOfAnniversaryBeforePension = 0;
  private int yearsAtThisMoment = 65;


  public Person(String name, int age, double weight, double length, String colorOfEyes,
      String colorOfSkin, String rase, boolean sex) {
    ID++;
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.colorOfEyes = colorOfEyes;
    this.colorOfSkin = colorOfSkin;
    this.sex = sex;
    this.length = length;
    this.rase = rase;
    if (sex) {
      count1++;
    } else {
      count2++;
    }
  }

//    public void introduce() {
//        String s1 = " Меня зовут " + name.toUpperCase() + "," + " мне " + age + " лет," + " я вешу " + weight + " kg," + "Рост - " + length + ", " + " у меня цвет глаза - " + colorOfEyes + ", " + "цвет кожи - " + colorOfSkin;
//        if (sex) {
//            System.out.println(s1 + ", " + "Раса - " + checkRace() + "- Man " + ID + "; " + checkAll() + "; " + chekWeight()+ ", " +checkLength());
//        } else {
//            System.out.println(s1 + ", " + "Раса - " + checkRace() + "- Vooman " + ID + "; " + checkAll() + "; " + chekWeight()+", " +checkLength());
//        }
//
//    }
//

//    String chekWeight() {
//        index = weight / (length * length / 10000);
//        if (index < 18.5) {
//            constitution = "Телосложение тощее";
//        } else if (index >= 18.5 && index <= 25) {
//            constitution = "Телосложение нормальное";
//        } else if (index > 25) {
//            constitution = "Лишний вес";
//        }
//        return constitution;
//
//    }
//
//    public static int getCount1() {
//        return count1;
//    }
//
//    public static int getCount2() {
//        return count2;
//    }
//
//    public String checkRace() {
//
//        switch (rase) {
//            case "Europe":
//                rase = "Europe";
//                break;
//            case "Mongol":
//                rase = "Mongol";
//                break;
//            case "Afro":
//                rase = "Afro";
//                break;
//            default:
//                rase = "Other planet, may be inoplanetynen";
//        }
//
//        return rase;
//    }

//    public String chekStatus() {
//        String che1 = "НЕ совершеннолетний";
//        String che2 = "Совершеннолетний";
//        if (age < 18 && age > 0) {
//            return che1;
//        } else if (age >= 18) {
//            return che2;
//        }
//        return "";
//    }
//
//    public String checkPension() {
//        int x = yearsTo - age;
//        String s2 = "Вы ввели отрицательный возраст";
//        String s = "до пенсии " + x;
//        String god = " год";
//        String god2 = " года";
//        String god3 = " лет";
//        String str = " уже на пенсии";
//        if (x == 1) {
//
//            return s + god;
//        } else if (x >= 2 && x <= 4) {
//
//            return s + god2;
//        } else if (x >= 5 && x <= 19) {
//
//            return s + god3;
//        } else if (x > 0 && x < 65 && x % 10 == 0) {
//
//            return s + god3;
//        } else if (x <= 65 && x % 10 == 1) {
//
//            return s + god;
//        } else if (x <= 65 && (x % 10 == 2 || x % 10 == 3 || x % 10 == 4)) {
//
//            return s + god2;
//        } else if (x > 0 && x <= 65) {
//
//            return s + god3;
//        } else if (x <= 0) {
//            return str;
//        } else {
//            return s2;
//        }
//    }
//
//    public String checkAll() {
//        String sos = chekStatus() + ", " + checkPension();
//        return sos;
//    }

//
//    public String checkLength() {
//        if (age <= 11 && age >= 8) {
//            if (length >= 80 && length <= 120) {
//                lengthBigOrSmall = "Нормальный рост";
//            }
//            if (length < 80) {
//                lengthBigOrSmall = "Низкий рост";
//            }
//            if (length > 120) {
//                lengthBigOrSmall = "Высокий рост";
//            }
//
//        } else {
//            if (age < 8) {
//                lengthBigOrSmall = " Ещё вырастет:))";
//            } else if (age > 11 && age < 18) {
//                if (length >= 150 && length <= 180) {
//                    lengthBigOrSmall = "Нормальный рост";
//                }
//                if (length < 150) {
//                    lengthBigOrSmall = "Низкий рост";
//                }
//                if (length > 180) {
//                    lengthBigOrSmall = "Высокий рост";
//                }
//            } else {
//                if (age >= 18 && sex) {
//                    if (length >= 170 && length <= 185) {
//                        lengthBigOrSmall = "Нормальный кент";
//                    }
//                    if (length < 170) {
//                        lengthBigOrSmall = "Низкий кент";
//                    }
//                    if (length > 185) {
//                        lengthBigOrSmall = "Высокий кент";
//                    }
//                } else if (age >= 18) {
//                    if (length >= 160 && length <= 175) {
//                        lengthBigOrSmall = "Нормальный рост";
//                    }
//
//                    if (length < 160) {
//                        lengthBigOrSmall = "Низкая цыпуля";
//                    }
//
//                    if (length > 175) {
//                        lengthBigOrSmall = "Высокая цыпуля";
//                    }
//                }
//            }
//        }
//
//return lengthBigOrSmall;
//    }

  public static void selectSortUp(int[] arr) {
    System.out.println(Arrays.toString(arr));
    for (int i = 0; i < arr.length; i++) {
      int max = arr[i];
      int maxIndex = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < max) {
          max = arr[j];
          maxIndex = j;
        }
      }
      if (i != maxIndex) {
        int empty = arr[i];
        arr[i] = max;
        arr[maxIndex] = empty;
      }
    }
    System.out.println(Arrays.toString(arr));
  }

  public static void printNames(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
    }
    System.out.println(Arrays.toString(arr));
  }

  public static void printAnniversary(int[] arr) {
    for (int element : arr) {
      System.out.println(element);
    }
  }

  public int getNumberOfAnniversaryBeforePension() {

    do {
      yearsAtThisMoment = yearsAtThisMoment - 5;
      numberOfAnniversaryBeforePension++;
    }
    while (yearsAtThisMoment >= age);
    return numberOfAnniversaryBeforePension;
  }

  public int getAge() {
    return age;
  }


}





