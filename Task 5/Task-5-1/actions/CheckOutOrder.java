package consoleuserinterface.actions;

import com.senla.elhoteladmin.controller.AdminControllerSingleton;
import consoleuserinterface.ScannerUtil;

public class CheckOutOrder implements IAction {
    AdminControllerSingleton adminControllerSingleton = AdminControllerSingleton.getInstance();

    @Override
    public void execute() {
        System.out.println("Введите номер заказа - ");
        adminControllerSingleton.checkOutOrder(new ScannerUtil().getInt());
        System.out.println("Выселение гостей оформлено.\n");
    }
}
