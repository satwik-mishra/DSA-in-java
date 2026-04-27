package Arrays;
// find the average of elements of the array
public class basics01 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        double sum=0;
        double average;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        average=sum/arr.length;
        System.out.println("Average of elements of the array is : "+average);
    }
}
