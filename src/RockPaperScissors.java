import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        Random rnd = new Random();
        int input = 0;
        int b = 1;
        int randomNumber = rnd.nextInt(3-1+1)+1;
        while (b != 0){ int rock = 1, paper = 2, scissors = 3;
        System.out.println("Welcome to Rock Paper Scissors! Would you like to play?");
        keyboard.nextLine();
        System.out.println("Select 1, 2, 3, for Rock, Paper, Scissors");
        keyboard.nextInt();

        if(randomNumber == rock){
                if(input == rock){
                    System.out.println("Rock vs. Rock, it is a tie!");
                }    else if(input == paper){
                    System.out.println("Rock vs. Paper! You win!" );
                }    else if(input == scissors){
                    System.out.println("Rock vs. Scissors! You lose!");
                }

                else if(randomNumber == paper){
                    if(input == rock){
                        System.out.println("Paper vs. Rock! You lose!");
                    }   else if(input == scissors){
                        System.out.println("Paper vs. Scissors! You win!");
                    }   else if(input == paper){
                        System.out.println("Paper vs. Paper! Its a tie!");
                    }

                    else if(randomNumber == scissors){
                        if(input == rock){
                            System.out.println("Scissors vs. Rock! You Win!");
                        }   else if(input == scissors){
                            System.out.println("Scissors vs. Scissors! It is a tie!");
                        }   else if(input == paper){
                            System.out.println("Scissors vs. Paper! You Lose!");

                            System.out.println("Would you like to play again?");
                            keyboard.nextLine();



                    }









    }}}}}}














































                        