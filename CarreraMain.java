public class CarreraMain {

    public static void main(String[] args) {

        char[] pista;
        pista = new char[70];

        Thread liebre = new Thread(new Tortuga(pista));
        Thread tortuga = new Thread(new Liebre(pista));

        liebre.setName("LiebreThread");
        tortuga.setName("TortguaThread");

        System.out.println("Inicio de la Carerra");
        liebre.start();
        tortuga.start();
    }
}