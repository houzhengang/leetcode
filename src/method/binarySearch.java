package method;

public class binarySearch {
    public static int binarySearch(int[] array, int target)
    {

        int start= 0;
        int end = array.length-1;
        while(end>=start)
        {
            System.out.println(start);
            System.out.println(end);

            int mid = (start+end)>>>1;
            System.out.println(array[mid]);
            if(array[mid]==target) {
                return mid;
            }else if(target>array[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }

        }
        return -1;
    }

}
