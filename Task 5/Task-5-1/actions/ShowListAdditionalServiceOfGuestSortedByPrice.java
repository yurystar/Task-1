package consoleuserinterface.actions;

import com.senla.elhoteladmin.service.BookingOrderService;
import consoleuserinterface.ScannerUtil;

public class ShowListAdditionalServiceOfGuestSortedByPrice implements IAction {
    BookingOrderService bookingOrderService = BookingOrderService.getInstance();

    @Override
    public void execute() {
        System.out.println("Список дополнительных сервисов клиента. \nВведите ID клиента -  " +
                bookingOrderService.getListAdditionalServiceOfGuestSortedByPrice
                        (new ScannerUtil().getInt()));
        System.out.println();
    }
}
