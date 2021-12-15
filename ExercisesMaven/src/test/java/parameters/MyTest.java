package parameters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;

public class MyTest {

    @DataProvider(parallel = true)   // параллель для многопоточности
    public Object[][] provider() {
        return new Object[][] {
                {"sss"},
                {"aaaaaaaaa"},
                {"zzzzzzzzzzzzzzzzzzzzzzzz"}
        };
    }
    // threadPoolSize - количство потоков, priority - приоритетночть (чем меньше число, тем выше приоритет)
//    @Test ( expectedExceptions = { IOException.class, NullPointerException.class } )
    @Test(enabled = true, dataProvider = "provider", threadPoolSize = 10, priority = 1)
//    @Parameters("myName")                   // for xml
    public void myTestProgram(String myName) {
        for (int i = 0; i < 1000; i++) {
            System.out.println(myName);
        }
    }

    @Test(dependsOnMethods = "myTestProgram")
    public void secondTest() {
        System.out.println("Hello World!");
    }

    public void myMethod(int a, String[]... srt) {
        System.out.println("Hello World!");
    }
}
