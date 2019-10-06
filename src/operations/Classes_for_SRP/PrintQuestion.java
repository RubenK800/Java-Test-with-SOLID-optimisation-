package operations.Classes_for_SRP;

import operations.ITestQuestionsListReader;
import operations.TestQuestionsListReaderRealize;
import operations.interfaces_for_ISP.IPrintQuestion;

public class PrintQuestion implements IPrintQuestion {
    private ITestQuestionsListReader question = new TestQuestionsListReaderRealize();

    @Override
    public void printQuestion(int number) {
        System.out.println("вопрос номер " + (number+1)+ ") " + question.tQLR(number) + "\n");
    }
}
