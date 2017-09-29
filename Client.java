package com.Collections;

import java.rmi.Naming;

public class Client {



    public static void main(String[] args) {

        int test1 = 1;
        int test2 = 12;
        int value = 0;

        try{
            CalculatorInterface myNewCalculator = (CalculatorInterface) Naming.lookup("rmi://10.0.0.8/BrettsCalculator");



            while(test1 < test2){  //multiplication tests
                value = myNewCalculator.mul(test1, test2);
                System.out.println("Multiplication tests: \n " + test1 + " * " + test2 + " = " + value);
                test1++;
            }

            while(test1 < test2){  //addition tests
                value = myNewCalculator.add(test1, test2);
                System.out.println("Addition tests: \n " + test1 + " + " + test2 + " = " + value);
                test1++;
            }

            while(test1 < test2){  //subtraction tests
                value = myNewCalculator.sub(test1, test2);
                System.out.println("Subtraction tests: \n " + test1 + " - " + test2 + " = " + value);
                test1++;
            }

            while(test1 < test2){  //division tests
                value = myNewCalculator.div(test1, test2);
                System.out.println("Division tests: \n " + test1 + " / " + test2 + " = " + value);
                test1++;
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }

}
