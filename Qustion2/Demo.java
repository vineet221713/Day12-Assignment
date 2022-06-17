package Day12.Assigment.Qustion2;

import Day9.assigment.q2.Parent;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        Demo d1=new Demo();
        Citizen citi=new Citizen();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.next();
        System.out.println("Enter your adhar Number");
        String adhar=sc.next();
        System.out.println("Enter mobile number");
        String mobile=sc.next();


        if(d1.validation(name,adhar,mobile)){
            citi.setName(name);
            citi.setAadharNumber(adhar);
            citi.setMobileNumber(mobile);
            System.out.println(citi.getName());
            System.out.println(citi.getMobileNumber());
            System.out.println(citi.getAadharNumber());
        }



    }


    public boolean validation(String name,String adhar,String mobile){
        if(Pattern.matches("[a-zA-Z]{3,8}",name)){
        }else{
            System.out.println("name should be alphabetic and length should be 3 to 16");
            return false;
        }

       if(Pattern.matches("[\\d]{12}",adhar)) {
       }else {
           System.out.println("adhar should be numaric length should br 12");
           return false;
       }

        if(Pattern.matches("[9876]{1}[0-9]{9}",mobile)) {
        }else {
            System.out.println("mobile number start should 9 8 7 6 length should be 10");
            return false;
        }
        return true;
    }

}
