package manager;

import file.IOFile;
import model.User;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class UserManager implements Serializable {
    private final List<User> users;
    private final Scanner scanner = new Scanner(System.in);

    public UserManager() {
        users = IOFile.readFile("D:\\md2\\CaseMd2\\src\\file\\Test.txt");

    }

    public void FindToId() {
        boolean flag = true;
        System.out.println("Nhập mã của sân bạn cần tìm :");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < users.size(); i++) {
            if (id == users.get(i).getId()) {
                System.out.println(users.get(i));
                break;
            }
            flag = false;
        }
        if (!flag) {
            System.out.println("Số ngoài danh sách");
            System.out.println("Nêu Không biết hãy số 1 để xem mã :");
        }
    }

    public void FindToPrice() {
        boolean flag = true;
        System.out.println("Nhập giá tiền cần tìm :");
        double price = Integer.parseInt(scanner.nextLine());
        for (User user : users) {
            if (price == user.getPrice()) {
                System.out.println(user);

                return;
            }
            flag = false;
        }
        if (!flag) {
            System.out.println("Không có sân như giá tiền mong muốn");
        }
    }

    public void FindToAddress() {
        boolean flag = false;
        System.out.println("Nhập khu vực cần tìm :");
        String address = scanner.nextLine();
        for (int i = 0; i < users.size(); i++) {
            if (address.equals(users.get(i).getAddress())) {
                System.out.println(users.get(i));
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Không có sân ở khu vực này");
        }
    }

    public boolean login() {
        System.out.println("Tên tài khoản");
        String account = scanner.nextLine();
        System.out.println("Mật khẩu");
        String passWord = scanner.nextLine();
        if (account.equals("admin") && passWord.equals("123456")) {
            System.out.println("Đăng nhập thành công");
            return true;
        } else {
            return false;
        }

    }

    public void showListToSize() {
        boolean flag = false;
        System.out.println("Nhập kích thước sân :");
        int size = Integer.parseInt(scanner.nextLine());
        for (User user : users) {
            if (size == user.getSize()) {
                System.out.println(user);
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Có sân 5 , 7 , 9 , 11");
            System.out.println("Vui lòng nhập lại ^^");
        }

    }


    public void oder() {
        System.out.println("Nhập thông tin của bạn ");
        System.out.println("-----------------------");
        System.out.println("Tên :");
        String name = scanner.nextLine();
        System.out.println("SĐT :");
        int phonenumber = Integer.parseInt(scanner.nextLine());
        showListToSize();
        System.out.println("Chọn sân muốn đặt");
        int choice;
        String inputchoice = scanner.nextLine();
        choice = Integer.parseInt(inputchoice);
        for (int i = 0; i < users.size(); i++) {
            if (choice==users.get(i).getId())   {
                System.out.println("ID sân : " + choice + "   Giá tiền :" + users.get(i).getPrice());
                System.out.println("---> Đặt thành công <---");
        }



        }

    }

}



