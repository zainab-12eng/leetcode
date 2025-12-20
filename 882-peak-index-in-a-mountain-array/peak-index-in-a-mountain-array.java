class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // ascending part → peak on right
                left = mid + 1;
            } else {
                // descending part → peak is at mid or left
                right = mid;
            }
        }

        return left; // or right, both are same here
    }
}
