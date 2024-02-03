package Root_classificatin.Root_classificatin;
import static org.junit.Assert.*;

import org.junit.Test;

public class RootsTest 
{
	Roots root;
	
	@Test
	public void test_A_min() {
		Roots.calculate_roots(0, 5, 15);
		String  root_expected = Root_Types.Not_quadratic.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void test_A_min_plus1() {
		Roots.calculate_roots(1, 5, 5);
		String  root_expected = Root_Types.Two_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	public void Nominal_A() {
		Roots.calculate_roots(20, 40, 20);
		String  root_expected = Root_Types.Equal_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void test_A_max_min1() {
		Roots.calculate_roots(49, 6, 7);
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void test_A_max() {
		Roots.calculate_roots(50, 10, 10);
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}

	@Test
	public void test_B_min() {
		Roots.calculate_roots(20, 0, 30);
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void test_B_min_plus1() {
		Roots.calculate_roots(30, 1, 35);
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	public void Nominal_B() {
		Roots.calculate_roots(40, 20, 40);
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void test_B_max_min1() {
		Roots.calculate_roots(15, 49, 6);
		String  root_expected = Root_Types.Two_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void test_B_max() {
		Roots.calculate_roots(10, 50, 20);
		String  root_expected = Root_Types.Two_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void test_C_min() {
		Roots.calculate_roots(20, 40, 0);
		String  root_expected = Root_Types.Two_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void test_C_min_plus1() {
		Roots.calculate_roots(30, 40, 1);
		String  root_expected = Root_Types.Two_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	public void Nominal_C() {
		Roots.calculate_roots(30, 30, 30);
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void test_C_max_min1() {
		Roots.calculate_roots(30, 30, 99);
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void test_C_max() {
		Roots.calculate_roots(10, 20, 100);
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	public void test_OutOfRange() {
		Roots.calculate_roots(-2, 20, 50);
		String  root_expected = Root_Types.ERROR.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}

	
	
	}
