/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;

/** ******************************************************************************************
 * Author: Hannah Sofwah Mohd Kadafi
 * Program Name: result
 * Description: To write a student information system
 * Date: 14 October 2026
 * Modified Date: None
 * Version: 1.0
 ******************************************************************************************* */
public class StudentInformationSystem {

    public static void main(String[] args) {
        
        String studentName = "Hannah Sofwah";
        String studentID = "S87419";

        double mark1 = 42.5;
        double mark2 = 38.0;

        double total = mark1 + mark2;

        System.out.println("Student Name : " + studentName);
        System.out.println("Student ID   : " + studentID);

        System.out.println("Mark 1       : " + mark1);
        System.out.println("Mark 2       : " + mark2);

        System.out.println("Total Mark   : " + total);

        if (total >= 80) {
            System.out.println("Message      : Excellent");
        } else if (total >= 50) {
            System.out.println("Message      : Good");
        } else {
            System.out.println("Message      : Needs Improvement");
        }
    }
}

