package geometry;
import resizeable.Resizeable;

public class Square extends Rectangle implements Resizeable {

    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void resize(double percent) {
        this.width = this.width * percent / 100;
        this.height = this.height * percent / 100;
    }

}
