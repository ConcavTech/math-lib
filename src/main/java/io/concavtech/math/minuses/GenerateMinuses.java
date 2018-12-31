package io.concavtech.math.minuses;

import dtos.SumDto;
import lombok.extern.flogger.Flogger;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@Slf4j
public class GenerateMinuses {

//    public static Logger logger = LoggerFactory.getLogger("GenerateMinuses");

    public SumDto allPositiveNumber(int bound){
        Random random = new Random();
        int num1 = random.nextInt(bound);
        int num2 = random.nextInt(bound);
        if(num1 < num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        int ans = num1 - num2;

        log.info(num1+" - "+num2 + " = "+ ans);
        return new SumDto(num1, num2, ans);
    }
}
