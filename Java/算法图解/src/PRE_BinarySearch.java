/**
 * @author 智障过人的laoxie
 * @create 2019-08-02 10:59 星期五
 */
public class PRE_BinarySearch {
    private static Integer binarySearch (int[] list,int item){
        int low = 0;
        int high = list.length - 1;
        while (low <= high){
            int mid = (low + high) / 2;
            int guess = list[mid];
            if (guess == item) {
                return mid;
            }
            if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] mylist = {1,3,5,6,9,10};

        System.out.println(binarySearch(mylist,5));
        System.out.println(binarySearch(mylist,2));

    }
}
