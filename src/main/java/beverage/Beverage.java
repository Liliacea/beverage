package beverage;

public abstract class Beverage {
    public enum Size {TALL, SMALL, AVERAGE};
    Size size;
    String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public Size getSize() {

        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract Double cost();
}
