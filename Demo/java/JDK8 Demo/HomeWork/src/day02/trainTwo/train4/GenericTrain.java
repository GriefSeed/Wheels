package day02.trainTwo.train4;

public class GenericTrain {
    public static void main(String[] args) throws Exception {
        String[] strArr = new String[]{"a","b", "c", "c", "a", "b", "b", "b", "a"};

        swap(strArr, 2,1);
        for(String s : strArr){
            System.out.print(s + " ");
        }

        System.out.println();
        Integer[] intArr = new Integer[]{1,2,3,4,5,6,7};
        swap(intArr, 2,3);
        for(Integer i : intArr){
            System.out.print(i + " ");
        }
    }

    private static <T> void swap(T[] arr, int index1, int index2) throws Exception {
        if(index1 > arr.length - 1 | index2 > arr.length - 1){
            throw new Exception("下标越界");
        }

        T temp;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
