package com.test;

public class Main {

    public static int calculate(int[] arr) throws Exception {
        if (arr.length >= 32000) throw new Exception("Too many items");
        for (int item : arr) {
            if (item < 0 || item >= 32000) throw new Exception("Value exceeds allowed size");
        }

        int leftMax = 0, rightMax = 0, left = 0, right = arr.length - 1, volume = 0;

        while (left < right) {
            if (arr[left] > leftMax)
                leftMax = arr[left]
            if (arr[right] > rightMax)
                rightMax = arr[right];
            
            if (leftMax >= rightMax) {
                volume += rightMax - arr[right];
                right--;
            } else {
                volume += leftMax - arr[left];
                left++;
            }
        }
        return volume;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Capacity: [8] = " + calculate(new int[]{5, 2, 3, 4, 5, 4, 1, 3, 1}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
