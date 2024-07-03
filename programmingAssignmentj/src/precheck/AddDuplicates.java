package precheck;

public class AddDuplicates {
    public static void main(String[] args) {
        int[] numbers = {12,14,16,14,12,17,18}; // Predefined array with duplicate numbers
        int sum = 0;
        int count=0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }
            if(count>i)
            {
            	System.out.println(numbers[i]);
            }
        }

        
    }
}

