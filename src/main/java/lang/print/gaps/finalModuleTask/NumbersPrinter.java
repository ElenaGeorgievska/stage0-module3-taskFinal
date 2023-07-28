package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public void printIsPositive(int number) {
        boolean a = number>0;
        System.out.println(a);
    }

    //Implement program that will print if number is positive true, otherwise false (no if or ternary).
    //Code snippet:
    //Where number - variable that should be used within the program.
    public static void main(String[]args){
        NumbersPrinter np = new NumbersPrinter();
        np.printIsPositive(-1);
    }
}
