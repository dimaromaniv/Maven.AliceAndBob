/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello humman ! What is your name ? ");
        String answerForQuestion ;
        answerForQuestion = scanner.nextLine();
        System.out.println("My greetings,  " + answerForQuestion);

    }
}