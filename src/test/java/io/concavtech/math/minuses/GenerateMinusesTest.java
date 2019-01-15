package io.concavtech.math.minuses;

import dtos.SumDto;
import io.concavtech.math.exceptions.IllegalLengthException;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class GenerateMinusesTest {

    @Test(expected = IllegalLengthException.class)
    public void testAllPositiveWholeNumberWithCarryLargeLengthException(){
        GenerateMinuses generateMinuses = new GenerateMinuses();
        generateMinuses.allPositiveWholeNumberWithCarry(20);

    }

    @Test
    public void testAllPositiveWholeNumberWithCarry(){
        GenerateMinuses generateMinuses = new GenerateMinuses();
        SumDto dto = generateMinuses.allPositiveWholeNumberWithCarry(3);
        Assert.assertThat(dto.getNum1() - dto.getNum2(), is(dto.getAnswer()));
    }
}
