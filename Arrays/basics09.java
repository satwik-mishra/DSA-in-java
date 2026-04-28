package Arrays;

public class basics09 {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={2,5,6,7,8};
        int flag=0;
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    flag=1;
                    System.out.println("Intersection elements are : "+arr1[i]);
                    break;
                }
            }
        }
        if(flag==0)
        {
            System.out.println("No common elements are present");
        }
    }
}
