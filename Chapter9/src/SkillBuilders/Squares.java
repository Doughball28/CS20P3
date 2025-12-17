package SkillBuilders;

public class Squares 
{

	 public static void main(String[] args) {

	        int[] squares = new int[5];

	        // Store square of each index
	        for (int i = 0; i < squares.length; i++) {
	            squares[i] = i * i;
	        }

	        // Display array values
	        for (int i = 0; i < squares.length; i++) {
	            System.out.println(squares[i]);
	        }
	    }
}
