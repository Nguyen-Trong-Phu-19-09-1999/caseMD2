package manager;

import file.IOFile;
import model.User;

import java.util.List;
import java.util.Scanner;

public class Oder  {
    private final List<Oder> restore;
    Scanner scanner = new Scanner(System.in);

    public Oder() {
        restore = IOFile.readFile("D:\\md2\\CaseMd2\\src\\file\\Oder.txt");
    }

    public void restore() {
        System.out.println("Danh sách đã xoá :");
        IOFile.write(restore, "D:\\md2\\CaseMd2\\src\\file\\Oder.txt");
        System.out.println(restore);
    }
}



