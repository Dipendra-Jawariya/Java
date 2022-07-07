package JavaCodeWithHarry;

import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses;
    void game(int n){
        Random rand = new Random();
    this.number = rand.nextInt(100);
    }

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc  = new Scanner(System.in);
         inputNumber  =sc.nextInt();

    }
    boolean isCorrectNumber(int num){
    if(num==number){
        return true;
    }
    return  false;
    }

}

public class game_50_excercise_solution {
    public static void main(String[] args) {
        /*
        Create a game class,which allows a user to play "Guess the Number"
        game once. Game should have the following methods:
        1. Constructor to generate  the random number
        2. takeUserInput()  to take a user input of number
        3. isCorrectNumber() to detect the number entered by the user is  true
        4. getter and setter for number of guesses
        Use properties such as  noOfGuesses(int), etc to get this task done!
         */
        Game g = new Game();
        g.takeUserInput();


    }
}
