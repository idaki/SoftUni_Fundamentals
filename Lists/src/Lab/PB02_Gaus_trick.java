package Lab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PB02_Gaus_trick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();
//1 2 3 4 5
        for (int index = 0; index <= numbers.size() / 2 ; index++) {

            numbers.set(index, numbers.get(index) + numbers.get(numbers.size()-1));
            numbers.remove(numbers.size()-1);
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));

       /* for (Double element:numbers) {
            System.out.printf("%.0f ", element);
        }*/
        }

}
