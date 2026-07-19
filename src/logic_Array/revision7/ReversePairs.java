package logic_Array.revision7;

public class ReversePairs {

    static int count = 0;

    public static int reversePairs(int[] nums) {

        mergeSort(nums,0,nums.length-1);

        return count;
    }

    static void mergeSort(int[] nums,int left,int right){

        if(left>=right)
            return;

        int mid=(left+right)/2;

        mergeSort(nums,left,mid);

        mergeSort(nums,mid+1,right);

        countPairs(nums,left,mid,right);

        merge(nums,left,mid,right);
    }

    static void countPairs(int[] nums,
                           int left,
                           int mid,
                           int right){

        int j=mid+1;

        for(int i=left;i<=mid;i++){

            while(j<=right &&
                    nums[i] > 2L*nums[j]){

                j++;
            }

            count += j-(mid+1);
        }
    }

    static void merge(int[] nums,
                      int left,
                      int mid,
                      int right){

        int[] temp=new int[right-left+1];

        int i=left;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=right){

            if(nums[i]<=nums[j])
                temp[k++]=nums[i++];

            else
                temp[k++]=nums[j++];
        }

        while(i<=mid)
            temp[k++]=nums[i++];

        while(j<=right)
            temp[k++]=nums[j++];

        for(i=left,k=0;i<=right;i++,k++)
            nums[i]=temp[k];
    }

    public static void main(String[] args){

        int[] nums={2,4,3,5,1};

        System.out.println(reversePairs(nums));
    }
}
