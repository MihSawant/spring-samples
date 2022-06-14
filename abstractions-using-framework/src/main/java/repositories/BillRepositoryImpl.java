package repositories;

import entity.Bill;
import org.springframework.stereotype.Repository;

/*
    Marked the BillRepositoryImpl class as a Repository
    because this is our repository for storing and managing
    the data and perform all DB related transactions.
    This is also a stereotype annotation, So it will create
    and instantiate the bean in the Spring Context
 */
@Repository
public class BillRepositoryImpl implements BillRepository{
    @Override
    public void storeBill(Bill bill) {
        System.out.println("Storing Bill -> "+bill.getName()+"#"+bill.getNumber());
    }
}
