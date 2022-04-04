import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class UTTestCase {

	//@beforeall
	@Test
	void test1() {
		//fail("Not yet implemented");
		UnitTest unittest=new UnitTest();
		   int received_result=unittest.add(48, 6);
		   assertEquals(54,received_result,"my message");
		   assertEquals(54,received_result,"my message");
		   assertEquals(54,received_result,"my message");
		   
		   
	}
		   @Test
			void test2() {
				//fail("Not yet implemented");
				UnitTest unittest=new UnitTest();
		   String received_result=unittest.add("sai", "krishna");
		   assertEquals("saikrishna",received_result,"my message");
	}
		   @Test
			void test3() {
				//fail("Not yet implemented");
				UnitTest unittest=new UnitTest();
				   int received_result=unittest.add(48, 6);
				   assertEquals(54,received_result,"my message");
				   assertEquals(54,received_result,"my message");
				   assertEquals(54,received_result,"my message");
				   
				   
			}
//		   @AfterEach
//		   void tearDown() {
//			   scanner.close();
//		   }
//		   
//		   }

}
