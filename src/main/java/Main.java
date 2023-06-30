/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello humman ! What is your name ? ");

        String answerForQuestion ;
        Character firstCharacter;
        String letters ;
        String newAnswer ;
        String newFirstChar;
        String finalString;

        answerForQuestion = scanner.nextLine();



        newAnswer = answerForQuestion.toLowerCase(); // conver name to lowerCase alice, bob
        firstCharacter = newAnswer.charAt(0); // cut first char from name
        letters = newAnswer.substring(1,newAnswer.length()); // cut all letters from 2 char to end
        newFirstChar = firstCharacter.toString().toUpperCase(); // convert first char from character to string and to  UpperCase
        finalString = newFirstChar + letters ; //add first char to other letters

        if(finalString.equals("Alice") || finalString.equals("Bob")) {
            System.out.println("Hello , " + finalString);
        }else{System.out.println("Sorry ,wrong name"); }

    }
}