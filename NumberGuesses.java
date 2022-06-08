import java.util.Scanner;

class Game1{
    static int count=0;
    static double random ;
    Game1(double num){
        this.random = num;
    }
    static double UserInput(){
        Scanner sc =new Scanner(System.in);
        double input = sc.nextInt();
        return input;
    }
    static void NumberGuess(double input){

            if (input>random){
                System.out.println("Guess some small numer");
                count++;

            }
            else if(input<random){
                System.out.println("Guess some bigger number");
                count++;

            }
            else {
                System.out.println("Correct Number is guessed");
                count++;
            }

        System.out.println("The number of guesses: "+count);


    }

}
public class NumberGuesses {
    public static void main(String[] args) {
        double random = Math.random() * (10 - 0 + 1) + 0;
        Game1 obj = new Game1(random);
       double guess= obj.UserInput();
       while (guess!=random){
           obj.NumberGuess(guess);
          obj.UserInput();

       }

    }
}


