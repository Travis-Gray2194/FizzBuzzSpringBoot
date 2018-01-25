package me.travisgray.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MainController {


    @RequestMapping("/")
    public String showFizzBuzz(Model model){
        int num;
        int num2;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter number");
        num=keyboard.nextInt();

        System.out.println("Please enter second number");
        num2=keyboard.nextInt();

        String thankyoumessage = "Thank You for Trying Fizz Buzz Program";

        StringBuilder stringb = new StringBuilder();
        String s = stringb.toString();

        //        Start int at one aqnd increase by 2 till reaching 100
        for (num = 1; num <= 100 ; num++) {
            if(num % 3 ==0){
                stringb.append(num);
                stringb.append("Fizz");
                stringb.append("<br/ >");
                System.out.println("Fizz"+s+num);


            }


            if(num % 5 == 0){
                stringb.append(num);
                stringb.append("Buzz");
                stringb.append("<br/ >");
                System.out.println("Buzz"+s+num);


            }


            if (num % 15==0){
                stringb.append(num);
                stringb.append("FizzBuzz");
                stringb.append("<br/ >");
                System.out.println("FizzBuzz"+s+num);
            }

            for (num2 = 1; num2 <= 100; num2++);{
                if(num2 % 3 ==0){
                    stringb.append(num2);
                    stringb.append("Fizz");
                    stringb.append("<br/ >");
                    System.out.println("Fizz"+s+num2);
                }
                if(num2 % 5 == 0){
                    stringb.append(num2);
                    stringb.append("Buzz");
                    stringb.append("<br/ >");
                    System.out.println("Buzz"+s+num2);
                }
                if (num2 % 15==0){
                    stringb.append(num2);
                    stringb.append("FizzBuzz");
                    stringb.append("<br/ >");
                    System.out.println("FizzBuzz"+s+num2);
                }
            }



//            model.addAttribute()
            System.out.println(s);
            model.addAttribute("fizzbuzzoutput",stringb.toString());
        }
        return stringb.toString();
    }
}
