package consoleuserinterface.actions;

import com.senla.elhoteladmin.service.BookingOrderService;

public class ShowListBookingOrders implements IAction {
    BookingOrderService bookingOrderService = BookingOrderService.getInstance();

    @Override
    public void execute() {
        System.out.println("Список всех заказов - " +
                bookingOrderService.getListBookingOrders());
        System.out.println();
    }
}
