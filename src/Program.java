import operations.Classes_for_SRP.*;
import operations.interfaces_for_ISP.*;

import java.io.IOException;
import java.io.PrintWriter;

public class Program { //для простоты используем блочный метод как в детских учебных программах
    public static void main(String[] args) throws IOException {
        PrintWriter output = new PrintWriter("отчет.txt"); //printWriter в большинстве случаев не выбрасывает исключения (если конечно я правильно понял)
        ITextsForOutputFile reportTexts = new TextsForOutputFile();
        IForLoop forLoop = new ForLoop();
        PrintTestResult testResult = new PrintTestResult();

        forLoop.forLoopRun(output, reportTexts, new PrintQuestion(), new PrintRequestUserAnswer(), new GetUserAnswer(),
                           new PrintUserAnswer(), new PrintCorrectAnswer(), new PrintRequestUsertoCompareAnswers(),
                           new PrintRequestUserCompareApprovement(), new PrintRequestUserSelfRating(), new PrintOrder()); // да, для больших программ так создавать обьекты не следует скорее всего, но для данной программы, думаю не сделали греха
        int n1 = forLoop.getCountOfGood1_answers();
        int n2 = forLoop.getCountOfMiddle2_answers();
        int n3 = forLoop.getCountOfBad3_answers();
        testResult.printTestResult(n1, n2, n3);
        reportTexts.outputTestResult(n1, n2, n3, output);
        output.close();
    }
}
