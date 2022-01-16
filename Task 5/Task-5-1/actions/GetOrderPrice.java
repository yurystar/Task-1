package consoleuserinterface.actions;

import com.senla.elhoteladmin.controller.AdminControllerSingleton;
import consoleuserinterface.ScannerUtil;

public class GetOrderPrice implements IAction {
    AdminControllerSingleton adminControllerSingleton = AdminControllerSingleton.getInstance();

    @Override
    public void execute() {
        ScannerUtil scannerUtil = new ScannerUtil();
        System.out.println("Введите номер заказа - ");
        Integer choice = scannerUtil.getInt();
        System.out.println("Стоимость проживания по ордеру №" + choice + " - " +
                adminControllerSingleton.getOrderPrice(choice));
        System.out.println();
    }
}
