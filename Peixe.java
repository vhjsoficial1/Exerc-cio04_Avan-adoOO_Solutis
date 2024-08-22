public class Peixe extends AnimalMarinhoAB {

    public Peixe(String nome, int idade, String habitat, double peso, double altura, int quantidadeNadadeiras) {
        super(nome, idade, habitat, peso, altura, quantidadeNadadeiras);
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
