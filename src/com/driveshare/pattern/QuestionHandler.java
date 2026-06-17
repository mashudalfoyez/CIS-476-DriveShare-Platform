package com.driveshare.pattern;

// class simply concretet handerl for a security questions
// also stores anser and user input
public class QuestionHandler extends SecurityHandler {

    private String the_question;
    private String correct_status;

    // constructor
    public QuestionHandler(String the_question, String correct_status) {
        this.the_question = the_question;
        this.correct_status = correct_status;
    }

    //check and answer matches
    public boolean check(String answer) {
        System.out.println("Checking: " + the_question);

        if (!answer.equalsIgnoreCase(correct_status)) {
            System.out.println("Wrong!");
            return false;
        }

        System.out.println("Correct!");

        if (next == null) return true;
        return next.check(answer);
    }
}