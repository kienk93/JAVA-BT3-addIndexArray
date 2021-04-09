import java.util.Arrays;
import java.util.Scanner;

public class addIndexArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 3, 7, 8, 3};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập phần tử cần chèn: ");
        int number = sc.nextInt();
        System.out.print("Nhập vị trí cần chèn: ");
        int index = sc.nextInt();

        // tạo mảng mới vs độ dài lớn hơn 1
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        newArr[index] = number;
        for (int i = index + 1; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }
        System.out.println(Arrays.toString(newArr));
    }
}