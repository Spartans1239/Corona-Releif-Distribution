/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

/**
 *
 * @author User
 */
public class user_define_exp extends Exception {
    
    int num1;
    int num2;
   /* Constructor of custom exception class
    * here I am copying the message that we are passing while
    * throwing the exception to a string and then displaying 
    * that string along with the message.
    */
   user_define_exp(int str2, int count) {
	num1 = str2;
        num2 = count;
   }
   public String toString(){ 
	if(num1>num2) return null;
        else return ("Riasat");
   }
}
