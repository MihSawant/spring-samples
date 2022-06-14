package services;

import entity.Bill;
import proxies.ReportGenerator;
import repositories.BillRepository;

public class BillingListService {
    private final BillRepository billRepository;
    private final ReportGenerator reportGenerator;


    public BillingListService(BillRepository billRepository, ReportGenerator reportGenerator) {
        this.billRepository = billRepository;
        this.reportGenerator = reportGenerator;
    }

    public void generateBill(Bill bill){
        billRepository.storeBill(bill);
        reportGenerator.generateReport(bill);
    }
}
