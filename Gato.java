public class Gato extends AnimalTerrestreAB {
    public Gato(String nome, int idade, String habitat, double altura, double peso, int quantidadePatas) {
        super(nome, idade, habitat, altura, peso, quantidadePatas);
    }

    @Override
    public void comer(int quantidadeDeComida) {
        setComidaConsumida(getComidaConsumida() + quantidadeDeComida);
    }

    @Override
    public void moverse(double distanciaPercorrida) {
        setDistanciaPercorrida(getDistanciaPercorrida() + distanciaPercorrida);
    }

    @Override
    public void dormir(int horasDormidas) {
        setHorasDormidas(getHorasDormidas() + horasDormidas);
    }

}