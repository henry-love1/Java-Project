  public class MileageCalculation {
         
        public class void main("String [] args"); {
	   
	// Step 1: Declare miles variable with
	 initial value 100
	double mile = 100;

	//  Step  2:  Declare constant kilometers per miles
	final double KILOMETER_PER_MILE =1.609;

	//  Step  3: calculate kilometers
	double kilometer =miles * KILOMETER_PER_MILE;
	
	// Step 4: Display kilometers to console
	System.out.println("Kilometer: " + kilometer)

	// Answer to "what's kilometers after step 4?"
	
	// kilometers = 100 * 1.609 =160.9 

	// Step 5: scientific calculator
	runScientificCalsulation();  
       }
	// Step 5: scientific Calculator with add, 
	subtract, divide, multiply

	public static void 
	runScientificCalsulation() {
	java.util.scanner(System.in);

	System.out.println("\n=== Scientific
	 Calculator ===")

	System.out.println("Enter first number:");
	double num1 =
	scanner.nextDouble();

	System.out.println("Enter operator
	 (+, -, *, /): ");	
	char operator =scanner.().charAt(0)

	System.out.println("Enter second number: ");
	double num2 = scanner.nextDouble() ;

	double result = 0;
	boolean validOperator = true;
	
	switch (operator) {
	    case '+' :
	            result = num1 + num2;
	            break;	
	    case '-' :	
	             result = num1 - num2;
	             break;
	     case '*' :	
	             result = num1 * num2;
	             break;
	     case '/' :	
	             if = (num2 !=0)  {
	             result = num1 / num2;
	             } else {

	      System.out.println("Error: Invalid operator!")
	              validOperator = false;
	}
	      if (validOperation) {
	      System.out.println("Result: " + num1 + num2 + " " 
	     + num2 + " = " + result);
                    }

	      scanner.close();

        }
}