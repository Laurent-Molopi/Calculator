/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator_application;

import javax.swing.JOptionPane;

/**
 *
 * @author south
 */
public class Calculator_Application {

    public static void main(String[] args) 
    {
    // Prompt the user to enter the first number and parse it to a double
    double num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter a Number"));
    
    // Prompt the user to enter the second number and parse it to a double
    double num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter a Number"));
    
    int choices; // Variable to store the user's choice of operation

    // Begin a do-while loop to repeat until the user chooses to exit (choice 0)
    do {
        // Prompt the user to choose an operation
        choices = Integer.parseInt(JOptionPane.showInputDialog("Choose an Operator: \n1. Add"
                + "\n2. Subtract \n3. Multiply \n4. Divide"));
        
        // Switch statement to handle the selected operation
        switch (choices) {
        
        case 1: // Case for addition
            JOptionPane.showMessageDialog(null, "Result: \n" + (num1 + num2));
            break;

        case 2: // Case for subtraction
            JOptionPane.showMessageDialog(null, "Result: \n" + (num1 - num2));
            break;
        
        case 3: // Case for multiplication
            JOptionPane.showMessageDialog(null, "Result: \n" + (num1 * num2));
            break;
        
        case 4: // Case for division
            JOptionPane.showMessageDialog(null, "Result: \n" + (num1 / num2));
            break;
        
        case 0: // Case to end the program
            JOptionPane.showMessageDialog(null, "End.....");
            break;
              
        default: // Default case if an invalid option is entered
            JOptionPane.showMessageDialog(null, "Invalid choice, please try again.");
            break;
    }
    
    } while (choices != 0); // Repeat the loop until the user chooses to exit (0)
}

    }

