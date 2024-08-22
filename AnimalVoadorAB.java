public abstract class AnimalVoadorAB extends AnimalAB {
    private int quantAsas;
    private double envergaduraAsas;

    public AnimalVoadorAB(String nome, int idade, String habitat, double altura, double peso, int quantAsas, double envergaduraAsas) {
        super(nome, "Marinho", idade, habitat, altura, peso);
        this.quantAsas = quantAsas;
        this.envergaduraAsas = envergaduraAsas;
    }

    public int getQuantAsas() {
        return quantAsas;
    }

    public void setQuantAsas(int quantAsas) {
        this.quantAsas = quantAsas;
    }

    public double getEnvergaduraAsas() {
        return envergaduraAsas;
    }

    public void setEnvergaduraAsas(double envergaduraAsas) {
        this.envergaduraAsas = envergaduraAsas;
    }
}