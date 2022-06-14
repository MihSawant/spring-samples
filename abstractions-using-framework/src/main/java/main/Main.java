package main;

import config.ProjectConfig;
import entity.Bill;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.BillingListService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Bill bill = new Bill();
        bill.setNumber(230199);
        bill.setName("Invoice-Bill");

        var service = context.getBean(BillingListService.class);
        service.generateBill(bill);
    }
}
