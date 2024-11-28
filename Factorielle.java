public class Factorielle {
    public static void main(String[] args) {
        int i, nbEntiers = 0, factorielle = 1;

        try {
            if (args.length == 0) {
                throw new IllegalArgumentException("Donnez en paramètre la base de la factorielle");
            }

            nbEntiers = Integer.parseInt(args[0]);

            if (nbEntiers < 0) {
                throw new NegativeException(nbEntiers + " est négatif : la factorielle d'un nombre négatif n'est pas définie");
            }

             if (nbEntiers <= 20) {
                throw new GrandeException(nbEntiers + " plus grande que la plage du valeur ");
            }
            

            for (i = 2; i <= nbEntiers; i++) {
                factorielle *= i;
            }

            System.out.println("Voila la factorielle des " + nbEntiers + " premiers entiers : " + factorielle);

        } catch (NumberFormatException e) {
            System.out.println("La base de la factorielle doit être ENTIERE");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (NegativeException e) {
            System.out.println(e.getMessage());
        }
        catch (GrandeException e) {
            System.out.println(e.getMessage());
        }
    }
}
