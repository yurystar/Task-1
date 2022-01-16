package consoleuserinterface.userservice;

import java.util.Scanner;

public class MenuController {
    Builder builder;
    Navigator navigator;

    public MenuController() {
        this.builder = new Builder();
        this.navigator = new Navigator();
    }

    public void run() {
        navigator.setCurrentMenu(builder.getRootMenu());
        navigator.printMenu();
        Integer index;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                index = scanner.nextInt();
                if (index == -1) {
                    System.out.println("Вы вышли из программы.");
                    return;
                }
                navigator.navigate(index);
                navigator.printMenu();
            }
        }
    }
}
