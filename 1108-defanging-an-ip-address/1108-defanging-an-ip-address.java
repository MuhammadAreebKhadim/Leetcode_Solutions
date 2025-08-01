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
