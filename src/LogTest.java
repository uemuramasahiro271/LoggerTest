import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {

	private static Logger logger = LoggerFactory.getLogger(LogTest.class);

	public static void info(String info) {
		logger.info(info);
		logger.debug("debug test");
		logger.error("error test");
	}

}
