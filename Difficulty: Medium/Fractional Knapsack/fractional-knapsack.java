import java.util.*;

class Solution {
    static class Item {
        int value, weight;
        double ratio;
        Item(int v, int w) {
            value = v;
            weight = w;
            ratio = (double) v / w;
        }
    }
    
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        int n = val.length;
        Item[] items = new Item[n];
        
        // Step 1: build item objects with ratio
        for (int i = 0; i < n; i++) {
            items[i] = new Item(val[i], wt[i]);
        }
        
        // Step 2: sort by ratio in descending order
        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));
        
        double totalValue = 0.0;
        int remainingCapacity = capacity;
        
        // Step 3: fill knapsack
        for (Item it : items) {
            if (remainingCapacity == 0) break;
            
            if (it.weight <= remainingCapacity) {
                // take whole item
                totalValue += it.value;
                remainingCapacity -= it.weight;
            } else {
                // take fraction
                totalValue += it.ratio * remainingCapacity;
                remainingCapacity = 0;
            }
        }
        
        // Step 4: return rounded to 6 decimals
        return Math.round(totalValue * 1000000.0) / 1000000.0;
    }
}
