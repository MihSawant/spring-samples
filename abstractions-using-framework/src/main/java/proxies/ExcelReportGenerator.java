package proxies;

import entity.Bill;
import org.springframework.stereotype.Component;

/*
    It is marked as Component which is a Stereotype
    annotation from spring which when after Spring
    creates the context then it will automatically
    create the bean and add it into its context,
    just like @Bean annotation, only now the spring
    will manage this bean and I do not have any
    control.

 */
@Component
public class ExcelReportGenerator implements ReportGenerator {
    @Override
    public void generateReport(Bill bill) {
        System.out.println("Generating Report -> "+bill.getName()+"#"+bill.getNumber());
    }
}
