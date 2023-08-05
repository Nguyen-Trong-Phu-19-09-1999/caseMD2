package manager;

import file.IOFile;
import model.User;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

public class AdminManager implements Serializable {
    private static final long serialUID = 12345678;
    private final List<User> stadium;
    Scanner scanner = new Scanner(System.in);

    public AdminManager() {
        stadium = IOFile.readFile("D:\\md2\\CaseMd2\\src\\file\\Test.txt");
    }


    public void showList() {
        for (User user : stadium) {
            System.out.println(user);

        }
    }


    public void addproduct() {

        System.out.println("Mã Sân");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Giá");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Tên");
        String name = scanner.nextLine();
        System.out.println("kích thước");
        int size = Integer.parseInt(scanner.nextLine());
        System.out.println("địa chỉ");
        String address = scanner.nextLine();
        User user = new User(id, price, name, size, address);
        stadium.add(user);
        IOFile.write(stadium, "D:\\md2\\CaseMd2\\src\\file\\Test.txt");
    }

    public User FindId() {
        System.out.println("Nhập mã bạn muốn thực hiện :");
        int id = Integer.parseInt(scanner.nextLine());
        for (User user : stadium) {
            if (id == user.getId()) {
                return user;
            }
        }
        return null;
    }


    public void update() {
        User user = FindId();
        System.out.println("Tên ");
        String name = scanner.nextLine();
        user.setName(name);
        System.out.println("Giá ");
        double price = Double.parseDouble(scanner.nextLine());
        user.setPrice(price);
        System.out.println("Kích thước");
        int size = Integer.parseInt(scanner.nextLine());
        user.setSize(size);
        System.out.println("Địa chỉ");
        String address = scanner.nextLine();
        user.setAddress(address);
        IOFile.write(stadium, "D:\\md2\\CaseMd2\\src\\file\\Test.txt");
    }

    public void delete() {
        if (!stadium.isEmpty()) {
            User user = FindId();
            if (user != null) {
                stadium.remove(user);

                System.out.println("Xoá Thành công ");
                return;
            } else {
                System.out.println("Mã không tồn tại ");
            }
            IOFile.write(stadium, "D:\\md2\\CaseMd2\\src\\file\\Test.txt");
        }

    }


}

