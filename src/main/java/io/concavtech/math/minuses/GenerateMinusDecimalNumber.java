package io.concavtech.math.minuses;

import io.concavtech.math.dtos.SumDecimalDto;
import io.concavtech.math.exceptions.IllegalLengthException;
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
     * @return the object of SumDecimalDto with the values and answer.
     */
    public SumDecimalDto singleDigitPositiveDecimalNumber(){
        SumDecimalDto dto = null;
        Random random = new Random();
        double num1 = random.nextInt(10);
        double num2 = random.nextInt(10);
        if(num1 < num2) {
            double ans = num2 - num1;
            log.info(num2+" - "+num1 + " = "+ ans);
            return new SumDecimalDto(num2, num1, ans);
        }
        double ans = num1 - num2;
        log.info(num1+" - "+num2 + " = "+ ans);
        return new SumDecimalDto(num1, num2, ans);
    }

    /**
     * Return the sum for the minus sums.
     * @param length is the number of digits.
     * @return the object of SumDecimalDto with the values and answer.
     */

    public SumDecimalDto allPositiveDecimalNumberWithoutCarry(int length){
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
        int decimalPosition1 = random.nextInt(length-1);
        if(decimalPosition1 < 1){
            decimalPosition1 = 1;
        }
        stringBuilder1.insert(decimalPosition1, ".");
        stringBuilder2.insert(decimalPosition1, ".");
        double num1 = Double.parseDouble(stringBuilder1.toString());
        double num2 = Double.parseDouble(stringBuilder2.toString());
        double ans = num1- num2;
        log.info(num1+" - "+num2 + " = "+ ans);
        return new SumDecimalDto(num1, num2, ans);
    }

    /**
     * Return the sum for the minus sums with carry.
     * @param length is the number of digits.
     * @return the object of SumDecimalDto with the values and answer.
     */
    public SumDecimalDto allPositiveDecimalNumberWithCarry(int length){
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
        int decimalPosition1 = random.nextInt(length-1);
        if(decimalPosition1 < 1){
            decimalPosition1 = 1;
        }
        stringBuilder1.insert(decimalPosition1, ".");
        stringBuilder2.insert(decimalPosition1, ".");
        double num1 = Double.parseDouble(stringBuilder1.toString());
        double num2 = Double.parseDouble(stringBuilder2.toString());
        if(num1 < num2){
            double ans = num2- num1;
            log.info(num2+" - "+num1 + " = "+ ans);
            return new SumDecimalDto(num2, num1, ans);
        }
        double ans = num1- num2;
        log.info(num1+" - "+num2 + " = "+ ans);
        return new SumDecimalDto(num1, num2, ans);
    }


    /**
     * All negative and positive answer could be possible.
     * @param length is the number in digit; not more than 19
     * @return the SumDecimalDto object
     */
    public SumDecimalDto allPositiveDecimalNumberMixedAnswer(int length){
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
        int decimalPosition1 = random.nextInt(length-1);
        if(decimalPosition1 < 1){
            decimalPosition1 = 1;
        }
        stringBuilder1.insert(decimalPosition1, ".");
        stringBuilder2.insert(decimalPosition1, ".");
        double num1 = Double.parseDouble(stringBuilder1.toString());
        double num2 = Double.parseDouble(stringBuilder2.toString());
        double ans = num1- num2;
        log.info(num1+" - "+num2 + " = "+ ans);
        return new SumDecimalDto(num1, num2, ans);
    }
}
