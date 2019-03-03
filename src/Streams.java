import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] arr1 = new int[10];
        int counter, min_Element, index=0;

        fillArr(arr);
        System.out.println("Original Array: " + Arrays.toString(arr));

     //1. Найти среднее значение элементов массива

        fillArr(arr);
        double average = Arrays.stream(arr).average().getAsDouble() ;
        System.out.println("Average value of Array: " + average);


    //2. Найти минимальный элемент, значение и индекс

        fillArr(arr);
        min_Element = Arrays.stream(arr).min().getAsInt();
        System.out.println("Min element of Array: " + min_Element);


       min_Element = Arrays.stream(arr).reduce((acc, a) -> a<acc?acc=a:acc).getAsInt();
       System.out.println("Min element of Array: " + min_Element);

        fillArr(arr);
        min_Element = Arrays.stream(arr).reduce(Integer::min).getAsInt();
        System.out.println("Min element of Array: " + min_Element);



    //3. Посчитать количество элементов равных нулю
        fillArr(arr);
        counter = Arrays.stream(arr).filter(a -> a==0).toArray().length;
        System.out.println("Zero elements in Array: " +counter);

    //4. Посчитать количество элементов больше нуля
        fillArr(arr);
        counter = Arrays.stream(arr).filter(a -> a > 0).toArray().length;
        System.out.println("Positive elements in Array: " + counter);


    //5. Помножить элементы массива на число, к примеру 11
        fillArr(arr);
        arr = Arrays.stream(arr).map(a -> a * 11).toArray();
        System.out.println("Array with multiplied elements: " +Arrays.toString(arr));

    }

    private static void fillArr(int[] arr) {
    for (int i = 0; i < 10; i++)
        arr[i] = (i - 3) * (5 - i);
    }
}

