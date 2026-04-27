package Arrays;
// find first unsorted element of the array
public class basics07 {
    public static int unsorted(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]<arr[i])
            {
                return arr[i+1];
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]={1,2,5,4,9};
        System.out.println("First unsorted element of the array is : "+unsorted(arr));
    }
}

