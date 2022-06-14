package entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Teacher {
    private String name = "Teacher-1";
    private Department department = Department.CS;

    /*
        Spring first creates and stores two beans namely Teacher and
        Subject into it's context as I have marked them with Component
        annotation, Now when Spring sees that I have a Subject reference
        in Teacher class and there is a relationship between them, with
        Autowired annotation on the field, Spring will provide the value
        of the bean and directly set the value here.
        This principle is known as Field Injection, it's for showing the
        example, but it is also recommended not to follow it in real-scenarios
        as it is mutable and state can be changed later.
     */
    @Autowired
    private Subject subject;

    public String getName() {
        return name;
    }


    public Department getDepartment() {
        return department;
    }


    public Subject getSubject() {
        return subject;
    }

}
