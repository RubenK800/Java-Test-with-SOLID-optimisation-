package operations.Classes_for_SRP;

import operations.interfaces_for_ISP.IPrintRequestUserAnswer;

public class PrintRequestUserAnswer implements IPrintRequestUserAnswer {
    @Override
    public void printRequestUserAnswer() {
        System.out.println("Введите ваш ответ\n");
    }
}
