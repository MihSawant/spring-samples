package main;

import config.ProjectConfig;
import entities.Circle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.AreaCalcService;

import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        AreaCalcService service = context.getBean(AreaCalcService.class);

        Circle circle = new Circle();
        circle.setRadius(2.4);

        double area = service.calcArea(circle);

        logger.info("Main Class:");
        logger.info("Area of Circle: "+area);

    }
}
