public class Punto {
    double x, y;
     Punto(){ //punto en el origen
        x=0;
        y=0;
    }
    Punto (double a , double b){ //constructor de punto                      
        this.x=a;
        this.y=b;
    }
    double getX(){ //coordenada x del punto
        return this.x;
    }
    double getY(){ //coordenada y del punto
        return this.y;
    }
     double distancia(Punto p){ //halla la distancia entre dos puntos
        System.out.println("se utiliza la formula x2-x1 y y2-y1");
        double distancia=0;
        double distanciaX=Math.abs(x-p.x); //p.x representa la coord. x del punto dado
        double distanciaY=Math.abs(y-p.y); //p.y representa la coord. y del punto dado
        distanciaX=distanciaX*distanciaX;
        distanciaY=distanciaY*distanciaY;
        distancia=Math.sqrt(distanciaX+distanciaY);
        return distancia;
    }
    void x(double a){
        x=a;
    }
    void y(double b){
        y=b;
    }
    void trasladar(double a, double b){ //se le suman las coordenadas dadas
        x=x+a;
        y=y+b;
    }
    public String toString(){ //metodo toString¡¡¡¡¡
        return "("+x+","+y+")";
    }
}