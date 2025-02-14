package Prelim;


public class Act1_Arithmetic_Operators {
     public static void main(String[] org){
             
        int numb1 = 10;
        int numb2 = 6;
        int numb3 = 4;
        int numb4 = 3; 
        
        
        
        int firstnum1 = numb1 * numb3 + numb2;
        int sandoy1 = numb1 - numb3;
        int firstnum2 = sandoy1 % numb2;
        int sandoy2 = numb1 + numb3 + numb2;
        int firstnum3 = sandoy2 / numb4;
        int sandoy3 = numb3 * numb3;
        int firstnum4 = numb1 * numb2 - sandoy3;
        
          System.out.println("10 * 4 + 6 ="+ firstnum1);
         System.out.println("(10-4) % 6 = "+ firstnum2);
            System.out.println("(10 + 4 + 6)/3 = "+ firstnum3);
               System.out.println("10 * 6 -(4 * 4 ) = "+ firstnum4);
               
     }
}
