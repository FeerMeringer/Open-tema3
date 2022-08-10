public class PruebaCoche {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        for (int i = 0; i < 5; i++) miCoche.AgregarPuertas();
        System.out.print(miCoche.puertas);
    }


    static class Coche {

        public int puertas = 0;

        public void AgregarPuertas() {
            this.puertas++;
        }
    }
}
