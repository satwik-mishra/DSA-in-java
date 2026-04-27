package Arrays;
// sum of positive and negative elements
public class basics05 {
    public static void main(String[] args) {
        int[] arr = {-15, 42, -7, 0, 89, -23, 56, -102, 14, -3, 77, -45};
        int positive_sum=0;
        int negative_sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                positive_sum+=arr[i];
            }
            else
            {
                negative_sum+=arr[i];
            }
        }
        System.out.println("Positive sum : "+positive_sum + " and Negative sum : "+negative_sum );
    }
}
