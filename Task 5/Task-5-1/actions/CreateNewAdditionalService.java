package consoleuserinterface.actions;

import com.senla.elhoteladmin.entity.AdditionalService;
import com.senla.elhoteladmin.service.AdditionalServiceService;
import consoleuserinterface.ScannerUtil;

public class CreateNewAdditionalService implements IAction {
    AdditionalServiceService service = AdditionalServiceService.getInstance();

    @Override
    public void execute() {
        AdditionalService additionalService = new AdditionalService();
        ScannerUtil scannerUtil = new ScannerUtil();

        System.out.println("Введите ID сервиса - ");
        additionalService.setServiceID(scannerUtil.getInt());

        System.out.println("Введите название сервиса - ");
        additionalService.setServiceName(scannerUtil.getStr());

        System.out.println("Введите цену сервиса - ");
        additionalService.setServicePrice(scannerUtil.getInt());

        service.setNewAdditionalService(additionalService);
        System.out.println("Дополнительный сервис - \n" + additionalService + " \nсоздан.\n");
    }
}
