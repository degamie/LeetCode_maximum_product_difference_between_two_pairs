class Solution {
  //New Approach#1
  //T(C(N))==O(N) and S(C(N))==O(1) as it requires const space alloc iteratively
    public int maxProductDifference(int[] nums) {//maxProductDifference method declare
        int firstBig = 0, secondBig = 0;//initializing first and secondBig
        int firstSmall = Integer.MAX_VALUE, secondSmall = Integer.MAX_VALUE;// firstSmall nd seconSmall declare

        for (int n : nums) {//Nums's  iteraiton 
            if (n < firstSmall) {//checking Nums's firstSmall Val 
                secondSmall = firstSmall;//First and Second Val Declare
                firstSmall = n;//First and Small  Val Declare
            } else if (n < secondSmall) {//secondSmall Declare
                secondSmall = n;//secondSmall Assigining 
            }

            if (n > firstBig) {//checking Nums's firstBig Val
                secondBig = firstBig;//First and Second Big Val
                firstBig = n;//nums's nth  First big Val  declare
            } else if (n > secondBig) {//checking Nums's Second Val .
                secondBig = n;//nums's nth  secondBig Val  declare
            }
        }
        return firstBig * secondBig - firstSmall * secondSmall;//Printing Output      
    }
}
//old Approach
// class Solution {
//     public int maxProductDifference(int[] nums) {
//         int out=0;int x=0;int y=0;int z=0;int w=0;
//         int n=nums.length;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n-1;j++){
//                for(int k=j+1;k<n-2;k++){
//                 if(nums[k]>nums[j] && nums[k+1]>nums[j]){
//                     out+=Math.max((nums[j]*nums[k])-(nums[j]*nums[k+1]));
//                 }
//                 else if(nums[j]>nums[i] && nums[k]>nums[j]){
//                       out+=Math.max((nums[i]*nums[j])-(nums[j]*nums[k]));
//         }
//         else out=0;
//         }
//     }
// }
// return out;
//     }}
