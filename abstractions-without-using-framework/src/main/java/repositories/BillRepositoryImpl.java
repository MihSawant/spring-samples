package repositories;

import entity.Bill;

public class BillRepositoryImpl implements BillRepository{

    @Override
    public void storeBill(Bill bill) {
        System.out.println("Storing Bill -> "+bill.getName()+"#"+bill.getNumber());
    }
}
