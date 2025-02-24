package Prelim;
import java.util.Scanner;
public class find_the_greatest_number {
    
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
        
    System.out.println("Input the first number");
    int vegeta = scan.nextInt();   
    
    System.out.println("Input the second number");
    int guko = scan.nextInt();  
    
    System.out.println("Input the third number");
    int guhan = scan.nextInt();  
       
    if(vegeta >guko && vegeta>guhan){System.out.println("the greatest number is : "+vegeta);
    
    }else if(guko >vegeta && guko>guhan){System.out.println("the greatest number is : "+guko);
    
    }else if(guhan>guko && guhan>vegeta){ System.out.println("the greatest number is : "+guhan);
    
    }else{System.out.println("kjasbdksadk");}
    }
    }

