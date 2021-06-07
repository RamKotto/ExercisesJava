package GeekBrains.Logging.log4j2One;

/*
import org.apache.logging.log4j.Logmanager;
import org.apache.logging.log4j.Logger;
 */

public class Main {
/*
    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        LOGGER.debug("Debug level error message");
        LOGGER.info("Info");
        LOGGER.warn("Warn");
        LOGGER.error("Error");
        LOGGER.fatal("Fatal");
        LOGGER.info("String: {}.", "Hello, World");
    }
 */

/*
Для Maven pom.xml:
<dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-api</artifactId>
    <version>2.14.1</version>
</dependency>
<dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-core</artifactId>
    <version>2.14.1</version>
</dependency>
 */

    // Для конфигурации логгера, используем файл log4j2.xml
    // Его необходимо добавить в class path
    // open module settings -> Modules -> Dependencies -> "+"(Add) -> Добавляем папку с конфигом log4j2.xml
    // например /log4j2-configuration/log4j2.xml

}