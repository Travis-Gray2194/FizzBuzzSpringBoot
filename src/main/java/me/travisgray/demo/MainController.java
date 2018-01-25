package me.travisgray.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MainController {


    @RequestMapping("/")
    public String showFizzBuzz(){
        int num;
        int num2;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter number");
        num=keyboard.nextInt();

        System.out.println("Please enter second number");
        num2=keyboard.nextInt();

        String thankyoumessage = "Thank You for Trying Fizz Buzz Program";


        //        Start int at one aqnd increase by 2 till reaching 100
        for (num = 1; num <= 100 ; num++) {
            if(num % 3 ==0){
                System.out.println("Fizz");
            }
            if(num % 5 == 0){
                System.out.println("Buzz");
            }
            if (num% 15==0){
                System.out.println("FizzBuzz");

                System.out.println("2nd Number mulitples ");
            }

            for (num2 = 1; num2 <= 100; num2++);{
                if(num % 3 ==0){
                    System.out.println("Fizz");
                }
                if(num % 5 == 0){
                    System.out.println("Buzz");
                }
                if (num% 15==0){
                    System.out.println("FizzBuzz");

                    System.out.println("2nd Number mulitples ");
                }
            }

        }
        return thankyoumessage;
    }
}
