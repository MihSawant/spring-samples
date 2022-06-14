package services;

import entity.Bill;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import proxies.ReportGenerator;
import repositories.BillRepository;

/*
    Service is another Stereotype annotation from
    Spring, similar to @Component but here I used
    it to mark that this class BillingListService
    has a Service behaviour, it is easy for readability
    purpose and the class Speaks that what it does.
 */

@Service
public class BillingListService {
    private final BillRepository billRepository;
    private final ReportGenerator reportGenerator;


    /*
        ReportGenerator has two implementations, so Spring is confused
        that which one to add to the context and which one to I need to
        use in the application, In case of multiple implementations
        we explicitly have to provide which implementation do we need,
        In my case let's suppose that I need PdfReport generator
        so to specify it I can either make it @Primary, so it will be
        the default implementation or better option is to use @Qualifier
        annotation when in the parameters of Constructor and the name of
        the bean.
     */
    public BillingListService(BillRepository billRepository, @Qualifier("pdfReportGenerator")
                                ReportGenerator reportGenerator) {
        this.billRepository = billRepository;
        this.reportGenerator = reportGenerator;
    }


    public void generateBill(Bill bill){
        billRepository.storeBill(bill);
        reportGenerator.generateReport(bill);
    }

}
