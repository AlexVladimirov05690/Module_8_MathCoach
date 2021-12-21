public class Main {
    public static void main(String[] args) {
        Time time = new Time();
        Out out = new Out();
        time.nowTime();
        System.out.println("Добро пожаловать в Математический тренажёр!");
        time.startTime();
        Arithmetic[] arithmetics = new Arithmetic[3];
        for (int i = 0; i < arithmetics.length; i++) {
            arithmetics[i] = new Arithmetic();
            arithmetics[i].createQuestion();
            System.out.println(arithmetics[i].showQuestion());
            arithmetics[i].setAnswer();
            if(arithmetics[i].result()) {
                out.rightAnswer++;
                out.totalAnswer++;
            } else out.totalAnswer++;
        }
        time.finishTime();
        out.showResult();
    }
}
