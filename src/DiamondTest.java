public class DiamondTest {

    public static void main(String[] args) {

        int n = Integer.parseInt(new Helper().getUserInput("Enter the height"));

        new Diamond(n).printDiamond();

    }

}