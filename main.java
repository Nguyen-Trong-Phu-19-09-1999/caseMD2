import manager.UserManager;
import menu.MenuAdmin;
import menu.MenuUser;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        MenuUser menuUser = new MenuUser();
        Scanner sc = new Scanner(System.in);
        menuUser.menu();
    }
}
