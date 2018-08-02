import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

import static java.util.Arrays.asList;



public class PrimeFactorsTest {

    public static void main(String[] args) {

        int number  = Integer.parseInt(new Helper().getUserInput("Enter a number"));

        ArrayList<Integer> pFactors = new PrimeFactors(number).generate();

        System.out.println("Prime Factors of "+number+" : "+pFactors);
    }




}