package Arrays;
public class intermediate04 {
    // sort 0's and 1's
    public static int[] sortzerosandones(int arr[])
    {
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            if(arr[i]==1 && arr[j]==0)
            {
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
                j--;
            }
            else if(arr[i]==0)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,0,0,1,1,0,1,0,1};
        int solution[]=sortzerosandones(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(solution[i]);
        }
    }
}
