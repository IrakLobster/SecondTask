import java.util.Scanner;

public class SecondTask {

    public static void main(String[] args) {
        SecondTask secondTask = new SecondTask();
        secondTask.choiceOperation();
    }

    public void choiceOperation(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of task: (1 - calculator, 2 - string array)");

        int i = scn.nextInt();

        switch (i){
            case 1:
                new CalculatorClass().getResult();
                break;
            case 2:
                System.out.println(new MaxLengthStringClass().getMaxLengthString());
                break;
        }

        scn.close();
    }


}
