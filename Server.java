package com.Collections;

import java.rmi.Naming;

public class Server {

    public Server(){

        try{
            CalculatorActual myCalculator = new CalculatorActual();
            Naming.rebind("rmi://localhost/BrettsCalculator", myCalculator);
            System.out.println("Server is ready.");

        }catch (Exception e){
            System.out.println("Server failed. " +e);
        }

    }

    public static void main(String[] args) {


        new Server();

    }



}
