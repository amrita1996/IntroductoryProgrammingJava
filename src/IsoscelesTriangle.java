public class IsoscelesTriangle extends Triangle {

    IsoscelesTriangle(int n) {

        super(n);

    }

    @Override
    void printTriangle(){

        for (int i  = 0; i < height; i++) {

            for(int j = height-i-1; j > 0; j--)

                System.out.print(" ");

            for(int k = 0; k < (2*i+1); k++)

                System.out.print("*");

            System.out.print("\n");

        }
    }

}
