package io.concavtech.math.minuses;

import io.concavtech.math.dtos.SumDecimalDto;
import io.concavtech.math.dtos.SumDecimalDto;
import io.concavtech.math.exceptions.IllegalLengthException;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class GenerateMinusesDecimalNumberTest {

    @Test
    public void TestSingleDigitPositiveWholeNumber() {
        GenerateMinusDecimalNumber generateMinuses =  GenerateMinusDecimalNumber.getInstance();
        for (int i=0; i < 100; i++) {
            SumDecimalDto dto = generateMinuses.singleDigitPositiveDecimalNumber();
            Assert.assertThat(dto.getNum1() - dto.getNum2(), is(dto.getAnswer()));
        }
    }

    @Test(expected = IllegalLengthException.class)
    public void testAllPositiveDecimalNumberWithoutCarryLargeLengthException(){
        GenerateMinusDecimalNumber generateMinuses = GenerateMinusDecimalNumber.getInstance();
        generateMinuses.allPositiveDecimalNumberWithoutCarry(20);

    }

    @Test
    public void TestAllPositiveDecimalNumberWithoutCarry(){
        GenerateMinusDecimalNumber generateMinuses = GenerateMinusDecimalNumber.getInstance();
        for (int i=0; i < 100; i++) {
            SumDecimalDto dto = generateMinuses.allPositiveDecimalNumberWithoutCarry(3);
            Assert.assertThat(dto.getNum1() - dto.getNum2(), is(dto.getAnswer()));
        }
    }

    @Test(expected = IllegalLengthException.class)
    public void testAllPositiveDecimalNumberWithCarryLargeLengthException(){
        GenerateMinusDecimalNumber generateMinuses = GenerateMinusDecimalNumber.getInstance();
        generateMinuses.allPositiveDecimalNumberWithCarry(20);

    }

    @Test
    public void testAllPositiveDecimalNumberWithCarry(){
        GenerateMinusDecimalNumber generateMinuses = GenerateMinusDecimalNumber.getInstance();
        for (int i=0; i < 100; i++) {
            SumDecimalDto dto = generateMinuses.allPositiveDecimalNumberWithCarry(3);
            Assert.assertThat(dto.getNum1() - dto.getNum2(), is(dto.getAnswer()));
        }
    }

    @Test(expected = IllegalLengthException.class)
    public void testAllPositiveDecimalNumberMixedAnswerException(){
        GenerateMinusDecimalNumber generateMinuses = GenerateMinusDecimalNumber.getInstance();
        generateMinuses.allPositiveDecimalNumberMixedAnswer(20);

    }

    @Test
    public void testAllPositiveDecimalNumberMixedAnswer(){
        GenerateMinusDecimalNumber generateMinuses = GenerateMinusDecimalNumber.getInstance();
        for (int i=0; i < 100; i++) {
            SumDecimalDto dto = generateMinuses.allPositiveDecimalNumberMixedAnswer(3);
            Assert.assertThat(dto.getNum1() - dto.getNum2(), is(dto.getAnswer()));
        }
    }
}
