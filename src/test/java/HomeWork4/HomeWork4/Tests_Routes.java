package HomeWork4.HomeWork4;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Tests_Routes {

	Triangle_classification test = new Triangle_classification();

	@Test
	public void Test_1() {
		String Expected_result = "equilateral";
		int a = 3, b = 3, c = 3;
		String actual_result = Triangle_classification.classifyTriangle(a, b, c);
		assertEquals(actual_result, Expected_result);
		System.out.println("Test 1 : " + Expected_result);
	}
	@Test
	public void Test_2() {
		String Expected_result = "Nottriangle";
		int a = 1, b = 2, c = 5;
		String actual_result = Triangle_classification.classifyTriangle(a, b, c);
		assertEquals(actual_result, Expected_result);
		System.out.println("Test 2 : " + Expected_result);
	}
	@Test
	public void Test_3() {
		String Expected_result = "Nottriangle";
		int a = 2, b = 6, c = 3;
		String actual_result = Triangle_classification.classifyTriangle(a, b, c);
		assertEquals(actual_result, Expected_result);
		System.out.println("Test 3 : " + Expected_result);
	}
	@Test
	public void Test_4() {
		String Expected_result = "Nottriangle";
		int a = 7, b = 4, c = 1;
		String actual_result = Triangle_classification.classifyTriangle(a, b, c);
		assertEquals(actual_result, Expected_result);
		System.out.println("Test 4 : " + Expected_result);
	}
	@Test
	public void Test_5() {
		String Expected_result = "isosceles";
		int a = 3, b = 4, c = 3;
		String actual_result = Triangle_classification.classifyTriangle(a, b, c);
		assertEquals(actual_result, Expected_result);
		System.out.println("Test 5 : " + Expected_result);
	}
	@Test
	public void Test_6() {
		String Expected_result = "isosceles";
		int a = 5, b = 5, c = 4;
		String actual_result = Triangle_classification.classifyTriangle(a, b, c);
		assertEquals(actual_result, Expected_result);
		System.out.println("Test 6 : " + Expected_result);
	}
	@Test
	public void Test_7() {
		String Expected_result = "isosceles";
		int a = 10, b = 20, c = 20;
		String actual_result = Triangle_classification.classifyTriangle(a, b, c);
		assertEquals(actual_result, Expected_result);
		System.out.println("Test 7 : " + Expected_result);
	}
	@Test
	public void Test_8() {
		String Expected_result = "Scalene";
		int a = 6, b = 9, c = 7;
		String actual_result = Triangle_classification.classifyTriangle(a, b, c);
		assertEquals(actual_result, Expected_result);
		System.out.println("Test 8 : " + Expected_result);
	}
	

}
