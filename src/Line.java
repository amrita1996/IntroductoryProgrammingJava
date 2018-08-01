public abstract class Line {

    char symbol = '*';
    int length;

    Line (char symbol, int length) {
        this.symbol=symbol;
        this.length=length;
    }

    Line (int length) {
        this.length=length;
    }

    abstract void printLine();

}
