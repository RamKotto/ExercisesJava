package GeekBrains.Generics.HomeWork.FruitsTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    ArrayList<T> fruitBox;

    public Box(T... fruits) {
        this.fruitBox = new ArrayList<>(Arrays.asList(fruits));
    }

    public ArrayList<T> getFruitBox() {
        return fruitBox;
    }

    public void setFruitBox(ArrayList<T> fruitBox) {
        this.fruitBox = fruitBox;
    }

    public void addFruitToBox(T fruit) {
        fruitBox.add(fruit);
    }

    public float getWeight() {
        float sum = 0;
        for (T fruit : fruitBox) {
            sum += fruit.getWEIGHT();
        }
        return sum;
    }

    public int getCountOfFruits() {
        return fruitBox.size();
    }

    public boolean compare(Box<? extends Fruit> secondBox) {
        return Math.abs(this.getWeight() - secondBox.getWeight()) < 0.0001;
    }

    public void shiftFruits(Box<T> secondBox) {
        for (int i = 0; i < fruitBox.size(); i++) {
            secondBox.addFruitToBox(fruitBox.get(i));
        }
        fruitBox.clear();
    }
}
