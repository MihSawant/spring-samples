package config;

import entities.Company;
import entities.Employee;
import entities.IceCream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public IceCream iceCream(){
        IceCream iceCream = new IceCream();
        iceCream.setFlavour("Mango");
        return iceCream;

    }
    /*
        I am trying to refer Employee in a Company and a Company
        in an Employee, So inside the Spring Context when it
        will try to create the bean of Company it finds that
        it needs a reference to Employee bean in order to inject
        it, It then finds that Employee bean doesn't exist, It then
        tries to create Employee bean but while creating the bean it
        finds that the Employee bean needs Company as a dependency
        But Company Bean is not yet created in the Context and for
        creating Employee, it is also not yet created.
        Company bean needs Employee and Employee bean needs Company,
        Spring is now in a DEADLOCK !, and in terminal error we also see
        that Spring finds out that there is some circular reference.
        If it occurs then maybe as a developer you have to re-think upon
        the model/design of your application, or try to break it by not defining
        objects whose creation does not depend on one another.
     */
    @Bean
    public Company company(Employee employee){
        Company company = new Company();
        company.setName("Foo");
        return company;
    }

    @Bean
    public Employee employee(Company company){
        Employee employee = new Employee(company);
        employee.setName("EMP-1");
        return employee;
    }

}
