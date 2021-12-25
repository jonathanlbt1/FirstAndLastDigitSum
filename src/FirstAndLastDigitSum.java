public class FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number){

        if (number < 0){
            return -1;
        }
        int rem = 0;
        int firstDigit = 0;
        int lastDigit = number % 10;

        while (number > 0){
            rem = number % 10;
            number /= 10;
            if (number == 0){
                firstDigit = rem;
            }
        }
        return firstDigit + lastDigit;
    }
}
