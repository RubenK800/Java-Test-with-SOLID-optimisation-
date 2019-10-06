package operations;

import operations.interfaces_for_ISP.IPrintRequestUserAnswer;
import operations.interfaces_for_ISP.IPrintRequestUserCompareApprovement;
import operations.interfaces_for_ISP.IPrintRequestUserSelfRating;
import operations.interfaces_for_ISP.IPrintRequestUsertoCompareAnswers;

public interface IPrintRequeststoUser extends IPrintRequestUserAnswer, IPrintRequestUsertoCompareAnswers,
                                              IPrintRequestUserCompareApprovement, IPrintRequestUserSelfRating {
}
