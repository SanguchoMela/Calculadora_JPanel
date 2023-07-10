public class Operaciones {
    //atributos ---------------------------------------------------
    private double x;
    private double y;

    //constructores ---------------------------------------------------
    public Operaciones(double x) {
        this.x = x;
    }

    public Operaciones(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //setters y getters ---------------------------------------------------
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    //metodos operaciones basicas ---------------------------------------------------
    public double sumar(){
        return x+y;
    }
    public double restar(){
        return x-y;
    }

    public double multiplicar(){
        return x*y;
    }
    public double dividir(){
        return x/y;
    }
}
