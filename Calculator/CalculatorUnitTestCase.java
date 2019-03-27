/*
* Unit test cases for Calculator
*/
class CalculatorUnitTestCase{

	public void testOperation() {
		Calculator c = new Calculator();
		assertEquals(15.0, c.doCalculation(10,5,"Addition"));
		assertEquals(6.0, c.doCalculation(8,2,"Subtraction"));
		assertEquals(2.52.0, c.doCalculation(1.8,1.4,"Multiplication"));
	}
}