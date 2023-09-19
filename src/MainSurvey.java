import javax.swing.*;
import java.util.ArrayList;

public class MainSurvey {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                startSurvey();
            }
        });
    }

    public static void startSurvey() {
        // Create an ArrayList to store user's answers for each question
        ArrayList<ArrayList<String>> userAnswers = new ArrayList<>();

        int q_count = 12;

        // Create a list of questions and answers
        ArrayList<String> questionsList = new ArrayList<>();
        // 1 - 5
        questionsList.add("What is your primary relationship to neurodiversity?");
        questionsList.add("There are various views regarding the reasons for the success of neurodivergent people. Which perspective resonates with you the most? And how do you think a neurodivergent person can succeed in life?");
        questionsList.add("From your own experiences, what is currently the most important aspects of improving lives?");
        questionsList.add("How can businesses and the concerned parties foster a constructive partnership?");
        questionsList.add("What strengths do you bring to the neurodiversity movement?");
        // 6 - 10
        questionsList.add("What area would you most like to know more about?");
        questionsList.add("In what areas do you feel there is tension that needs to be resolved?");
        questionsList.add("How much of a commitment can you make to exploring neurodiversity technology beyond the conference?");
        questionsList.add("Under what circumstances would you participate in a symposium like this in the future?");
        questionsList.add("What would you like to see changed/improved about future efforts?");
        // 11 - 12
        questionsList.add("What was the most exciting or surprising aspect of this conference?");
        // pretty sure i fucked up the question below
        questionsList.add("What did you learn most about in this conference?");
        /* 
        for (int i = 0; i < q_count; i++) {

        }
        */
        
        ArrayList<String> answersList1 = new ArrayList<>();
        answersList1.add("Answer 1");
        answersList1.add("Answer 2");
        answersList1.add("Answer 3");
        userAnswers.add(answersList1);

        ArrayList<String> answersList2 = new ArrayList<>();
        answersList2.add("Answer A");
        answersList2.add("Answer B");
        answersList1.add(null);
        userAnswers.add(answersList2);

        // Start the survey at question 1
        int currentQuestion = 0;

        // Display the first question
        //Question questionWindow = new Question(currentQuestion + 1, questionsList, userAnswers.get(currentQuestion));
        //questionWindow.setVisible(true);
    }
}
