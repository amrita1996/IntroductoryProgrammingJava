public class RightTriangle extends Triangle {

    RightTriangle (int height) {
        super(height);

    }

    void printTriangle() {

        for(int i = 0; i < height; i++) {

            for(int j=0; j<=i; j++)

                System.out.print(symbol);
            System.out.print("\n");
        }

    }
}
