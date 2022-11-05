package Experiment.lab6;

public abstract class Shape {
    private int length;
    private int width;
    private int height;

    public Shape() {
    }

    public Shape(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public abstract int area();
    public abstract int peri();

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

}
