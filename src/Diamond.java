public class Diamond {

    int height;

    Diamond(int n) {

        this.height = n;

    }

    void printDiamond() {

        for(int i = 0; i < height; i++) {

            for(int j = height-i-1; j > 0; j--)

                System.out.print(" ");

            for(int k = 0; k < (2*i+1); k++)

                System.out.print("*");

            System.out.print("\n");
        }

        for(int i = height - 2; i >= 0; i--) {

            for(int j = height-i-1; j > 0; j--)

                System.out.print(" ");

            for(int k = 0; k < (2*i+1); k++)

                System.out.print("*");

            System.out.print("\n");

        }

    }
}

