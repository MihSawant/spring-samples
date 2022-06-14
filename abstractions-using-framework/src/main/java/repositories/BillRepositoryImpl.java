package repositories;

import entity.Bill;
import org.springframework.stereotype.Component;

@Component
public class BillRepositoryImpl implements BillRepository{
    @Override
    public void storeBill(Bill bill) {
        System.out.println("Storing Bill -> "+bill.getName()+"#"+bill.getNumber());
    }
}
