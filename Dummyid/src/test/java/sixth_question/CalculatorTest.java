package sixth_question;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	@Test
	void test() {
	Calculator calculator=new Calculator();
	int received_result=calculator.add(25, 24);
	   assertEquals(49,received_result,"success");
	}

}
	
