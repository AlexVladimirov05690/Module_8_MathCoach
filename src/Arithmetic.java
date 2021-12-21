import java.util.Random;
import java.util.Scanner;

public class Arithmetic extends Exercise{
    int c = 0;
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
                c = a + b;
                sign = '+';
            }
            case 1 -> {
                c = a - b;
                sign = '-';
            }
            case 2 -> {
                c = a * b;
                sign = '-';
            }
            case 3 -> {
                b++;
                a = a * b;
                c = a / b;
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
        return c == answer;
    }


}
