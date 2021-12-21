import java.util.Random;
import java.util.Scanner;


public class Arithmetic extends Exercise{
    private int rightAnswer = 0;
    @Override
    public void createQuestion() {
        Random random = new Random();
        int a = random.nextInt(15);
        int b = random.nextInt(15);
        char sign = ' ';
        int choice;
        choice = (int) (Math.random() * 4);
        switch (choice) {
            case 0 -> {
                rightAnswer = a + b;
                sign = '+';
            }
            case 1 -> {
                rightAnswer = a - b;
                sign = '-';
            }
            case 2 -> {
                rightAnswer = a * b;
                sign = '*';
            }
            case 3 -> {
                b++;
                a = a * b;
                rightAnswer = a / b;
                sign = '/';
            }
        }
        question = "Сколько будет " + a + " " + sign + " " + b + "?";
    }

    @Override
    public String showQuestion() {
        return question;
    }

    @Override
    public void setAnswer() {
        Scanner scanner = new Scanner(System.in);
        answer = scanner.nextInt();
    }

    @Override
    public boolean result() {
        return rightAnswer == answer;
    }
}
