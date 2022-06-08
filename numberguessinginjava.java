import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public  int numberOfguesses=0;
    public int getNumberOfgguesses() {
        return numberOfguesses;
    }

    public void setNumberOfgguesses(int numberOfgguesses) {
        this.numberOfguesses = numberOfgguesses;
    }


     Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    int takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
        return inputNumber;
    }
    boolean isCurrectNumber(int num){
        numberOfguesses++;
        if (number==num){
            System.out.format("Yes! You guess it right,it was %d. \n You Guesses it in  %d attempts",number,numberOfguesses);
            return  true;
        }
        else if(num<number){
            System.out.println("Too less");
        }
        else if(num>number){
            System.out.println("Too high");
        }
        return false;
    }
}
public class numberguessinginjava {
    public static void main(String[] args) {
        Game g =new Game();
        boolean b=false;
        while
        (!b){
            int num = g.takeUserInput();
            b = g.isCurrectNumber(num);
            System.out.println(b);
        }

    }
}
