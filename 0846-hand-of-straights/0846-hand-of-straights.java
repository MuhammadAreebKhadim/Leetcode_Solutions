class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) return false;
        TreeMap<Integer, Integer> count = new TreeMap<>();
        for (int card : hand) {
            count.put(card, count.getOrDefault(card, 0) + 1);
        }
        while (!count.isEmpty()) {
            int start = count.firstKey(); // smallest card
            for (int i = 0; i < groupSize; i++) {
                int currCard = start + i;
                if (!count.containsKey(currCard)) return false;
                count.put(currCard, count.get(currCard) - 1);
                if (count.get(currCard) == 0) {
                    count.remove(currCard);
                }
            }
        }
        return true;
    }
}
