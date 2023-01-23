public class Main {

    static CocheCRUD cocheCRUD = new CocheCrudImpl();
    public static void main(String[] args) {
        cocheCRUD.save();
        cocheCRUD.findAll();
        cocheCRUD.delete();
    }
}