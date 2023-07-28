package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {  //123
        int reverse = 0;

        int remainder = number % 10;        //3
        reverse = reverse*10 + remainder;   //0*10+3 = 3

        number = number/10;                 //12
        remainder = number % 10;            //2
        reverse = reverse*10 + remainder;   //3*10 + 2 = 32

        number = number/10;                 //1
        remainder = number % 10;            //1
        reverse = reverse*10 + remainder;   //32*10 + 1 = 321

        System.out.println(reverse);        //321
    }

    public static void main(String[]args){
        NumberReverter nr = new NumberReverter();
        //nr.revert(123);
    }



    //Revert 3-digit number that will be passed (e.g.: given -> 489, expected -> 984) and print it.
    // Code snippet:
}
