package Experiment.lab5;

public class Lab5Cub extends Lab5Rect {
    private int height;
    
    Lab5Cub(){}
    
    Lab5Cub(int length, int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void set(int length, int width, int height){
        super.set(length, width);
        this.height = height;
    }

    @Override
    public int area(){
        return (length * width + length * height + width * height) * 2;
    }
    
    public int vol() {
        return (length * width * height);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
