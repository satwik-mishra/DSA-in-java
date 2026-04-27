package Arrays;
// maximum element in the array
public class basics04 {
    public static void main(String[] args) {
        int[] arr = {23, 87, 12, 45, 9, 66, 31, 78, 54, 2};
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("The maximum element in the array is : "+max);
    }
}
