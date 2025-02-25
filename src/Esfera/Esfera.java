package Esfera;

public class Esfera {
    double pi = 3.14;

//        public static void pi(){
//            double PI = 3.14;
//        }

    private float raio;

    public Esfera(float raio) {
        this.raio = raio;
    }


    public double calcularVolume(){
        double volume = (4.0/3.0) * Math.PI * Math.pow(getRaio(),3);
        return volume;
    }

    public double calcularArea(){
        double area = 4 * pi * Math.pow(getRaio(),2);
        return area;
    }


    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
}
