public class Chocolate extends Sweets {

    private int kkal;

    protected Chocolate() {
        super("Шоколадка", 100, 50);
        this.kkal = 465;
    }

    @Override
    public String getUnique() {
        return kkal + "kkal";
    }

    //Тут мог быть сеттер на уникальный параметр
}
