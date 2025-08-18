class Solution {
  public int firstbound(int[] nums, int target){
    int left = 0, right = nums.length - 1, ans = -1;
    while(left <= right){
      int mid = left + (right - left) / 2;
      if(nums[mid] == target){
        ans = mid;
        right = mid - 1;
      } else if(nums[mid] < target){
        left = mid + 1;
      } else{
        right = mid - 1;
      }
    }
    return ans;
  }
  public int lastbound(int[] nums, int target){
    int left = 0, right = nums.length - 1, ans = -1;
    while(left <= right){
      int mid = left + (right - left) / 2;
      if(nums[mid] == target){
        ans = mid;
        left = mid + 1;
      } else if(nums[mid] < target){
        left = mid + 1;
      } else{
        right = mid - 1;
      }
    }
    return ans;
  }
  public int[] searchRange(int[] nums, int target) {
    int first = firstbound(nums, target);
    int last = lastbound(nums, target);
    return new int[]{first, last};
  }
}