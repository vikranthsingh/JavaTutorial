package com.company;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
        String s = format.format(localDateTime);
        System.out.println(s);*/

        /*SimpleDateFormat formatter = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        String result = formatter.format(calendar.getTime());
        System.out.println(result);*/

        /*String name = " ";
        System.out.println(name.isEmpty());*/

        //int a = 6;
        //a = a + 2;  //8
        //a += 2;     //8
        //a = a+1;    //7
        //a++;

        //a = a-2;       //4
        //a-=2;          //4
        //a = a-1;        //5
        //a--;
        //System.out.println(a);


       /* int a = 2;
        int b = 7;
        switch (a){
            case 1 :
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
        }*/
      /*  int a = 2;
        int b = 7;
        boolean answer = a == b;
        if (answer){
            //System.out.println("true");
        }
        switch (a){
            case 2 :
                System.out.println("2");
                break;
            case 1:
                System.out.println("1");
                break;
        }*/
       /*
        for (i=0;i<=5;i++){
            //System.out.println("Hello: " + i);
        }*/

       /* int i=0;
        while (i<5){
            System.out.println("Hello: " + i);
            i++;
        }*/
        /*int i = 6;
        do {
            System.out.println("Hello " + i);
            i++;
        }while (i<5);*/
        //Ternary operator
       /* int a = 11;
        String time = a < 12 ? "Morning" : "Afternoon;";
        System.out.println(time);*/
        /*int[] b = {1, 2, 3, 4, 5};
        for (int a : b
             ) {
            System.out.println(a);
        }*/
        /*System.out.println("Enter a message :");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        System.out.println("Answer is : " + a);*/

        System.out.println("\t\t**** \tWelcome\t ****\n");
        System.out.println("Enter Username: ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello " + userName);

        System.out.println("Should we start the Game");
        System.out.println("\t1.Yes");
        System.out.println("\t2.No");

        int answer = scanner.nextInt();
        while (answer != 1) {
            System.out.println("Should we start the Game");
            System.out.println("\t1.Yes");
            System.out.println("\t2.No");
            answer = scanner.nextInt();
        }
        Random random = new Random();
        int randomNumber = random.nextInt(20) + 1;
        System.out.println("Guess a number: ");

        int timeTried = 0;
        boolean hasWon = false;
        boolean shouldFinish = false;

        int guess = scanner.nextInt();
        if (randomNumber != guess) {
            System.out.println("Try Again");
            for (int a = 1; a < 5; a++){
                guess = scanner.nextInt();
                System.out.println("Wrong attempt " + a);
            }
            System.out.println("Exit");
        } else {
            System.out.println("Congratulation you guessed it correct");
        }

    }
}
