/*
*@author Nitineshwar 
*/

class Calculator{
	/*
	*Method that preform Arithmetic operation based on parameters
	*@param operand1
	*@param operand2
	*@param operator
	*/
	public double doCalculation(double operand1,double operand2,String operator)
		switch(operator){
			case "Addition":{
				Addition(operand1,operand2);
				break;
			}
			case "Subtraction":{
				Subtraction(operand1,operand2);
				break;
			}
			case "Multiplication":{
				Multiplication(operand1,operand2);
				break;
			}
			default:{
				return -1;
			}
		}
		double Addition(double operand1,double operand2){
			return operand1+operand2;
		}
		double Subtraction(double operand1,double operand2){
			return operand1-operand2;
		}
		double Multiplication(double operand1,double operand2){
			return operand1*operand2;
		}
	}
