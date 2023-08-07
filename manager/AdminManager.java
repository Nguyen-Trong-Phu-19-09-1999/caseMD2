package manager;

import file.IOFile;
import model.User;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

public class AdminManager implements Serializable {
    private static final long serialUID = 12345678;
    private List<User> stadium;
    private List<User> retoreList;
    Scanner scanner = new Scanner(System.in);

    public AdminManager() {
        stadium = IOFile.readFile("D:\\md2\\CaseMd2\\src\\file\\Test.txt");
        retoreList = IOFile.readFile("D:\\md2\\CaseMd2\\src\\file\\Oder.txt");

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
        IOFile.write(stadium, "D:\\md2\\CaseMd2\\src\\file\\Oder.txt");


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
        System.out.println("Sửa thành công ");
        IOFile.write(stadium, "D:\\md2\\CaseMd2\\src\\file\\Test.txt");
    }

    public void delete() {
        if (!stadium.isEmpty()) {
            User user = FindId();
            if (user != null) {
                retoreList.add(user);
                stadium.remove(user);

                System.out.println("Xoá Thành công ");
            } else {
                System.out.println("Mã không tồn tại ");
            }
        }
            IOFile.write(stadium, "D:\\md2\\CaseMd2\\src\\file\\Test.txt");


    }
    public void Oder() {
        stadium = IOFile.readFile("D:\\md2\\CaseMd2\\src\\file\\Oder.txt");
    }

    public void cycleBin() {
        System.out.println("Danh sách đã xoá :");
        IOFile.write(retoreList, "D:\\md2\\CaseMd2\\src\\file\\Oder.txt");
        for (User user : retoreList) {
            System.out.println(user);
        }
    }
    public void restore() {
        stadium.addAll(retoreList);
        retoreList.clear();
        IOFile.write(retoreList,"D:\\md2\\CaseMd2\\src\\file\\Oder.txt");
        Sort sort = new Sort();
        stadium.sort(sort);
        System.out.println("Khôi phục thành công");
        IOFile.write(stadium,"D:\\md2\\CaseMd2\\src\\file\\Test.txt");
        showList();
    }


}

