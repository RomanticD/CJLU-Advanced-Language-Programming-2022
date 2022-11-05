package Experiment.lab6;

public class Lab6Rect extends Shape{
    protected int length;
    protected int width;

    Lab6Rect(){
        super();
    }

    Lab6Rect(int length, int width){
        this.length  = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int area() {
        return  width * length;
    }

    @Override
    public int peri() {
        return (length + width) * 2;
    }
}
