
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Gift {

    private List<Sweets> gift = new ArrayList();
    private double totalWeight;
    private double totalPrice;

    public String showGift() {
        totalPrice = 0;
        totalWeight = 0;
        String candys = "";
        for (Sweets f : gift) {
            totalPrice += f.getPrice();
            totalWeight += f.getWeight();
            candys += f.getName() + "\n";
        }
        return candys;
    }

    public String getTotalPrice() {
        String price = "" + totalPrice;
        return price;
    }

    public String getTotalWeight() {
        String weight = "" + totalWeight;
        return weight;
    }

    public void addCandy(Sweets sweet) {
        gift.add(sweet);
    }

    public void removeCandy(String sweet) {

        //Поиск по совпадающему значению из списка. Ошибки быть не может т.к. выпонляется поиск из этого самого списка

        for (int i = 0; i < gift.size(); i++) {
            if (sweet.equals("Мармеладка") && gift.get(i) instanceof Marmalade) {
                gift.remove(i);
                break;
            } else if (sweet.equals("Шоколадка") && gift.get(i) instanceof Chocolate) {
                gift.remove(i);
                break;
            } else if (sweet.equals("Конфетка") && gift.get(i) instanceof Jellybean) {
                gift.remove(i);
                break;
            }
        }
    }
}


