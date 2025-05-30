package tests;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Assertions {

	public static void main(String[] args) {

		/*2 types of assertions
		*Hard assesrtions and Soft assertions
		*hard assertions are used in case of blocker as it terminates the execution as soon as it hits a blocker issue
		*
		*Soft assertion are used when we find issues but will raise it in the end so the execution will not stop even if some test cases fails
		*we have to create an object of soft assert to access its methods as it is not static in  nature however in case of Hard assertion it is static in nature so we can directly access its methods
		*/
		String a ="Hello";
		String b = "World";
		Assert.assertEquals(true, true);
		Assert.assertNotEquals(true, false);
		
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(false, false);
		softAssert.assertFalse(false);
		
	}

}
