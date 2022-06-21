package services;

import entities.Circle;
import org.springframework.stereotype.Service;

@Service
public class AreaCalcService {
    private static final double PI = Math.PI;

    public double calcArea(Circle circle){
        return (2 * PI * circle.getRadius());
    }
}
