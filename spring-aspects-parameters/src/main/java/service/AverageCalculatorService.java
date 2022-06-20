package service;

import org.springframework.stereotype.Service;

@Service
public class AverageCalculatorService {

    public double getAvg(int[] nums){
        int sum = 0;
        for(var n : nums){
            sum += n;
        }
        return sum / nums.length;
    }
}
