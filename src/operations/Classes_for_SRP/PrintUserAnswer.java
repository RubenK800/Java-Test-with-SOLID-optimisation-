package operations.Classes_for_SRP;

import operations.interfaces_for_ISP.IPrintUserAnswer;

public class PrintUserAnswer implements IPrintUserAnswer {

    @Override
    public void printUserAnswer(String userAnswer) {
        System.out.println("Ваш ответ: " + userAnswer + "\n");
    }

}

