package Demo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * TODO shreyama This type ...
 *
 */
public class AppTest extends TestCase {
  public AppTest(String testName) {

    super(testName);
  }

  public static Test suite() {

    return new TestSuite(AppTest.class);
  }

  public void testApp() {

    assertTrue(true);
  }

}
