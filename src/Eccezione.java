public class Eccezione {
    public void arrayDivision(int[] arrayNumeri) {
        for(int i = 0; i < arrayNumeri.length; i++) {
            try {
                int result = arrayNumeri[i] / 0;
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("Errore: impossibile dividere per 0");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Errore: indice " + i + " non esistente sul array");
            } finally {
                System.out.println("Finita gestione di errori");
            }
        }
    }
}
