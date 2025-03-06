package ro.ulbs.paradigme.lab2;

public class Circle extends Form{

     private float radius;

     public Circle(){

         this.radius = radius;
     }

    public Circle(float radius, String color){
        super(color);
        this.radius = radius;
    }

    @Override
    public float getArea() {
       double pi = 3.14;
       float pi1 = (float) Math.PI;
       return radius*radius*pi1;
     }

     @Override
     public String toString(){
         return "Radius: " + radius;
     }

}
