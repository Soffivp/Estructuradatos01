package practica01;

/**
 *
 * @author SALA H
 */
public class Practica01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cadenas objeto = new Cadenas();
        int opcion;
        do {
            opcion = objeto.menu();
            switch (opcion) {
                case 1:
                    objeto.caracterxcaracter();

                    break;
                case 2:
                    objeto.contari();
                    break;
                case 3:
                    objeto.palindromo();
                    break;
                case 4:
                    objeto.contarvl();
                    break;

                default:
                    throw new AssertionError();
            }

        } while (opcion != 0);
    }

}
