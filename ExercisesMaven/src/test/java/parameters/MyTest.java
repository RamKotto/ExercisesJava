package parameters;

import com.google.errorprone.annotations.CompileTimeConstant;
import org.testng.Assert;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.xml.XmlSuite;

import java.util.List;

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
    @Test(dataProvider = "provider", threadPoolSize = 10, priority = 1)
//    @Parameters("myName")                   // for xml
    public void myTestProgram(String myName) {
        for (int i = 0; i < 1000; i++) {
            System.out.println(myName);
        }
    }
}
