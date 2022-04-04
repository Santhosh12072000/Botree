package ProductProjectTc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import jdbccconnection.JDBCStudents;


//@RunWith(Suite.class)
//@SuiteClasses({ testcase classnames separated by comma })
class ProductProjectTestCase {
     //public static Scanner scanner;

@BeforeAll

	@Test
	void test() {
		JDBCStudents jdbc=new JDBCStudents(2,"sathya",100,456);
		assertEquals(2,jdbc.getId());
		assertEquals(3,jdbc.getId());
	}

}
