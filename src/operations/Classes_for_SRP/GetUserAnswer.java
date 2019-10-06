package operations.Classes_for_SRP;

import operations.interfaces_for_ISP.IGetUserAnswer;

import java.util.Scanner;

public class GetUserAnswer implements IGetUserAnswer {

    @Override
    public String getUserAnswer_String(Scanner scanner) {
        return scanner.nextLine();
    }

    @Override
    public int getUserAnswer_Int(Scanner scanner) {
        return scanner.nextInt(); //по идее после nextInt надо nextLine добавить, чтобы программа корректно работала
                                  //но это в прототипе, а тут в оптимизированном коде - что то не требуется данный лайфхак,
                                  //это не очень хорошо - так как странно
    }
}
