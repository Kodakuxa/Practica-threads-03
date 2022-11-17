public class Tortuga extends Thread {
    char[] pista;

    public Tortuga(char[] a) {
        this.pista = a;
    }

    @Override
    public void run() {
        boolean ganador = false;
        int posicion = 0;

        while (ganador == false) {
            System.out.println("");
            int pasos = (int) Math.floor(Math.random() * (100) + 1);

            if (pasos <= 50) {
                if ((posicion + 6) > 69) {
                    posicion = 69;
                } else {
                    pista[posicion] = 0;
                    posicion = posicion + 6;
                    pista[posicion] = 'T';
                }
                Posiciones(pista);
                ganador = Victoria(posicion, ganador);
            }

            if (pasos > 50 && pasos <= 70) {
                pista[posicion] = 0;
                if ((posicion - 6) < 0) {
                } else {
                    posicion = posicion - 6;
                }
                Posiciones(pista);
            }

            if (pasos > 70 && pasos <= 100) {
                if ((posicion + 1) > 69){
                    posicion = 69;
                } else {
                    pista[posicion] = 0;
                    posicion = posicion + 1;
                    pista[posicion] = 'T';
                }
                Posiciones(pista);
                ganador = Victoria(posicion, ganador);
            }
        }
    }

    public static void Posiciones(char[] pista) {
        for (int i = 0; i < pista.length; i++) {
            if (pista[i] == 0) {
                System.out.print(" ");
            } else {
                System.out.print(pista[i]);
            }
        }
    }

    public static boolean Victoria(int posicion, boolean ganador) {
        if (posicion == 69) {
            ganador = true;
            System.out.printf("La Tortuga es la ganadora ");
        }
        return ganador;
    }
}