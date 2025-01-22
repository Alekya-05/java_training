public class day10 {
    public static void main(String[] args){

    }

    public static void mergeArrays(int[] nums1,int m,int[] nums2,int n) {
        int[]  newarr=new int[m+n];

        int p1=0;
        int p2=0;
        //int p3=0; 
        

        while(p1<m && p2<n) {
            if(nums1[p1] <nums2[p2]){
                //arr[p3]=nums1[p1];
                p1++;
               // p3++;
                
            } else{
               // arr[p3]==nums2[p2];
                //p2++;
               // p3++;
                int temp=nums1[p1];
                nums[p1]==nums2[p2];
                nums2[p2]=temp;
            }

        }
        while(p1<m){
            //arr[p3]==nums1[p1];
            nums[p1]=nums[p2];
            //p3++
        }
        while(p2>m){
            //arr[p3]==nums2[p2];
            nums[p1]=nums[p2];

            p2++;
            p1++;
        }
        
    }
}
