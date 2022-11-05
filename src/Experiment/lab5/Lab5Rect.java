package Experiment.lab5;

public class Lab5Rect {
    protected int length;
    protected int width;
    protected String name;

    Lab5Rect(){};

    Lab5Rect(int length, int width){
        this.length = length;
        this.width = width;
    }

    public void set(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public int area(){
        return width * length;
    }

    public int peri(){
        return (length + width) * 2;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setName(String name) {
        this.name = name;
    }
}

