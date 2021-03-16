import java.util.*;
  
  public class Main{
      
      public static Scanner scn = new Scanner(System.in);
      
      public static void gradingSystem(){
          int marks = scn.nextInt();
          
          
            if(marks>90){
             System.out.println("excellent");
         }
         
         else if(marks>80 && marks<=90){
             System.out.println("good");
         }
         
         else if(marks>70 && marks<=80){
             System.out.println("fair");
         }
         
         else if(marks>60 && marks<=70){
             System.out.println("meets expectations");
         }
         else{
             System.out.println("below par");
         }
      
          
      }
      

 


public static void printOddEven(int num){
        if(num % 2== 0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
    
public static void multipleOddEven(){
    int count = scn.nextInt();
    for(int i = 1; i<=count; i++){
        int num = scn.nextInt();
        printOddEven(num);
    }
    
} 

public static void printTable(int num){
    
    
    for( int i = 1; i<=10; i++){
        System.out.println(num + "*" + i + "=" + num*i);
    }
}

public static void printMultipleTabele(){
    int count = scn.nextInt();
    for(int i= 1; i<=count; i++){
        int num = scn.nextInt();
        printTable(num);
    }
}

    public static void main(String[] args){
        printMultipleTabele();
    }
  }
  
  