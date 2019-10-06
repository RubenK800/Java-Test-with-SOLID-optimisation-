package operations;

import secure_data_warehouse.TestAnswersList2;

public class TestAnswersListReaderRealize implements ITestAnswersListReader {

    @Override
    public String tALR(int answerNumber) {
        return TestAnswersList2.getAnswersList().get(answerNumber);
    }
}
