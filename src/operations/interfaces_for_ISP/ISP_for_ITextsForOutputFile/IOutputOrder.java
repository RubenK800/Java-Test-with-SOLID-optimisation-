package operations.interfaces_for_ISP.ISP_for_ITextsForOutputFile;

import java.io.PrintWriter;

public interface IOutputOrder {
    void outputOrder(int number, PrintWriter output);
    void outputOrder(PrintWriter output);
}
