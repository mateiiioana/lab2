package ro.ulbs.paradigme.lab2;

public class Triangle extends Form {

    private float height;
    private float base;


    public Triangle(){

        this.height = height;
        this.base = base;
    }

    public Triangle(float height, float base, String color){
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public float getArea() {
        return base*height/2;
    }

    @Override
    public String toString(){
        return "Height: " + height + " Base: " + base;
    }

    public boolean equals() {
        if (base == height) {
            return true;
        } else {
            return false;
        }
    }
}
