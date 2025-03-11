/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PalindromeChecker {
    public static boolean CheckPalindrome (String josh){
        josh = josh.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int j = 0;
        int o = josh.length() - 1;
        
        do{
            if (josh.charAt(j) != josh.charAt(a)){
                return false;
            }
            
            j++;
            a--;
        }while (j < o);
        return true;
    }
    public static void main(String [] args){
        Scanner pcm = new Scanner(System.in);
        
        System.out.print("Enter a word or phrase: ");
        
        String user = pcm.nextLine();
        
        if (CheckPalindrome (user)){
            System.out.println("\"" + user + "\"is a palindrome!");
        }else {
            System.out.println("\"" + user + "\"is not a palindrome!");
        }
        
       pcm.close();
    }
}
