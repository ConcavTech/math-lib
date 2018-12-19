package io.concavtech.math.minuses;

import dtos.SumDto;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class GenerateMinusesTest {

    @Test
    public void testAllPositiveNumber(){
        GenerateMinuses generateMinuses = new GenerateMinuses();
        SumDto dto = generateMinuses.allPositiveNumber(999);
        Assert.assertThat(dto.getNum1() - dto.getNum2(), is(dto.getAnswer()));
    }
}
