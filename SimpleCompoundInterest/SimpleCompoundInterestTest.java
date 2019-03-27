/*
*@author Nitineshwar 
*/
 public class SimpleCompoundInterestUnitTestCase
 {
	 
	
	public void UnitTestCaseSimpleInterest() 
        {
		SimpleCompoundInterest simplecompoundinterest;
		 simpleInterest = new SimpleCompoundInterest(1432, 2.5, 3);
		assertEquals(107.4, simpleInterest.SimpleInterest());
		simpleInterest = new SimpleCompoundInterest(6574, 3, 7);
		assertEquals(1380.45, simpleInterest.SimpleInterest());
	}
	
	void UnitTestCaseCompoundIntrest() 
          {
		SimpleCompoundInterest compoundInterest;
		compoundInterest = new SimpleCompoundInterest(4321, 2.5, 3);
		assertEquals(4653.24, compoundInterest.CompoundInterest());
		compoundInterest = new SimpleCompoundInterest(3741, 1.5, 4);
		assertEquals(3970.56, compoundInterest.CompoundInterest());
	}
 }