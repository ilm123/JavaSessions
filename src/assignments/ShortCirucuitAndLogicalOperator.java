package assignments;

public class ShortCirucuitAndLogicalOperator {

	public static void main(String[] args) {
		// Q1: Run the code and observe the output. Change the values of x and y to see how the combined conditions affect the result.
		int x = 9;
        int y = 170;

        if (x > 0 && y > 0 && x < y && x * 2 < y) {
            System.out.println("Hi");
        }
        
        if (x > 0 & y > 0 & x < y & x * 2 < y) {
            System.out.println("Hello");
        }
        
        //Q2: Run the code and note the output. Then, change the values of a and b to all possible combinations
        //of true and false and observe the results.
        
        boolean a = false;
        boolean b = false;
        
        boolean result = a && b;
        System.out.println(result);
        
        boolean resultVal = a & b;
        System.out.println(resultVal);

	}

}
