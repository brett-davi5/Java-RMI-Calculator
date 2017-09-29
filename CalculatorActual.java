package com.Collections;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.*;
import java.rmi.server.*;

public class CalculatorActual extends UnicastRemoteObject implements CalculatorInterface {


    public CalculatorActual() throws java.rmi.RemoteException{  //constructor
        super();
    }

    public int mul(int alpha, int bravo) throws java.rmi.RemoteException{  //multiplication
        int value = alpha * bravo;
        return value;
    }

    public int add(int alpha, int bravo) throws java.rmi.RemoteException {  //addition
        int value = alpha + bravo;
        return value;
    }

    public int sub(int alpha, int bravo) throws java.rmi.RemoteException { //subtraction
        int value = alpha - bravo;
        return value;
    }

    public int div(int alpha, int bravo) throws java.rmi.RemoteException { //division
            int value = alpha / bravo;  //calculation
            return value;

    }

}
