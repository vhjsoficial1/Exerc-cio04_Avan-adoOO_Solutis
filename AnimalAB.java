public abstract class AnimalAB implements AnimalIF {

    private String nome;
    private String tipoAnimal;
    private int idade;
    private String habitat;
    private double altura;
    private double peso;
    private int comidaConsumida;
    private int horasDormidas;
    private double distanciaPercorrida;

    public AnimalAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.habitat = habitat;
        this.altura = altura;
        this.peso = peso;
        this.comidaConsumida = 0;
        this.horasDormidas = 0;
        this.distanciaPercorrida = 0;
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getComidaConsumida() {
        return comidaConsumida;
    }

    public void setComidaConsumida(int comidaConsumida) {
        this.comidaConsumida = comidaConsumida;
    }

    public int getHorasDormidas() {
        return horasDormidas;
    }

    public void setHorasDormidas(int horasDormidas) {
        this.horasDormidas = horasDormidas;
    }

    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void setDistanciaPercorrida(double distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    @Override
    public void moverse(double distanciaPercorrida) {
    
    }

    @Override
    public void dormir(int horasDormidas) {
    
    }

    @Override
    public void comer(int quantidadeDeComida) {
    
    }
}
