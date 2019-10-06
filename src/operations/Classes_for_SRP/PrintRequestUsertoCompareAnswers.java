package operations.Classes_for_SRP;

import operations.interfaces_for_ISP.IPrintRequestUsertoCompareAnswers;

public class PrintRequestUsertoCompareAnswers implements IPrintRequestUsertoCompareAnswers {

    @Override
    public void printRequestUsertoCompareAnswers() {
        System.out.println("пожалуйста сравните ваш ответ с правильным ответом\n");
    }
}
