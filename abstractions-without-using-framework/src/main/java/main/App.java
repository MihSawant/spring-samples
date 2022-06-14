package main;

import entity.Bill;
import proxies.ExcelReportGenerator;
import repositories.BillRepositoryImpl;
import services.BillingListService;

public class App {
    public static void main(String[] args) {
        /*
          In this particular Example we have a service which
          relies on a proxy and repository which instead of
          direct access we provide it through interfaces
          and this is a very simple implementation without
          using of any framework where I manage and specify
          the Implementations which I need to use for the
          services to work.
          In abstractions-using-framework, there is same app
          but this time multiple implementations and we will
          use Spring-Framework to manage the app.
         */
        var billRepository = new BillRepositoryImpl();
        var reportGenerator = new ExcelReportGenerator();

        Bill bill = new Bill();
        bill.setName("Shopping-Bill");
        bill.setNumber(103814);

        BillingListService service = new BillingListService(billRepository, reportGenerator);
        service.generateBill(bill);
    }
}
