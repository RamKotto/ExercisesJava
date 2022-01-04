package GeekBrains.Annotations.HomeWorkAnnotation;

import GeekBrains.Annotations.HomeWorkAnnotation.myTesting.TestsHandler;

public class Main {
    public static void main(String[] args) {
        ClassForTesting classForTesting = new ClassForTesting();
        TestsHandler.start(classForTesting.getClass());
    }
}
