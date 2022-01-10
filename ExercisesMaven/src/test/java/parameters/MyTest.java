package parameters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

public class MyTest {

    @DataProvider(parallel = true)   // параллель для многопоточности
    public Object[][] provider() {
        return new Object[][] {
                {"Masha"},
                {"Dima"},
                {"Daniil"}
        };
    }
    // threadPoolSize - количство потоков, priority - приоритетночть (чем меньше число, тем выше приоритет)
//    @Test ( expectedExceptions = { IOException.class, NullPointerException.class } )
//    @Test(enabled = false, dataProvider = "provider", priority = 1)
    @Parameters("myName")                   // for xml
    @Test
    public void myTestProgram(String myName) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println(myName);
            Thread.sleep(100);

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
