package operations.interfaces_for_ISP;

import java.io.IOException;
import java.io.PrintWriter;

public interface IForLoop {
    void forLoopRun(PrintWriter output, ITextsForOutputFile reportTexts, IPrintQuestion question,
                    IPrintRequestUserAnswer requestUserAnswer, IGetUserAnswer getUserAnswer,
                    IPrintUserAnswer userAnswer, IPrintCorrectAnswer correctAnswer,
                    IPrintRequestUsertoCompareAnswers requestCompare,
                    IPrintRequestUserCompareApprovement compareApprovement,
                    IPrintRequestUserSelfRating userSelfRating, IPrintOrder order) throws IOException;
    int getCountOfGood1_answers();
    int getCountOfMiddle2_answers();
    int getCountOfBad3_answers();
}
