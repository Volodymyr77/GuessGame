import java.util.Scanner;

public class GuessNumb {
    public static void main(String[] args) {
        int min = 0;
        int max = 100;
        int count = 0;
        int userNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number between 0 and 100");

        int searchNumber = min + (int) (Math.random() * ((max - min) + 1));
        System.out.println(searchNumber);
        do {
        System.out.println("input your number");
        count ++;
        userNumber = input.nextInt();
        if (userNumber > searchNumber) {
            max = userNumber;
            System.out.println("your number too big");
            System.out.println("Guess a number between " + min + " and " + max);
        } else if (userNumber < searchNumber) {
            min = userNumber;
            System.out.println("your number too small");
            System.out.println("Guess a number between " + min + " and " + max);
        }} while (userNumber != searchNumber);
        System.out.println("you win");
        System.out.println("number of attemts = " + count);

    }
}