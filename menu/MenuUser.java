package menu;

import javafx.beans.property.IntegerProperty;
import manager.UserManager;

import java.util.Scanner;

public class MenuUser {
    private static final long serialUID = 12345678;
    Scanner sc = new Scanner(System.in);
    UserManager manager = new UserManager();
    MenuAdmin menuAdmin = new MenuAdmin();


    public void menu() {

        int choice = 0;
        boolean flag;
        do {
            System.out.println("---Menu---");
            System.out.println("1. Hiển thị danh sách");
            System.out.println("2. Tìm kiếm theo ID");
            System.out.println("3. Tìm kiếm theo Giá");
            System.out.println("4. Tìm kiếm theo khu vực");
            System.out.println("5. Tìm kiếm theo kích thước");
            System.out.println("6. Đặt sân");
            System.out.println("7. Đăng nhập");
            System.out.println("0. Thoát");
            try {
                String inputChoice = sc.nextLine();
                choice = Integer.parseInt(inputChoice);
                flag = true;
            } catch (Exception e) {
                flag = false;
            }
            if (0 > choice || choice > 7) {
                System.out.println("Nhập số theo trong Menu");
            } else {
                switch (choice) {
                    case 1:
                        menuAdmin.manager.showList();
                        break;
                    case 2:
                        manager.FindToId();
                        break;
                    case 3:
                        manager.FindToPrice();
                        break;
                    case 4:
                        manager.FindToAddress();
                        break;
                    case 5:
                        manager.showListToSize();
                        break;
                    case 6:
                        manager.oder();
                        break;
                    case 7:
                        boolean check = manager.login();
                        if (check) {
                            menuAdmin.menuAdmin();
                        } else {
                            System.out.println("Đăng nhập thất bại");
                        }
                }
            }
        }
        while (choice != 0 || !flag);
    }
}


