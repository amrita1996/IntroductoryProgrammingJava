public class DiamondWithNameTest {

    public static void main(String[] args) {

        int n = Integer.parseInt(new Helper().getUserInput("Enter the height"));
        String name = new Helper().getUserInput("Enter the name");

        new DiamondWithName(n, name).printDiamondWithName();

    }

}