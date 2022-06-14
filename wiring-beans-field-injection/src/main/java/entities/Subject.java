package entities;

import org.springframework.stereotype.Component;

@Component
public class Subject {
    private String name = "Advanced Java";

    public String getName() {
        return name;
    }


}
