package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.AverageCalculatorService;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        final Logger logger = Logger.getLogger(Main.class.getName());

        var ct = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service = ct.getBean(AverageCalculatorService.class);

        double average = service.getAvg(new int[]{1, 2, 3, 4, 5});

        logger.info("Average: "+average);
    }
}
