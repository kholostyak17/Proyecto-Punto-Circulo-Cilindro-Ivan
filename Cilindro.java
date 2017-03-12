public class Cilindro extends Circulo{
    double altura;
    Circulo base;
    Cilindro(){ //cilindro en el origen con radio unitario y altura unitaria
        base = new Circulo();
        altura = 1;
    }
    Cilindro(Circulo bs, double alt){ //constructor de clindro
        base = bs;
        altura = alt;
    } 
    public Circulo base(){ //base del cilindro, que la ha heredado del circulo
        return base;
    }
    public double altura(){ //altura del cilindro
        return altura;
    }
    public void base(Circulo bs){
        base = bs;
    }
    public void altura(double alt){
        altura = alt;
    }
    public void trasladar(double a, double b){ //se traslada el centro de la base, esta funcion es heredada de circulo, y a su vez de punto
        base.trasladar(a, b);
    }
    public String toString(){ //metodo toString¡¡¡¡
        String base1 = "en la base del cilindro "+base.toString();
        return base1+" y la altura del cilindro es "+altura+"unidades";
    }
}
    