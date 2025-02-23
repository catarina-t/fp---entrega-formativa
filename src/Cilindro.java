public class Cilindro {
    private double raio;
    private double altura;

    //Declare um metodo de intancia para calcular o volume do cilindro

    public void setAltura(double a){
        altura=a;
    }
    public void setRaio(double r){
        raio=r;
    }

    // volume cilindro = Ab*h = (pi*r^2)*h
    public double calcularVolume () {
        return Math.PI * Math.pow(raio, 2) * altura;
    }
}
