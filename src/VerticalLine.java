public class VerticalLine extends Line {

    VerticalLine(int n) {
        super(n);
    }

    void printLine() {
        for (int i = 0; i < length; i++) {
            System.out.println(symbol);
        }
    }
}
