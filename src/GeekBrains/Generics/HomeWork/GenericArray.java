package GeekBrains.Generics.HomeWork;

import java.util.ArrayList;
import java.util.Collections;

public class GenericArray<T extends Number> {
    private T[] arrayOfNumbers;

    public GenericArray(T... arrayOfNumbers) {
        this.arrayOfNumbers = arrayOfNumbers;
    }

    public T[] getArrayOfNumbers() {
        return arrayOfNumbers;
    }

    public void setArrayOfNumbers(T[] arrayOfNumbers) {
        this.arrayOfNumbers = arrayOfNumbers;
    }


    // task one:
    public void replaceObjects(T objOne, T objTwo) {
        int indexOne = 0;
        int indexTwo = 0;
        boolean haveOne = false;
        boolean haveTwo = false;

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i].equals(objOne)) {
                indexOne = i;
                haveOne = true;
            }
            if (arrayOfNumbers[i].equals(objTwo)) {
                indexTwo = i;
                haveTwo = true;
            }
        }

        if (haveOne && haveTwo) {
            arrayOfNumbers[indexOne] = objTwo;
            arrayOfNumbers[indexTwo] = objOne;

        }
    }

    // task two:
    public ArrayList<T> arrayToList() {
        ArrayList<T> newList = new ArrayList<>();
        Collections.addAll(newList, arrayOfNumbers);
        return newList;
    }
}
