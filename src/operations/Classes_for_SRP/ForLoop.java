package operations.Classes_for_SRP;

import operations.interfaces_for_ISP.*;

import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ForLoop implements IForLoop {

    private int countOfGood1_answers, countOfMiddle2_answers, countOfBad3_answers;
    private int userAnswer_Int = 5, selfRating = 1000;
    private String nothing ="";

    public ForLoop() {
    }

    public int getCountOfGood1_answers() {
        return countOfGood1_answers;
    }
    public int getCountOfMiddle2_answers() {
        return countOfMiddle2_answers;
    }

    public int getCountOfBad3_answers() {
        return countOfBad3_answers;
    }


    @Override
    public void forLoopRun(PrintWriter output, ITextsForOutputFile reportTexts, IPrintQuestion question,
                           IPrintRequestUserAnswer requestUserAnswer, IGetUserAnswer getUserAnswer,
                           IPrintUserAnswer userAnswer, IPrintCorrectAnswer correctAnswer,
                           IPrintRequestUsertoCompareAnswers requestCompare,
                           IPrintRequestUserCompareApprovement compareApprovement,
                           IPrintRequestUserSelfRating userSelfRating, IPrintOrder order) {
        for (int i = 0; i < 2; i++){
            question.printQuestion(i);
            reportTexts.outputQuestion(i,output);
            requestUserAnswer.printRequestUserAnswer();
            reportTexts.outputRequestUserAnswer(output);
            String userAnswer_String = getUserAnswer.getUserAnswer_String(new Scanner(System.in));
            userAnswer.printUserAnswer(userAnswer_String);
            reportTexts.outputUserAnswer(output,userAnswer_String);
            correctAnswer.printCorrectAnswer(i);
            reportTexts.outputCorrectAnswer(i,output);
            requestCompare.printRequestUsertoCompareAnswers();
            reportTexts.outputRequestUsertoCompareAnswers(output);
            compareApprovement.printRequestUserCompareApprovement();
            reportTexts.outputRequestUserCompareApprovement(output);

            try {
                  userAnswer_Int = getUserAnswer.getUserAnswer_Int(new Scanner(System.in));
            } catch(InputMismatchException e){
                System.out.println("вы ввели неправильные данные\n");
                output.write("вы ввели неправильные данные\r\n");
                System.out.println("программа приостановливает свою работу\n");
                output.write("программа приостановливает свою работу\r\n");
                System.out.println("начните прохождение теста с нуля");
                output.write("начните прохождение теста с нуля");
                output.close();
                System.exit(0);
            }
              reportTexts.outputUserAnswer(output,userAnswer_Int);
            if(userAnswer_Int == 1){
                userSelfRating.printRequestUserSelfRating();
                try {
                    selfRating = getUserAnswer.getUserAnswer_Int(new Scanner(System.in));
                } catch(InputMismatchException e){
                    System.out.println("вы ввели неправильные данные\n");
                    output.write("вы ввели неправильные данные\r\n");
                    System.out.println("программа приостановливает свою работу\n");
                    output.write("программа приостановливает свою работу\r\n");
                    System.out.println("начните прохождение теста с нуля");
                    output.write("начните прохождение теста с нуля");
                    output.close();
                    System.exit(0);
                }
                reportTexts.outputUserSelfRating(selfRating, output);
                if (selfRating == 1){
                    countOfGood1_answers++;
                } else if(selfRating == 2){
                    countOfMiddle2_answers++;
                } else if(selfRating == 3){
                    countOfBad3_answers++;
                } else {
                    order.printOrder(selfRating);
                    reportTexts.outputOrder(selfRating, output);
                    System.exit(0);
                }
            } else if(userAnswer_Int == 0){
                order.printOrder(userAnswer_Int);
                reportTexts.outputOrder(userAnswer_Int, output);
                System.exit(0);
            } else {
                order.printOrder();
                reportTexts.outputOrder(output);
                System.exit(0);
            }
        }
    }
}
