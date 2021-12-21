public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в Математический тренажёр!");
        Arithmetic[] arithmetics = new Arithmetic[50];
        for (int i = 0; i < arithmetics.length; i++) {
            arithmetics[i] = new Arithmetic();
            arithmetics[i].createQuestion();
            System.out.println(arithmetics[i].showQuestion());
            arithmetics[i].setAnswer();
        }
    }
}
