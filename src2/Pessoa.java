public class Pessoa {
    private float idade;
    private String nome;
    private float altura;
    private float peso;

    public float getIdade() {
        return idade;
    }
    public void setIdade(float idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float calcularIMC() {
        return (this.peso / this.altura * this.altura);
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade + " anos");
        System.out.println("Altura: " + this.altura + " m");
        System.out.println("Peso: " + this.peso + " kg");
        System.out.println("IMC: " + calcularIMC());

    }










}
