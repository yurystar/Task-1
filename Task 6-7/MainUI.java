package consoleuserinterface;

import com.senla.elhoteladmin.controller.AdminControllerSingleton;
import com.senla.elhoteladmin.entity.RoomType;
import com.senla.elhoteladmin.serialization.Deserialization;
import com.senla.elhoteladmin.serialization.Serialization;
import consoleuserinterface.userservice.MenuController;

import java.io.IOException;

public class MainUI {

    public static void main(String[] args) throws IOException {
        MenuController menuController = new MenuController();
        AdminControllerSingleton adminControllerSingleton = AdminControllerSingleton.getInstance();

        Deserialization deserialization = new Deserialization();
        adminControllerSingleton.deserializeListAddServ(deserialization.deserializeAddServ());
        adminControllerSingleton.deserializeListBookingOrder(deserialization.deserializeBookOrd());
        adminControllerSingleton.deserializeListGuest(deserialization.deserializeGuest());
        adminControllerSingleton.deserializeListRoom(deserialization.deserializeRoom());
        System.out.println("===================================================================================");

        menuController.run();
    }
}
