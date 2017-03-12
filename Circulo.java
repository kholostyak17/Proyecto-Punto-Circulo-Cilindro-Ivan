public class Circulo extends Punto{
    double radio;
    Punto centro;
    Circulo(){ //circulo en el origen con radio unitario
        centro = new Punto();
        radio = 1;
    }
    Circulo(Punto punt, double rad){ //constructor de circulo
        centro = punt;
        radio = rad;
    }
    Punto centro(){ //centro del circulo, que ha sido heredado de punto
        return centro;
    }
    double radio(){ //radio del circulo
        return radio;
    }
    void centro(Punto punt){
        centro = punt;
    }
    void radio(double rad){
        radio  = rad;
    }
    void trasladar(double a, double b){ //se hereda de punto y funciona igual, pero con el centro
        centro.trasladar(a, b);
    }
    public String toString(){ //metodo toStruing¡¡¡¡¡¡¡
        String centro1 = centro.toString();
        return "el punto del centro es "+centro1+" y el radio mide "+radio+"unidades";
    }
}