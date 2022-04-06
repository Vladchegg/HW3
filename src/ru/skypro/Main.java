package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// Задача 1

     int clientOs = 0;

     if (clientOs == 0) {
         System.out.println("Установите версию приложения для iOS по ссылке");
     }
     if (clientOs == 1) {
         System.out.println("Установите версию приложения для Android по ссылке");
     }

     // Задача 2

     int clientDeviceYear = 2015;

     if (clientOs == 0 && clientDeviceYear < 2015) {
         System.out.println("Установите облегченную версию приложения для iOS по ссылке");
     } else if (clientOs == 0 && clientDeviceYear >= 2015){
         System.out.println("Установите версию приложения для iOS по ссылке");
     }
     if (clientOs == 1 && clientDeviceYear < 2015) {
         System.out.println("Установите облегченную версию приложения для Android по ссылке");
     } else if (clientOs == 1 && clientDeviceYear >= 2015) {
         System.out.println("Установите версию приложения для Android по ссылке");
     }

     //Задача 3

     int year = 1700;

     if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
         System.out.println(year + " год является високосным");
     } else {
         System.out.println(year + " год не является високосным");
     }

     //Задача 4

     int deliveryDistance = 110;
     int deliveryDays = 1;
     if (deliveryDistance <=20) {
         System.out.println("На доставку потребуется дней: " + deliveryDays);
     } else if (deliveryDistance <=60) {
         System.out.println("На доставку потребуется дней: " + (deliveryDays + 1));
     } else if (deliveryDistance <=100) {
         System.out.println("На доставку потребуется дней: " + (deliveryDays + 2));
     } else if (deliveryDistance >100) {
            System.out.println("К сожалению, доставка невозможна");
        }

     //Задача 5
     int monthNumber = 15;

     switch (monthNumber) {
         case 12:
         case 1:
         case 2:
             System.out.println("Зима");
             break;
         case 3:
         case 4:
         case 5:
             System.out.println("Весна");
             break;
         case 6:
         case 7:
         case 8:
             System.out.println("Лето");
             break;
         case 9:
         case 10:
         case 11:
             System.out.println("Осень");
             break;
         default:
             System.out.println("Не существует");
     }


         }

    }

