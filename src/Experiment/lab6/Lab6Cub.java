package Experiment.lab6;

public class Lab6Cub extends Lab6Rect {
    private int height;

    Lab6Cub(int length, int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public int area(){
        return (length * width + length * height + width * height) * 2;
    }

    @Override
    public int peri() {
        return (length + width + height) * 4;
    }
}
