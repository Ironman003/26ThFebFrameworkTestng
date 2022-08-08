package Listners;

import org.testng.Assert;
import org.testng.annotations.Test;

//@Listeners(Listners.ListenerTstng.class)
public class DemoListners {
	
	@Test
	public void test1() {
		System.out.println("I am inside the test1");
	}
	@Test
	public void test2() {
		System.out.println("I am inside the test2");
	}
	@Test
	public void test3() {
		System.out.println("I am inside the test3");
		Assert.assertTrue(false);
	}


}
