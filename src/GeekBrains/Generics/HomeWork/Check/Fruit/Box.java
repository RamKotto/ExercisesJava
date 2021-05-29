package GeekBrains.Generics.HomeWork.Check.Fruit;

import java.util.ArrayList;
import java.util.Iterator;

public class Box<T extends Fruit> {
    private final ArrayList<T> fruits = new ArrayList<>();

    public float getWeight() {
        if (fruits.size() == 0) {
            return 0.0f;
        }
        if (fruits.get(0) instanceof Apple) {
            return fruits.size() * 1.0f;
        } else if (fruits.get(0) instanceof Orange) {
            return fruits.size() * 1.5f;
        }
        return 0.0f;
    }

    public Box() {

    }

    public void addFruit(T fruit) {
        this.fruits.add(fruit);
    }

    public boolean compareByWeight(Box<?> b2) {
        return this.getWeight() == b2.getWeight();
    }

    // Очень подозрительный метод. Сравнение двух классов коробок.
    // Переписал с препода. Зачем?!
    public boolean compareByType(Box<?> b2) {
        return this.getClass() == b2.getClass();
    }

    public boolean compareByTypeAndWeight(Box<T> b2) {
        return this.getWeight() == b2.getWeight();
    }

    // Пересыпание фруктов из одной коробки в другую.
    public void pourTo(Box<T> b2) {
        Iterator<T> fruitIterator = fruits.iterator();
        while (fruitIterator.hasNext()) {
            T fruit = fruitIterator.next();
            b2.addFruit(fruit);
            fruitIterator.remove();
        }
    }
}
