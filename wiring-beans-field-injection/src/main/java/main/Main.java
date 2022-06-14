package main;

import config.ProjectConfig;
import entities.Teacher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var teacher = context.getBean(Teacher.class);
        System.out.println("Teacher: "+teacher.getName()+" from "+teacher.getDepartment()
                        +" Department teaches: "+teacher.getSubject().getName());
    }
}
