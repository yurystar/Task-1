package consoleuserinterface.userservice;

import com.senla.elhoteladmin.dao.AdditionalServiceDaoImpl;
import com.senla.elhoteladmin.dao.BookingOrderDaoImpl;
import com.senla.elhoteladmin.dao.GuestDaoImpl;
import com.senla.elhoteladmin.dao.RoomDaoImpl;
import com.senla.elhoteladmin.serialization.Serialization;

import java.io.IOException;
import java.util.Scanner;

public class MenuController {
    Builder builder;
    Navigator navigator;

    public MenuController() {
        this.builder = new Builder();
        this.navigator = new Navigator();
    }

    public void run() throws IOException {
        navigator.setCurrentMenu(builder.getRootMenu());
        navigator.printMenu();
        Integer index;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                index = scanner.nextInt();
                if (index == -1) {
                    new Serialization().SerializeAddServ(AdditionalServiceDaoImpl.getInstance().getAll());
                    new Serialization().SerializeBookOrd(BookingOrderDaoImpl.getInstance().getAll());
                    new Serialization().SerializeGuest(GuestDaoImpl.getInstance().getAll());
                    new Serialization().SerializeRoom(RoomDaoImpl.getInstance().getAll());
                    System.out.println("Вы вышли из программы.");
                    return;
                }
                navigator.navigate(index);
                navigator.printMenu();
            } else {
                System.out.println("Это не число! Попробуйте еще раз.");
                scanner.next();
            }
        }
    }
}
