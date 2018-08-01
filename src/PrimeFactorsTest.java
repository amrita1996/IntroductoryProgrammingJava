import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.*;

import static java.util.Arrays.asList;



public class PrimeFactorsTest {

    @Test
    public void primeFactorsForOne() {
        PrimeFactors prime = new PrimeFactors(1);

        assertEquals(Collections.emptyList(),prime.generate());

    }

    @Test
    public void primeFactorsForNonPrimeNumbers() {
        int number = 30;
        PrimeFactors prime = new PrimeFactors(number);

        assertEquals(asList(2,3,5),prime.generate());
    }

    @Test
    public void primeFactorsForPrimeNumbers() {

        PrimeFactors prime = new PrimeFactors(5);

        assertEquals(Collections.emptyList(),prime.generate());

    }



}