import java.util.ArrayList;

public class PrimeFactorsTest {

    public static void main(String[] args) {

        int number  = Integer.parseInt(new Helper().getUserInput("Enter a number"));

        ArrayList<Integer> pFactors = new PrimeFactors(number).generate();

        System.out.println("Prime Factors of "+number+" : "+pFactors);
    }




}