package com.pkit;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by xiaoping on 2015/9/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/*.xml")
public class BaseTest  {
	static{
		//PropertyConfigurator.configure(BaseTest.class.getClassLoader().getResource("log4j.properties"));
	}
}
