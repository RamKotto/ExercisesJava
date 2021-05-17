package HomeTraining.eval.partOne;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Main {
    public static void main(String[] args) {
        try {
            calculator();
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }

    public static void calculator() throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        Object result = engine.eval("4*5");
        System.out.println(result);
    }
}
