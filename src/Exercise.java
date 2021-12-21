public abstract class Exercise {
    String name;
    String question;
    int answer;

    abstract public void createQuestion();
    abstract public String showQuestion();
    abstract public void setAnswer();
    abstract public boolean result();

}
