public class Jellybean extends Sweets {
    private int size;

    protected Jellybean() {
        super("Жевательная конфета", 20, 10);
        this.size = 5;
    }

    @Override
    public String getUnique() {
        return "Размер: " + size;
    }

    //Тут мог быть сеттер на уникальный параметр
}
