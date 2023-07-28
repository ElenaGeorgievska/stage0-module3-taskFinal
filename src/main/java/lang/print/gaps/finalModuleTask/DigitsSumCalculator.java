package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {  //1234
        int ReverseSum = 0;   //the sum of the digit in reversed side

        int remainder = number % 10;        //4
        ReverseSum = ReverseSum + remainder;  //4

        number = number/10;                 //123
        remainder = number % 10;            //3
        ReverseSum = ReverseSum + remainder;      //4 + 3 = 7

        number = number/10;                 //12
        remainder = number % 10;            //2
        ReverseSum = ReverseSum + remainder;      //7 + 2 = 9

        number = number/10;                 //1
        remainder = number % 10;            //1
        ReverseSum = ReverseSum + remainder;      //9 + 1 = 10

        System.out.println(ReverseSum);        //10
    }

    //You will be given a four-digit number your task will be to find the sum of all digits in the given number.
    // Code snippet:

    public static void main(String[] args){
        DigitsSumCalculator dsc = new DigitsSumCalculator();
        dsc.calculateSum(1234);
    }
}
