package config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import proxies.ExcelReportGenerator;
import proxies.ReportGenerator;
import repositories.BillRepository;
import repositories.BillRepositoryImpl;
import services.BillingListService;

@Configuration
public class ProjectConfig {

    @Bean
    public ReportGenerator excelReportGenerator(){
        return new ExcelReportGenerator();
    }

    @Bean
    public BillRepository billRepository(){
        return new BillRepositoryImpl();
    }

    /*
        I have explicitly set the Scope of the Bean to Prototype,
        Everytime we try to get the reference of this bean then
        Spring will create and give us new instance everytime.

        It is better to use this approach while we want to
        change state or make Bean type Mutable so while
        multiple threads try to access the bean object they
        get new instance, and they can access it accordingly
        and there is no problem.
     */
    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public BillingListService billingListService(BillRepository billRepository,
                                                 ReportGenerator reportGenerator){
        return new BillingListService(billRepository, reportGenerator);
    }
}
