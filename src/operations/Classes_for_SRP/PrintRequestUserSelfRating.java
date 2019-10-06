package operations.Classes_for_SRP;

import operations.interfaces_for_ISP.IPrintRequestUserSelfRating;

public class PrintRequestUserSelfRating implements IPrintRequestUserSelfRating {

    @Override
    public void printRequestUserSelfRating() {
        System.out.println("правильно ли вы ответили на данный вопрос?\n" +
                " введите число 1, если хорошо\n" +
                " введите число 2, если дали не полный но правильный ответ\n" +
                " введите число 3, если дали неправильный ответ");
    }
}
