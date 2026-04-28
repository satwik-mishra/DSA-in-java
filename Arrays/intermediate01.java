package Arrays;
// Reverse an array in place
public class intermediate01 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int size=arr.length;
        int i=0;
        int j=size-1;
        while(i<j)
        {
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }
        for(int k=0;k<size;k++)
        {
            System.out.println(arr[k]);
        }
        
    }
}
