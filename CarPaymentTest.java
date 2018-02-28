package quiz2Vermont;

import static org.junit.jupiter.api.Assertions.*;

import java.text.DecimalFormat;

import org.junit.jupiter.api.Test;

class CarPaymentTest {

	@Test
	void test() {
		DecimalFormat df = new DecimalFormat("0.00");
		CarPayment c = new CarPayment(35000, 0, 60, 10);
		assertEquals(Double.parseDouble(df.format(c.monthlyPayment())), 743.65);
		assertEquals(Double.parseDouble(df.format(c.totalInterest())), 9618.79);
		
	}

}
