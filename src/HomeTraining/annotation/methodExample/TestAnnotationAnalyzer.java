package HomeTraining.annotation.methodExample;

import java.lang.reflect.Method;

public class TestAnnotationAnalyzer {
    public void analyz(Class<?> clazz) throws Exception {
        Method[] methods = clazz.getMethods();
        int pass = 0;
        int fail = 0;

        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTester.class)) {
                // Получаем доступ к атрибутам
                MyTester test = method.getAnnotation(MyTester.class);
                Class expected = test.expected();
                try {
                    method.invoke(null);
                    pass++;
                } catch (Exception e) {
                    if (Exception.class != expected) {
                        fail++;
                    } else {
                        pass++;
                    }
                }
            }
        }
    }
}
