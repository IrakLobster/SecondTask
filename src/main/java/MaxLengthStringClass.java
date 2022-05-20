import java.util.Scanner;

public class MaxLengthStringClass {

    public String getMaxLengthString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int arraySize = scanner.nextInt();

        String[] array = new String[arraySize];
        System.out.println("Введите слова: ");
        String s = scanner.nextLine();
        for(int i = 0; i < arraySize; i++){
            array[i] = scanner.nextLine();
        }
        scanner.close();
        int maxLength = array[0].length();
        int index = 0;

        for(int i = 1; i < arraySize; i++){
            if(maxLength < array[i].length()) index = i;
        }

        return array[index];
    }
}
