package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class addTest {
	
	private TheJourneyBegins tjb;
	
	@Before
	public void setup() {
		tjb = new TheJourneyBegins();
	}
	
	@Test
	public void test1() {
		assertEquals(3, tjb.add(1, 2));
	}
	
	@Test
	public void test2() {
		assertEquals(1000, tjb.add(0, 1000));
	}
	
	@Test
	public void test3() {
		assertEquals(-37, tjb.add(2, -39));
	}
	
	@Test
	public void test4() {
		assertEquals(199, tjb.add(99, 100));
	}
	
	@Test
	public void test5() {
		assertEquals(0, tjb.add(-100, 100));
	}
	
	@Test
	public void test6() {
		assertEquals(-2000, tjb.add(-1000, -1000));
	}
}