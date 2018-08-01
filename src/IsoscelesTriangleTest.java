public class IsoscelesTriangleTest {

    public static void main(String[] args) {

        String input = new Helper().getUserInput("Enter the height");
        int n = Integer.parseInt(input);

        new IsoscelesTriangle(n).printTriangle();
    }

}