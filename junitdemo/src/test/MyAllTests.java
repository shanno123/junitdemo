package test;

//for running combinations of tests 
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DemoTest.class, JUnitMessageTest.class })
public class MyAllTests {

}
