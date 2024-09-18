//guess the number game
import java.util.Scanner;
import java.util.Random;
class Guess{
    Scanner sc=new Scanner(System.in);
    Random rn=new Random();
    int b=rn.nextInt(100)+1;
    int score=0;
public void userInput(){
    System.out.println("Guess A Number between 1-100");
    int a=sc.nextInt();
    System.out.println("Your Prediction "+a);
    isCorrectNum(a,b);
}
public void isCorrectNum(int x,int y){
  
    if(y!=x){
        score++;
        if(x<y){
            System.out.println("Guess a number greater than this");  
        }else {
            System.out.println("Guess a number less than this");
        }
        int n=sc.nextInt();
        isCorrectNum(n, y);
    }
    else{
        System.out.println("Correctly Guessed");
        System.out.println("Your score is"+score);
    }
   
}
}
public class game {
    public static void main(String[] args) {
        System.out.println("Lets Play Guess The Number");
        Guess gs=new Guess();
        gs.userInput();  
        
    }
}
