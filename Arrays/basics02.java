package Arrays;
// multiply each element of an array by 10
public class basics02 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int size=arr.length;
        int newarr[]=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            newarr[i]=arr[i]*10;
        }
        for(int i=0;i<size;i++)
        {
            System.out.println(newarr[i]);
        }
    }
}
