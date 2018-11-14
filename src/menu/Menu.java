
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;
import java.io.*;
import java.io.IOException;

/**
 *
 * @author User
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int loginSelect;
        do {
            loginSelection();
            loginSelect = input.nextInt();

            if (loginSelect == 1 || loginSelect == 2) {
                if (loginSelect == 1) {
                    LoginPassword();
                } else if (loginSelect == 2) {
                    Register();
                }
            } else {
                System.out.println("\n !!!!!!Please Enter 1 OR 2 !!!!!!!!! \n");
            }

        } while (loginSelect != 1 && loginSelect != 2);
    }

    public static void loginSelection() {

        System.out.println("==================\n Flower Shop \n================");
        System.out.println("1. LOGIN");
        System.out.println("2. REGISTER");

        System.out.print("Please Enter Your Selection : ");

    }

    public static void LoginPassword() {
        String UserName;
        String Password;
        Scanner Verifylogin = new Scanner(System.in);
        System.out.println("============\n LOGIN \n ============");
        System.out.print("USERNAME  : ");
        UserName = Verifylogin.nextLine();
        System.out.print("PASSWORD  : ");
        Password = Verifylogin.nextLine();
    }

    public static void Register() throws Exception {
        String RUserName;
        String RIC;
        String PhoneNumber;
        int CustomerType;
        int CreditLimit;
        Scanner Register = new Scanner(System.in);
        Scanner Ctype = new Scanner(System.in);
        System.out.println("==============\n Register \n===============");
        System.out.print("USERNAME     : ");
        RUserName = Register.nextLine();
        System.out.print("IC           : ");
        RIC = Register.nextLine();
        System.out.print("Phone Number : ");
        PhoneNumber = Register.nextLine();
        System.out.println("CUSTOMER TYPE : ");
        System.out.println("1. Consumer  ");
        System.out.println("2. Corporate Customer ");
        System.out.print("Please Enter Your Selection : ");
        CustomerType = Ctype.nextInt();
        do {
            if (CustomerType == 1 || CustomerType == 2) {
                if (CustomerType == 1) {
                    File consumer = new File("Consumer.txt");
                    FileWriter fileWritterConsumer = new FileWriter(consumer.getName(), true);
                    PrintWriter printWriterConsumer = new PrintWriter(fileWritterConsumer);
                    printWriterConsumer.println(RUserName + "," + RIC + "," + PhoneNumber + "," + "Consumer");
                    printWriterConsumer.flush();
                    printWriterConsumer.close();
                } 
                
                if (CustomerType == 2) {
                
                System.out.print("Enter Monthly Credit Limit : ");
                CreditLimit = Ctype.nextInt();
                File corporate = new File("Corporate.txt");
                FileWriter fileWritterCorporate = new FileWriter(corporate.getName(), true);
                PrintWriter printWriterCorporate = new PrintWriter(fileWritterCorporate);
                printWriterCorporate.println(RUserName + "," + RIC + "," + PhoneNumber + "," + "Corporate" + "," + CreditLimit);
                printWriterCorporate.flush();
                printWriterCorporate.close();    
                }

            } 
            
            else {
                System.out.println("\n !!!!!!Please Enter 1 OR 2 !!!!!!!!! \n");
            }
        } while (CustomerType != 1 && CustomerType != 2);

    }

//    public static void CustomerType() throws Exception {
//        Scanner Ctype = new Scanner(System.in);
//        int CustomerType;
//        int CreditLimit;
//        System.out.println("CUSTOMER TYPE : ");
//        System.out.println("1. Consumer  ");
//        System.out.println("2. Corporate Customer ");
//        System.out.print("Please Enter Your Selection : ");
//        CustomerType = Ctype.nextInt();
//        do {
//            if (CustomerType == 1 || CustomerType == 2) {
//                if (CustomerType == 1) {
//                    File consumer = new File("Consumer.txt");
//                    FileWriter fileWritterConsumer = new FileWriter(consumer.getName(), true);
//                    PrintWriter printWriterConsumer = new PrintWriter(fileWritterConsumer);
////                    printWriterConsumer.print(RUserName);
//                    printWriterConsumer.flush();
//                    printWriterConsumer.close();
//                } 
//                
//                if (CustomerType == 2) {
//                
//                System.out.print("Enter Monthly Credit Limit : ");
//                CreditLimit = Ctype.nextInt();
////            File CorporateCustomer = new File("CorporateCustomer.txt");
//                }
//
//            } 
//            
//            else {
//                System.out.println("\n !!!!!!Please Enter 1 OR 2 !!!!!!!!! \n");
//            }
//        } while (CustomerType != 1 && CustomerType != 2);
//    }

    public static void ConfirmStatement() {
        int confirm;
        Scanner input2 = new Scanner(System.in);
        System.out.println("1. Confirm ");
        System.out.println("2. Exit");
        System.out.print("Please Enter Your Selection  : ");
        confirm = input2.nextInt();

        if (confirm == 1) {

        } else if (confirm == 2) {

        }
    }

}
