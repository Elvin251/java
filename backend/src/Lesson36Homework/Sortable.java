package Lesson36Homework;

interface Sortable {
    void sort(int[] arr);
}

class BubbleSort implements Sortable {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j]; arr[j] = arr[j + 1]; arr[j + 1] = temp;
                }
    }
}

class SelectionSort implements Sortable {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min]) min = j;
            int temp = arr[i]; arr[i] = arr[min]; arr[min] = temp;
        }
    }
}

class Main7 {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 2};
        Sortable sorter = new BubbleSort();
        sorter.sort(numbers);
        for (int n : numbers) System.out.print(n + " ");
    }
}
