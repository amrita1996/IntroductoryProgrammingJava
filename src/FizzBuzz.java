public class FizzBuzz {

    int max = 100;

    FizzBuzz() {
        generate();
    }

    FizzBuzz (int n) {
        max = n ;
        generate();
    }

    void generate() {

        for(int i = 1; i <= max; i++){

            if(i%3==0 && i%5==0)
                System.out.println("FizzBuzz");
            else if(i%3==0)
                System.out.println("Fizz");
            else if(i%5==0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }

    }
}
