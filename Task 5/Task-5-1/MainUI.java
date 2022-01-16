package consoleuserinterface;

import com.senla.elhoteladmin.controller.AdminControllerSingleton;
import com.senla.elhoteladmin.entity.RoomType;
import consoleuserinterface.userservice.MenuController;

public class MainUI {

    public static void main(String[] args) {
        MenuController menuController = new MenuController();
        AdminControllerSingleton adminControllerSingleton = AdminControllerSingleton.getInstance();

        adminControllerSingleton.createNewRoom(1, 1, RoomType.STARS_3, 5, 6000);
        adminControllerSingleton.createNewRoom(2, 2, RoomType.STARS_2, 4, 2700);
        adminControllerSingleton.createNewRoom(3, 3, RoomType.STARS_2, 2, 2000);
        adminControllerSingleton.createNewRoom(4, 4, RoomType.STARS_3, 2, 3500);
        adminControllerSingleton.createNewRoom(5, 5, RoomType.STARS_4, 3, 5600);

        adminControllerSingleton.createNewAdditionalService(1, "Cleaning", 600);
        adminControllerSingleton.createNewAdditionalService(2, "Food delivery", 400);
        adminControllerSingleton.createNewAdditionalService(3, "Washing clothes", 100);
        adminControllerSingleton.createNewAdditionalService(4, "Cable TV", 100);
        adminControllerSingleton.createNewAdditionalService(5, "Safe", 100);

        menuController.run();
    }
}
