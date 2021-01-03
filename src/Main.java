public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(find(list, 8));
    }

    public static int find(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        int mid = low + (high - low) / 2;
        int exist = subFind(low, high, list, key);
        return exist;
    }

    public static int subFind(int low, int high, int[] list, int key) {
        int mid = low + (high - low) / 2;;
        if (high > low) {
            if (list[mid] == key) return mid;
            if (list[mid] < key) return subFind(mid + 1, high, list, key);
            if (list[mid] > key) return subFind(low, mid - 1, list, key);
        }
        return -1;
    }
}
