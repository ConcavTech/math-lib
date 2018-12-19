package io.concavtech.math.minuses;

import dtos.SumDto;

import java.util.Random;

public class GenerateMinuses {

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
        System.out.println(num1+" - "+num2 + " = "+ ans);
        return new SumDto(num1, num2, ans);
    }
}
