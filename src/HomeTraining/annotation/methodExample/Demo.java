package HomeTraining.annotation.methodExample;

public class Demo {
    public static void main(String [] args) throws Exception {
        TestAnnotationAnalyzer analyzer = new TestAnnotationAnalyzer();
        analyzer.analyz(MyTester.class);
    }
}
