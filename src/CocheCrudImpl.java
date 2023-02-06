public class CocheCrudImpl implements CocheCRUD{


    /**
     * Guarda un Coche
     */
    @Override
    public void save() {
        System.out.println("Metodo guardar un coche");
    }

    /**
     * Imprime todos los Coches
     */
    @Override
    public void findAll() {
        System.out.println("Metodo Recuperar todos los coches");
    }


    /**
     * Elimina un Coche
     */
    @Override
    public void delete() {
        System.out.println("Metodo eliminar un coche");
    }
}
