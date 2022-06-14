package proxies;

import entity.Bill;

public class ExcelReportGenerator implements ReportGenerator{
    @Override
    public void generateReport(Bill bill) {
        System.out.println("Generating Excel Report for Bill: "+bill.getName());
    }
}
