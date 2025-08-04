// Use simple String.replace(".", "[.]") in Java.
class Solution {
    public String defangIPaddr(String address) {
        // return address.replace(".", "[.]");
        StringBuilder sb = new StringBuilder();
        for(char c : address.toCharArray()) {
            if(c == '.') {
                sb.append("[.]");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

// Time: O(n)
// Space: O(n)
