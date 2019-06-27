public class MinValue {
    public static void main(String[] args) {
        int[] array = {10,9,11,7,4,12,6,8};
        int index = minValue(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("\nThe smallest element in the array is: " + array[index + 1] + " And position smallest element is :" + (index + 1));

    }

    public static int minValue(int[] array) {
        int min = array[0];
        int index = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
                index++;
            }
        }
        return index;
    }
}
