package main;

import config.ProjectConfig;
import entities.Company;
import entities.Designation;
import entities.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var company = context.getBean(Company.class);
        company.setName("Company-1");

        var employee = context.getBean(Employee.class);
        employee.setName("EMP-1");
        employee.setDesignation(Designation.SDE_1);

        System.out.println("Employee: "+employee.getName()+" --> "+employee.getDesignation().toString()+
                            " Works at: "+employee.getCompany().getName());
    }
}
