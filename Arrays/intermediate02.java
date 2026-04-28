package Arrays;
// shift array elements by one to the right
public class intermediate02 {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        int size=arr.length;
        int last_element=arr[size-1];
        for(int i=size-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=last_element;
        for(int k=0;k<size;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
}
