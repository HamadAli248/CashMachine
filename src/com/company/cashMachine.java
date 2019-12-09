package com.company;

import java.util.Scanner;

public class cashMachine {

    public void checkingPin() {

        int pin = 2341;
        int balance = 2000;
        int userPinInput;
        int userActionInput;
        int withdrawInput;
        int depositInput;
        Scanner input = new Scanner(System.in);


            System.out.println("Please enter Your Pin");
            userPinInput = input.nextInt();
            while(userPinInput != pin){
                System.out.println("Incorrect pin");
                userPinInput = input.nextInt();
            }

            System.out.println("Pin Accepted");
            System.out.println("What would you like to do?");
            System.out.println("1 Check Balance");
            System.out.println("2 Withdraw Cash");
            System.out.println("3 Deposit Card");
            System.out.println("4 Return Card");
            userActionInput = input.nextInt();

            if ( userActionInput == 1){
                System.out.println("Your Balance is "+balance);
            } else if(userActionInput == 2){
                System.out.println("How much would you like to Withdraw?");
                withdrawInput = input.nextInt();
                if (withdrawInput < balance){
                    System.out.println("Withdraw accepted please take cash amount of " + withdrawInput + "You new balance is " + (balance - withdrawInput));

                } else {
                    System.out.println("You Balance is Not enough");
                }
            } else if ( userActionInput == 3){
                System.out.println("How much would You like to deposit?");
                depositInput = input.nextInt();
                System.out.println("You cash has been deposited. You new balance is " + (balance+depositInput));
            }else if (userActionInput == 4 ){
                System.out.println("Please take your card");
            } else {
                System.out.println("Incorrect input ");
                System.out.println("What would you like to do?");
                System.out.println("1 Check Balance");
                System.out.println("2 Withdraw Cash");
                System.out.println("3 Deposit Card");
                System.out.println("4 Return Card");
                userActionInput = input.nextInt();
            }
        }

    }

