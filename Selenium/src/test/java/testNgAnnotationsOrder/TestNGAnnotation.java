package testNgAnnotationsOrder;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotation {
	@BeforeClass
	void m1() {
		System.out.println("before class");
	}
	@BeforeMethod
	void m2() {
		System.out.println("before method");
	}
	@Test
	void m3() {
		System.out.println("test1");
	}
	@AfterMethod
	void m4() {
		System.out.println("after method");
	}
	@AfterClass
	void m5() {
		System.out.println("after class");
	}
	@AfterTest
	void m6() {
		System.out.println("After test");
	}
	@Test
	void m7() {
		System.out.println("test2");
	}
}
