class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> see = new HashSet<>();
        for(int num : arr){
            if(see.contains(num * 2) || (num % 2 == 0) && see.contains(num / 2)){
                return true;
            }
            see.add(num);
        }
        return false;
    }
}