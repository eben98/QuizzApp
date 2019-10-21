package Model;

public class DataClass {

    public String Question = "";
    public String Option1 = "";
    public String Option2 = "";
    public String Option3 = "";
    public String Answer = "";

    public DataClass(String question , String option1 , String option2 , String option3 , String answer){
        this.Question = question;
        this.Option1 = option1;
        this.Option2 = option2;
        this.Option3 = option3;
        this.Answer = answer;
    }

    public String getQuestion() {
        return Question;
    }

    public String getOption1() {
        return Option1;
    }

    public String getOption2() {
        return Option2;
    }

    public String getOption3() {
        return Option3;
    }

    public String getAnswer() {
        return Answer;
    }
}
