import java.util.ArrayList;

public class PrimeFactors {

    int number;
    ArrayList<Integer> primeFactors = new ArrayList<Integer>();

    PrimeFactors(int number){

        this.number = number;

    }

    ArrayList<Integer> generate() {

        for(int i=2; i <= number/2; i++)

            if(isPrime(i) && number%i == 0)

                primeFactors.add(i);

        return primeFactors;


    }

    boolean isPrime (int n) {

        boolean result = true;

        for(int i = 2; i <= n/2; i++)

            if(n % i == 0) {

                result = false;
                break;

            }

        return result;

    }


}


