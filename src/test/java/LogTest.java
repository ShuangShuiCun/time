import org.apache.log4j.*;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Test;
import org.w3c.dom.DOMConfiguration;


public class LogTest {
    private static Logger logger = Logger.getLogger("onelogger");
@Test
    public static void main(String args[]) {
        PropertyConfigurator.configure("src/main/resources/log4j.properties");
        for (int i = 0; i <2; i++) {
            logger.info(i + "----Log.Info----");
            logger.debug(i + "----Log.debug----");
            logger.warn(i + "----Log.warn----");
        }
    }
}
