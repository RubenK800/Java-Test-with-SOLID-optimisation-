package operations.Classes_for_SRP;

import operations.interfaces_for_ISP.IPrintRequestUserCompareApprovement;

public class PrintRequestUserCompareApprovement implements IPrintRequestUserCompareApprovement {
    @Override
    public void printRequestUserCompareApprovement() {
        System.out.println("Вы сравнили данный вами ответ с правильным ответом?\n" +
                "Если да, тогда введите число 1, иначе - число 0\n");
    }
}
