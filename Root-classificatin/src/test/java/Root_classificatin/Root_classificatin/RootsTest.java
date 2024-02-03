package Root_classificatin.Root_classificatin;
import static org.junit.Assert.*;

import org.junit.Test;

public class RootsTest 
{
	Roots root;
	
	@Test
	public void test_A_min() {
		
		Roots.calculate_roots(0, 5, 20);
		
		String  root_expected = Root_Types.Not_quadratic.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
		
	}
	
	
	}
