public interface Expirable
{
    /**
     * Restituisce TRUE se l'oggetto NON è scaduto
     * FALSE se è scaduto
     * @return
     */
    boolean isValid();
}
