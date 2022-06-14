package proxies;

import entity.Bill;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
/*
    As ReportGenerator Interface has more than one
    implementation so to tell Spring that which one
    to use for the Application I am marking the
    PdfReportGenerator Implementation default, so
    it will use this one only.
    It depends upon the domain / business needs and
    specific requirements.
 */
//@Primary
@Qualifier("pdf")
public class PdfReportGenerator implements ReportGenerator{
    @Override
    public void generateReport(Bill bill) {
        System.out.println("Generating PDF Report for Bill -> "+bill.getName()+"#"+bill.getNumber());
    }
}
