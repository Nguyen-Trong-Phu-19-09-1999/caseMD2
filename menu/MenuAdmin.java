package menu;

import manager.AdminManager;

import java.util.Scanner;

public class MenuAdmin {
    private static final long serialUID = 12345678;
    public Scanner sc = new Scanner(System.in);
    AdminManager manager = new AdminManager();
    public void menuAdmin() {
        int choice = 0;
        do {
            System.out.println("-----Menu ADMIN-----");
            System.out.println("1. Thêm");
            System.out.println("2. Sửa");
            System.out.println("3. Xoá");
            System.out.println("4. Hiển thị");
            System.out.println("5. Thùng rác");
            System.out.println("6. Khôi phục");
            System.out.println("0. Đăng xuất");
            try {
                choice = Integer.parseInt(sc.nextLine());
            }catch (Exception e){
                System.out.println("Chọn số theo danh mục trong Menu");
            }
            switch (choice) {
                    case 1:
                        manager.addproduct();
                        break;
                    case 2:
                        manager.update();
                        break;
                    case 3:
                        manager.delete();
                        break;
                    case 4:
                        manager.showList();
                        break;
                     case 5:
                        manager.cycleBin();
                         break;
                case 6:
                    manager.restore();
                    break;

                }
        } while (choice != 0);

    }
}
