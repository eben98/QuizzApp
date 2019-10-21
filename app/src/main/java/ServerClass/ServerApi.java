package ServerClass;

import java.util.ArrayList;
import java.util.List;

import Model.DataClass;

public class ServerApi {

    // static variable single_instance of type Singleton
    private static ServerApi single_instance = null;

    // static method to create instance of Singleton class
    public static ServerApi getInstance()
    {
        if (single_instance == null)
            single_instance = new ServerApi();

        return single_instance;
    }

    public List<DataClass> QuestionsPassed () {

        List<DataClass> AllQuestions = new ArrayList<DataClass>();

        DataClass question1 = new DataClass("1. Which is called the first wonder of the world?",
                "The Pyramids of Egypt",
                "The Hanging Gardens of Babylon",
                " The Tomb of Mausolus",
                "The Pyramids of Egypt");
        DataClass question2 = new DataClass("2. Who designed Statue of Christ - The Redeemer?",
                "Anna Levinson",
                " Apostolos Vellios",
                " Heitor de Silva Costa",
                "Heitor de Silva Costa");
        DataClass question3 = new DataClass("3. Grand Central Terminal, Park Avenue, New York is the world's",
                "largest railway station",
                "highest railway station",
                "longest railway station",
                "largest railway station");
        DataClass question4 = new DataClass("4. The great Victoria Desert is located in",
                "Canada",
                "West Africa",
                "Australia",
                "Australia");
        DataClass question5 = new DataClass("5. Who is the father of Geometry?",
                "Aristotle",
                "Euclid",
                "Pythagoras",
                "Euclid");
        DataClass question6 = new DataClass("6. The Indian to beat the computers in mathematical wizardry is",
                "Ramanujam",
                "Raja Ramanna",
                "Shakunthala Devi",
                "Shakunthala Devi");
        DataClass question7 = new DataClass("7. Which city is known as 'Electronic City of India'?",
                "Chennai",
                "Mumbai",
                "Bangalore",
                "Bangalore");
        DataClass question8 = new DataClass("8. Golden Temple is situated in",
                "Agra",
                "Delhi",
                "Amritsar",
                "Amritsar");
        DataClass question9 = new DataClass("9. Which is known as 'Garden City of India'?",
                "Trivandram",
                "Simla",
                "Bangalore",
                "Bangalore");
        DataClass question10 = new DataClass("10. Who invented Dynamite?",
                "Benjamin Franklin",
                "Thomas Alva Edison",
                "Alfred B. Nobel",
                "Alfred B. Nobel");

        AllQuestions.add(question1);
        AllQuestions.add(question2);
        AllQuestions.add(question3);
        AllQuestions.add(question4);
        AllQuestions.add(question5);
        AllQuestions.add(question6);
        AllQuestions.add(question7);
        AllQuestions.add(question8);
        AllQuestions.add(question9);
        AllQuestions.add(question10);

        return AllQuestions;
    }

}
