public abstract class AnimalTerrestreAB extends AnimalAB {
    private int quantPatas;

    public AnimalTerrestreAB(String nome, int idade, String habitat, double altura, double peso, int quantPatas) {
        super(nome, "Terrestre", idade, habitat, altura, peso);
        this.quantPatas = quantPatas;
    }

    public int getQuantPatas() {
        return quantPatas;
    }

    public void setQuantPatas(int quantPatas) {
        this.quantPatas = quantPatas;
    }
}