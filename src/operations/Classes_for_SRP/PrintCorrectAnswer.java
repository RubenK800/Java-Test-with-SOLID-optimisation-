package operations.Classes_for_SRP;

import operations.ITestAnswersListReader;
import operations.TestAnswersListReaderRealize;
import operations.interfaces_for_ISP.IPrintCorrectAnswer;

public class PrintCorrectAnswer implements IPrintCorrectAnswer {
    private ITestAnswersListReader answer = new TestAnswersListReaderRealize();

    @Override
    public void printCorrectAnswer(int number) {
        System.out.println("Правильный ответ:\n " + answer.tALR(number) + "\n");
    }
}
