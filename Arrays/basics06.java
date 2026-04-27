package Arrays;
// count number of zeros and ones
public class basics06 {
    public static void main(String[] args) {
        int[] binaryArr = {1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1};
        int countzeros=0;
        int countones=0;
        for(int i=0;i<binaryArr.length;i++)
        {
            if(binaryArr[i]==0)
            {
                countzeros+=1;
            }
            else{
                countones+=1;
            }
        }
        System.out.println("Number of zeros : "+countzeros+ " and number of Ones: "+countones);
    }
}
