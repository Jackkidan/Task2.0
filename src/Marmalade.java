public class Marmalade extends Sweets {
    private String color;

    protected Marmalade() {
        super("Мармеладка", 10, 5);
        this.color = "Красный";
    }

    @Override
    public String getUnique() {
        return "Цвет: " + color;
    }

    //Тут мог быть сеттер на уникальный параметр
}
