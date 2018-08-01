abstract public class Triangle {
    char symbol='*';
    int height;

    Triangle(int height) {
        this.height = height;
    }

    Triangle(char symbol, int height){
        this.symbol = symbol;
        this.height=height;
    }

    abstract void printTriangle() ;
}
