public class VerticalLineTest {

    public static void main(String[] args) {
        Helper helper = new Helper();

        String input = helper.getUserInput("Enter the length");
        int n = Integer.parseInt(input);

        VerticalLine vLine = new VerticalLine(n);
        vLine.printLine();
    }
}