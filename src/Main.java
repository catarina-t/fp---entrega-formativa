//Declare uma classe principal, contendo o método main (), a partir do qual seja instanciado um objeto da classe Cilindro

public class Main {
    public static void main(String[] args) {

        Cilindro cilindro = new Cilindro();
        cilindro.setRaio(3);
        cilindro.setAltura(3);
        cilindro.calcularVolume();

        System.out.println("Volume: " + cilindro.calcularVolume());

    }
}