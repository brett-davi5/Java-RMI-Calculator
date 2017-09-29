package com.Collections;

import java.rmi.Naming;

public class Server {

    public Server(){

        try{
            CalculatorActual myCalculator = new CalculatorActual();
            Naming.rebind("rmi://10.0.0.8/BrettsCalculator", myCalculator);
            System.out.println("Server is ready.");

        }catch (Exception e){
            System.out.println("Server failed. " +e);
        }

    }

    public static void main(String[] args) {


        new Server();

    }



}
