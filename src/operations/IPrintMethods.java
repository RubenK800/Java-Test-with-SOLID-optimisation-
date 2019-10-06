package operations;

import operations.interfaces_for_ISP.*;

//предназначение интерфейса - представление о том, какие запросы к пользователю и инфо должны выводятся на консоль
public interface IPrintMethods extends IPrintQuestion, IPrintUserAnswer, IPrintCorrectAnswer,
                                       IPrintOrder, IPrintTestResult, IPrintRequeststoUser {
}
