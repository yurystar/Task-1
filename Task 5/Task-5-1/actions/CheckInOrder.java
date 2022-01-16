package consoleuserinterface.actions;

import com.senla.elhoteladmin.controller.AdminControllerSingleton;
import consoleuserinterface.ScannerUtil;

public class CheckInOrder implements IAction {
    AdminControllerSingleton adminControllerSingleton = AdminControllerSingleton.getInstance();

    @Override
    public void execute() {
        System.out.println("Введите номер заказа - ");
        adminControllerSingleton.checkInOrder(new ScannerUtil().getInt());
        System.out.println("Заселение гостей оформлено.\n");
    }
}
