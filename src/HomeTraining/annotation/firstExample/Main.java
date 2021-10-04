package HomeTraining.annotation.firstExample;

import java.lang.reflect.Field;

public class Main {
    @FieldCustomVal
    public String myFieldWithDefaultVal;

    @FieldCustomVal(value = "My custom val")
    public String myFieldWithCustomVal;

    public static void main(String[] args) throws IllegalAccessException {
        Main m = new Main();
        //тут рефлексия
        for (Field field : Main.class.getFields()) {
            FieldCustomVal fieldCustomVal = field.getAnnotation(FieldCustomVal.class);
            field.set(m, fieldCustomVal.value());
        }
        //конец рефлексии
        System.out.println(m.myFieldWithCustomVal);
        System.out.println(m.myFieldWithDefaultVal);
    }
}
