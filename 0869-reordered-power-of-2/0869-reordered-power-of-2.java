class Solution {
    public boolean reorderedPowerOf2(int n) {
        String target = sortDigits(n);
        // Precompute sorted forms of all powers of two up to 2^30 (fits in int range)
        for (int i = 0; i < 31; i++) {
            int power = 1 << i; // 2^i
            if (target.equals(sortDigits(power))) {
                return true;
            }
        }
        return false;
    }
    // Helper method to get sorted string of digits
    private String sortDigits(int num) {
        char[] chars = String.valueOf(num).toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
