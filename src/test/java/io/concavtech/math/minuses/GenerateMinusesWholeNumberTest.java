package io.concavtech.math.minuses;

import dtos.SumDto;
import exceptions.IllegalLengthException;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class GenerateMinusesWholeNumberTest {

    @Test
    public void TestSingleDigitPositiveWholeNumber() {
        GenerateMinusesWholeNumber generateMinuses =  GenerateMinusesWholeNumber.getInstance();
        for (int i=0; i < 100; i++) {
            SumDto dto = generateMinuses.singleDigitPositiveWholeNumber();
            Assert.assertThat(dto.getNum1() - dto.getNum2(), is(dto.getAnswer()));
        }
    }

    @Test(expected = IllegalLengthException.class)
    public void testAllPositiveWholeNumberWithoutCarryLargeLengthException(){
        GenerateMinusesWholeNumber generateMinuses = GenerateMinusesWholeNumber.getInstance();
        generateMinuses.allPositiveWholeNumberWithoutCarry(20);

    }

    @Test
    public void TestAllPositiveWholeNumberWithoutCarry(){
        GenerateMinusesWholeNumber generateMinuses = GenerateMinusesWholeNumber.getInstance();
        for (int i=0; i < 100; i++) {
            SumDto dto = generateMinuses.allPositiveWholeNumberWithoutCarry(3);
            Assert.assertThat(dto.getNum1() - dto.getNum2(), is(dto.getAnswer()));
        }
    }

    @Test(expected = IllegalLengthException.class)
    public void testAllPositiveWholeNumberWithCarryLargeLengthException(){
        GenerateMinusesWholeNumber generateMinuses = GenerateMinusesWholeNumber.getInstance();
        generateMinuses.allPositiveWholeNumberWithCarry(20);

    }

    @Test
    public void testAllPositiveWholeNumberWithCarry(){
        GenerateMinusesWholeNumber generateMinuses = GenerateMinusesWholeNumber.getInstance();
        for (int i=0; i < 100; i++) {
            SumDto dto = generateMinuses.allPositiveWholeNumberWithCarry(3);
            Assert.assertThat(dto.getNum1() - dto.getNum2(), is(dto.getAnswer()));
        }
    }

    @Test(expected = IllegalLengthException.class)
    public void testAllPositiveWholeNumberMixedAnswerException(){
        GenerateMinusesWholeNumber generateMinuses = GenerateMinusesWholeNumber.getInstance();
        generateMinuses.allPositiveWholeNumberMixedAnswer(20);

    }

    @Test
    public void testAllPositiveWholeNumberMixedAnswer(){
        GenerateMinusesWholeNumber generateMinuses = GenerateMinusesWholeNumber.getInstance();
        for (int i=0; i < 100; i++) {
            SumDto dto = generateMinuses.allPositiveWholeNumberMixedAnswer(3);
            Assert.assertThat(dto.getNum1() - dto.getNum2(), is(dto.getAnswer()));
        }
    }
}
