import java.util.ArrayList;

public class Assignment {
    public static void solution(int n, int k) {
        int[] arr = new int[n];
        int t = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = t;
            ++t;
        }
        ArrayList<Integer> result = new ArrayList<>();
        combinations(arr, k, 0, result);
    }

    public static void combinations(int[] arr, int k, int index, ArrayList<Integer> result) {
        if (result.size() == k) {
            System.out.println(result);
            return;
        }
        if (index >= arr.length) {
            return;
        }
        for (int i = index; i < arr.length; i++) {
            result.add(arr[i]);
            combinations(arr, k, i + 1, result);
            result.remove(result.size() - 1);
        }
    }

    public static void main(String[] args) {
        solution(4, 2);
    }
}