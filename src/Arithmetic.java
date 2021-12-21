import java.util.Random;

public class Arithmetic extends Exercise{
    @Override
    public void createQuestion() {
        Random random = new Random();
        int a = random.nextInt(10);
        int b = random.nextInt(10);


    }

    @Override
    public String showQuestion() {
        return null;
    }

    @Override
    public boolean result() {
        return false;
    }

}
