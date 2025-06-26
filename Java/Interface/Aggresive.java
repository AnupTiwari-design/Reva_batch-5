package Java.Interface;

public class Aggresive {
    public static boolean canPlaceCows(int[] stalls, int cows, int minDist) {
        int count = 1;
        int lastPos = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPos >= minDist) {
                count++;
                lastPos = stalls[i];
            }
        }

        return count >= cows;
    }

    public static int aggressiveCows(int[] stalls, int cows) {
        Arrays.sort(stalls);

        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];
        int ans = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (canPlaceCows(stalls, cows, mid)) {
                ans = mid;
                low = mid + 1; // try for bigger distance
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] stalls = {1, 2, 4, 8, 9};
        int cows = 3;

        System.out.println(aggressiveCows(stalls, cows)); // Output: 3
    }
}
    
}
