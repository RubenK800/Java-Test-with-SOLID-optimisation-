package operations.Classes_for_SRP;

import operations.interfaces_for_ISP.IPrintTestResult;

public class PrintTestResult implements IPrintTestResult {

    @Override
    public void printTestResult(int number1, int number2, int number3) {
        System.out.println("Ниже ваш результат исходя из ваших собственных оценок, за любую погрешность\n" +
                " качество результата зависит от уровня вашей честности перед самим собой:\n\n" +
                " количество правильных полных ответов: " + number1 +"\n" +
                " количество правильных но не полных ответов: " + number2 + "\n"+
                " количество неправильных ответов: " + number3);
    }
}
