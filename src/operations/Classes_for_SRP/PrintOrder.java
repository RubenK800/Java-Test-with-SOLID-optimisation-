package operations.Classes_for_SRP;

import operations.interfaces_for_ISP.IPrintOrder;

public class PrintOrder implements IPrintOrder {
    @Override
    public void printOrder(int number) {
        if(number == 0){
            System.out.println("Пожалуйста, будьте внимательнее в следующий раз, во время чтения" +
                    "требовании\n к ответам а в данный момент программа приостановит свою работу,\n" +
                    "начните с нуля\n");
        } else {
            System.out.println(" Вы не серьезно настроены.\n" +
                    " - поэтому программа сейчас проиостановит свою работу.\n" +
                    " Вернитесь когда будете трезвыми\n");
        }
    }

    @Override
    public void printOrder() {
        System.out.println(" Вы не серьезно настроены.\n" +
                " - поэтому программа сейчас проиостановит свою работу.\n" +
                " Вернитесь когда будете трезвыми\n");
    }
}
