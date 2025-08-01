class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> result = new ArrayList<>();
        for(String fol : folder){
            if(result.isEmpty() || !fol.startsWith(result.get(result.size() - 1) + "/")){
                result.add(fol);
            }
        }
        return result;
    }
}