package SkillBuilders;

public class SpanishNumbers 
{
	public static void displaySpanishNumber(int number) {
        String word;
        
        switch (number) {
        	//save spanish words for # 1 to 10
        	case 1:
        		word ="uno";
        		break;
        	case 2:
                word = "dos";
                break;
            case 3:
                word = "tres";
                break;
            case 4:
                word = "cuatro";
                break;
            case 5:
                word = "cinco";
                break;
            case 6:
                word = "seis";
                break;
            case 7:
                word = "siete";
                break;
            case 8:
                word = "ocho";
                break;
            case 9:
                word = "nueve";
                break;
            case 10:
                word = "diez";
                break;
            default:
                word = "invalid input";
        	
        }
        
        //output the 10 numbers
        System.out.println(number + " - " + word);
        
      }
	
	
	public static void main(String[] args) {
        // Loop to call the method ten times
        for (int i = 1; i <= 10; i++) {
            displaySpanishNumber(i);
        }
    }
}
