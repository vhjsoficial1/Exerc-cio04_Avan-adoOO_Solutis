public abstract class AnimalMarinhoAB extends AnimalAB {
    private int quantNadadeiras;

    public AnimalMarinhoAB(String nome, int idade, String habitat, double altura, double peso, int quantNadadeiras) {
        super(nome, "Marinho", idade, habitat, altura, peso);
        this.quantNadadeiras = quantNadadeiras;
    }

    public int getQuantNadadeiras() {
        return quantNadadeiras;
    }

    public void setQuantNadadeiras(int quantNadadeiras) {
        this.quantNadadeiras = quantNadadeiras;
    }
}