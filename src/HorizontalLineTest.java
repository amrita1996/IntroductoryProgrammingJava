

public class HorizontalLineTest {

    public static void main(String[] args) {

        Helper helper = new Helper();

        String input = helper.getUserInput("Enter the length");
        int n = Integer.parseInt(input);

        HorizontalLine hLine = new HorizontalLine(n);

        hLine.printLine();



    }

}