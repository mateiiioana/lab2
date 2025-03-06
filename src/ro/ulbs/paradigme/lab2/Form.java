package ro.ulbs.paradigme.lab2;

public class Form {

    public String color;

    public Form(){

        String color = "white";
    }

    public Form(String color){
        this.color = color;
    }

    public float getArea(){
        return 0;
    }

    public String toString(){
        return "This form has the color: " + color;
    }


}
