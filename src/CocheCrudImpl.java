public class CocheCrudImpl implements CocheCRUD{
    @Override
    public void save() {
        System.out.println("Metodo guardar un coche");
    }

    @Override
    public void findAll() {
        System.out.println("Metodo Recuperar todos los coches");
    }

    @Override
    public void delete() {
        System.out.println("Metodo eliminar un coche");
    }
}
