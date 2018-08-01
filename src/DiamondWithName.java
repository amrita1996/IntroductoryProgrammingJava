public class DiamondWithName {

    int height;
    String name;

    DiamondWithName(int height, String name) {
        this.height = height;
        this.name = name;
    }

    void printDiamondWithName() {

        for(int i = 0; i < height-1; i++) {

            for(int j = height-i-1; j > 0; j--)

                System.out.print(" ");

            for(int k = 0; k < (2*i+1); k++)

                System.out.print("*");

            System.out.print("\n");
        }
        System.out.print(name+"\n");
        for(int i = height - 2; i >= 0; i--) {

            for(int j = height-i-1; j > 0; j--)

                System.out.print(" ");

            for(int k = 0; k < (2*i+1); k++)

                System.out.print("*");

            System.out.print("\n");

        }


    }

}
