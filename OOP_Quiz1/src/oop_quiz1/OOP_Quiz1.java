package oop_quiz1;
import java.util.Scanner;

/**
 *
 * @author Gm
 */
public class OOP_Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ex1();
    }
    
    public static void ex1(){
        Scanner input = new Scanner(System.in);
        String str;
        System.out.print("Input string : ");
        str = input.nextLine();
        char[] ch = str.toCharArray(); 
        boolean isSame=false;
        for(int i = 0; i<ch.length; i++ ){
            
            for(int j = 0; j<=i; j++){
                if(ch[i]==ch[j]){
                    isSame = true;
                } 
            }
            
            
            if(i==0){
                System.out.print("1");
                System.out.print(ch[i]);
                isSame=false;
            }
            else{
                if(!isSame){
                    System.out.print("2");
                    System.out.print(ch[i]);
                    isSame=false;
                }
            }
        }
        
    }
    
}
