package operations.Classes_for_SRP;

import operations.ITestAnswersListReader;
import operations.ITestQuestionsListReader;
import operations.TestAnswersListReaderRealize;
import operations.TestQuestionsListReaderRealize;
import operations.interfaces_for_ISP.ITextsForOutputFile;

import java.io.PrintWriter;

public class TextsForOutputFile implements ITextsForOutputFile {
    private ITestQuestionsListReader question = new TestQuestionsListReaderRealize();
    private ITestAnswersListReader answer = new TestAnswersListReaderRealize();

    @Override
    public void outputQuestion(int number, PrintWriter output) {
        output.write("вопрос номер " + (number+1)+ ") " + question.tQLR(number) + "\r\n\r\n");
    }

    @Override
    public void outputRequestUserAnswer(PrintWriter output) {
        output.write("Введите ваш ответ\r\n\r\n");
    }

    @Override
    public void outputUserAnswer(PrintWriter output, String userAnswer) {
        output.write("Ваш ответ: " + userAnswer /*getUserAnswer.getUserAnswer_String()*/ + "\r\n\r\n");
    }

    @Override
    public void outputUserAnswer(PrintWriter output, int userAnswer) {
        output.write("Ваш ответ: " + userAnswer /*getUserAnswer.getUserAnswer_String()*/ + "\r\n\r\n");
    }

    @Override
    public void outputCorrectAnswer(int number, PrintWriter output) {
      output.write("Правильный ответ:\n " + answer.tALR(number) + "\r\n");
    }

    @Override
    public void outputRequestUsertoCompareAnswers(PrintWriter output) {
        output.write("пожалуйста сравните ваш ответ с правильным ответом\r\n");
    }

    @Override
    public void outputRequestUserCompareApprovement(PrintWriter output) {
        output.write("Вы сравнили данный вами ответ с правильным ответом?\r\n" +
                "Если да, тогда введите число 1, иначе - число 0\r\n");
    }

    @Override
    public void outputRequestUserSelfRating(PrintWriter output) {
        output.write("правильно ли вы ответили на данный вопрос?\r\n" +
                " введите число 1, если хорошо\r\n" +
                " введите число 2, если дали не полный но правильный ответ\r\n" +
                " введите число 3, если дали неправильный ответ");
    }

    @Override
    public void outputUserSelfRating(int number, PrintWriter output) {
        output.write("ваша самооценка: " + number + "\r\n");
    }

    @Override
    public void outputOrder(int number, PrintWriter output) {
        if(number == 0){
            output.write("Пожалуйста, будьте внимательнее в следующий раз, во время чтения" +
                    "требовании\r\n к ответам а в данный момент программа приостановит свою работу,\r\n" +
                    "начните с нуля\r\n");
        } else {
            output.write(" Вы не серьезно настроены.\r\n" +
                    " - поэтому программа сейчас проиостановит свою работу.\r\n" +
                    " Вернитесь когда будете трезвыми\r\n");
        }

    }

    @Override
    public void outputOrder(PrintWriter output) {
        output.write(" Вы не серьезно настроены.\r\n" +
                " - поэтому программа сейчас проиостановит свою работу.\r\n" +
                " Вернитесь когда будете трезвыми\r\n");
    }

    @Override
    public void outputTestResult(int number1, int number2, int number3, PrintWriter output) {
        output.write("Ниже ваш результат исходя из ваших собственных оценок, за любую погрешность\r\n" +
                " качество результата зависит от уровня вашей честности перед самим собой:\r\n\r\n" +
                " количество правильных полных ответов: " + number1 +"\r\n" +
                " количество правильных но не полных ответов: " + number2 + "\r\n"+
                " количество неправильных ответов: " + number3);
    }
}
