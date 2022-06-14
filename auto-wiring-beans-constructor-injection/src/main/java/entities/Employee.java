package entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    private String name;
    private Designation designation;

    private final Company company;

    /*
        Instead of Field Injection, I marked the field final
        now as we know when we mark field final then we have
        to initilize it using the constructor, and I passed
        the argument of the constructor Company now Spring
        will look at it and it already has an instance of
        Company stored inside context as a Bean, so it injects
        the particular reference that I need.
        This approach is called Constructor Injection and is
        also the best practice, as it is now immutable and
        we cannot modify something when it is declared final.
     */
    @Autowired
    public Employee(Company company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }

    public Company getCompany() {
        return company;
    }
}
