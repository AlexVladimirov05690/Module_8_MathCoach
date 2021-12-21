public class Out {
    public double rightAnswer = 0;
    public double totalAnswer = 0;

    public void showResult() {
        double percent = Math.round((rightAnswer / totalAnswer) * 10000);
        percent = percent / 100;
        System.out.println("Правильных ответов " + rightAnswer + " из " + totalAnswer + ". Правильность: " + percent + " %.");
    }
}
