package operations;

import secure_data_warehouse.TestQuestionsList2;

public class TestQuestionsListReaderRealize implements ITestQuestionsListReader{
    @Override
    public String tQLR(int questionNumber) {
        return TestQuestionsList2.getQuestionsList().get(questionNumber);
    }
}
