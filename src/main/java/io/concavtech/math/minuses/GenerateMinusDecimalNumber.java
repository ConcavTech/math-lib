package io.concavtech.math.minuses;

import dtos.SumDto;
import exceptions.IllegalLengthException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class GenerateMinusDecimalNumber {

    private Logger log = LoggerFactory.getLogger(GenerateMinusDecimalNumber.class);
    private static GenerateMinusDecimalNumber ourInstance = new GenerateMinusDecimalNumber();

    public static GenerateMinusDecimalNumber getInstance() {
        return ourInstance;
    }

    private GenerateMinusDecimalNumber() {
    }

    /**
     * Return the single digit sum for the minus sums.
     * @return the object of SumDto with the values and answer.
     */
    public SumDto singleDigitPositiveWholeNumber(){
        SumDto dto = null;
        Random random = new Random();
        int num1 = random.nextInt(10);
        int num2 = random.nextInt(10);
        if(num1 < num2) {
            int ans = num2 - num1;
            log.info(num2+" - "+num1 + " = "+ ans);
            return new SumDto(num2, num1, ans);
        }
        int ans = num1 - num2;
        log.info(num1+" - "+num2 + " = "+ ans);
        return new SumDto(num1, num2, ans);
    }

    /**
     * Return the sum for the minus sums.
     * @param length is the number of digits.
     * @return the object of SumDto with the values and answer.
     */

    public SumDto allPositiveWholeNumberWithoutCarry(int length){
        if(length > 19){
            throw new IllegalLengthException("Length cannot be more than 19");
        }
        Random random = new Random();
        StringBuilder stringBuilder1 = new StringBuilder(length);
        StringBuilder stringBuilder2 = new StringBuilder(length);
        for(int i = 0 ; i < length; i++){
            int num1 = random.nextInt(10);
            int num2 = random.nextInt(10);
            if(num1 < num2){
                stringBuilder1.append(num2);
                stringBuilder2.append(num1);
            } else {
                stringBuilder1.append(num1);
                stringBuilder2.append(num2);
            }
        }
        long num1 = Long.parseLong(stringBuilder1.toString());
        long num2 = Long.parseLong(stringBuilder2.toString());
        long ans = num1- num2;
        log.info(num1+" - "+num2 + " = "+ ans);
        return new SumDto(num1, num2, ans);
    }

    /**
     * Return the sum for the minus sums with carry.
     * @param length is the number of digits.
     * @return the object of SumDto with the values and answer.
     */
    public SumDto allPositiveWholeNumberWithCarry(int length){
        if(length > 19){
            throw new IllegalLengthException("Length cannot be more than 19");
        }
        Random random = new Random();
        StringBuilder stringBuilder1 = new StringBuilder(length);
        StringBuilder stringBuilder2 = new StringBuilder(length);
        for(int i = 0 ; i < length; i++){
            int num1 = random.nextInt(10);
            int num2 = random.nextInt(10);

            stringBuilder1.append(num1);
            stringBuilder2.append(num2);

        }
        long num1 = Long.parseLong(stringBuilder1.toString());
        long num2 = Long.parseLong(stringBuilder2.toString());
        if(num1 < num2){
            long ans = num2- num1;
            log.info(num2+" - "+num1 + " = "+ ans);
            return new SumDto(num2, num1, ans);
        }
        long ans = num1- num2;
        log.info(num1+" - "+num2 + " = "+ ans);
        return new SumDto(num1, num2, ans);
    }


    /**
     * All negative and positive answer could be possible.
     * @param length is the number in digit; not more than 19
     * @return the SumDto object
     */
    public SumDto allPositiveWholeNumberMixedAnswer(int length){
        if(length > 19){
            throw new IllegalLengthException("Length cannot be more than 19");
        }
        Random random = new Random();
        StringBuilder stringBuilder1 = new StringBuilder(length);
        StringBuilder stringBuilder2 = new StringBuilder(length);
        for(int i = 0 ; i < length; i++){
            int num1 = random.nextInt(10);
            int num2 = random.nextInt(10);

            stringBuilder1.append(num1);
            stringBuilder2.append(num2);

        }
        long num1 = Long.parseLong(stringBuilder1.toString());
        long num2 = Long.parseLong(stringBuilder2.toString());
        long ans = num1- num2;
        log.info(num1+" - "+num2 + " = "+ ans);
        return new SumDto(num1, num2, ans);
    }
}
