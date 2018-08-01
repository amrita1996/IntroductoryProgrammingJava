public class HorizontalLine extends Line{

    HorizontalLine(int n) {
        super(n);
    }

    @Override
    void printLine() {
        for(int i = 0; i < length; i++)
            System.out.print(symbol);
    }
}
