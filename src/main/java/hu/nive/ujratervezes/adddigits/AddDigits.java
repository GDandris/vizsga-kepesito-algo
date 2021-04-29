package hu.nive.ujratervezes.adddigits;

public class AddDigits {

    public int addDigits(String input){
        if(input == null || input.equals("")){
            return -1;
        }
        int sum = 0;
        input = input.replaceAll("[^\\d.]", "");
        for(int i = 0; i<input.length();i++){
            sum += Character.getNumericValue(input.charAt(i));
        }
        return sum;
    }
}
