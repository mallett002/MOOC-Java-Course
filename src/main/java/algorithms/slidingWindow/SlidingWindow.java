package algorithms.slidingWindow;

import java.util.*;

class SlidingWindow {

    // [4, 2, 1, 7, 8, 1, 2, 8, 1, 0]
    public static int findMaxSumSubarrayForWindow(int[] arr, int windowLength) {
        int maxValue = Integer.MIN_VALUE;
        int windowSum = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) { // windowEnd++ will increment our window along
            windowSum += arr[windowEnd]; // will build sum until window is made

            // stop expanding window:
            if (windowEnd >= windowLength - 1) {
                maxValue = Math.max(maxValue, windowSum);

                // slide window along
                windowSum -= arr[windowEnd - (windowLength - 1)]; // remove left most item from current sum
            }
        }

        return maxValue;
    }

    // [4, 2, 2, 7, 8]; targetSum = 8
    public static int smallestSumSubarray(int targetSum, int[] arr) {
        int windowStart = 0;
        int currentWindowSum = 0;
        int minWindowSize = Integer.MAX_VALUE; // to return

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            currentWindowSum += arr[windowEnd]; // add right most item to sum (move to right one)

            // keep shrinking window while meeting criteria
            while (currentWindowSum >= targetSum) {
                minWindowSize = Math.min(minWindowSize, (windowEnd - windowStart) + 1); // set min window size

                // try to shrink minWindowSize
                currentWindowSum -= arr[windowStart];
                windowStart++; // move left window pane to right
            }
        }

        return minWindowSize;
    }

    // ["a", "a", "a", "h", "i", "t", "b", "c"]
    static int longestSubstringWithChars(char[] arr) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        int longest = Integer.MIN_VALUE;
        int currentWindowSum = 0;
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            // update charCount, currentWindowSum
            if (!charCount.containsKey(arr[windowEnd])) {
                charCount.put(arr[windowEnd], 1);
            } else {
                charCount.put(arr[windowEnd], charCount.get(arr[windowEnd]) + 1);
            }
            currentWindowSum++;

            // while too many keys, shrink windowStart
            while (charCount.keySet().size() > 2) {
                charCount.put(arr[windowStart], charCount.get(arr[windowStart]) - 1); // reduce charCount for that key
                if (charCount.get(arr[windowStart]) == 0) charCount.remove(arr[windowStart]); // if 0, remove it from charCount
                currentWindowSum -= arr[windowStart]; // update current sum
                windowStart++; // move windowStart to the right
            }

            longest = Math.max(longest, currentWindowSum);
        }

        return longest;
    }

    public static void main(String[ ] args) {
        // Max sum subarray
        int val = findMaxSumSubarrayForWindow(new int[]{4, 2, 1, 7, 8, 1, 2, 8, 1, 0}, 3);

        // Smallest sum sub array
        int[] input = {4, 2, 2, 7, 8, 1, 2, 8, 10};
        int targetSum = 8;
        int smSubArr = smallestSumSubarray(targetSum, input);
        System.out.println(smSubArr);

        // Longest substring with K distinct characters
        String str = "aathtibc";
        char[] charArray = str.toCharArray();
        int longest = longestSubstringWithChars(charArray);
        System.out.println(longest);
    }
}
