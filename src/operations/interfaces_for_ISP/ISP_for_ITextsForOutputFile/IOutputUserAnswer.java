package operations.interfaces_for_ISP.ISP_for_ITextsForOutputFile;

import java.io.PrintWriter;

public interface IOutputUserAnswer {
    void outputUserAnswer(PrintWriter output, String userAnswer);
    void outputUserAnswer(PrintWriter output, int userAnswer);
}
