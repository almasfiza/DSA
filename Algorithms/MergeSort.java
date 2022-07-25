import java.util.*;
import java.io.*;

class Main {
  public static void merge(int a[], int l, int m, int r) {
    // sizes of the two sub arrays
    int leftArray_len = m - l + 1;
    int rightArray_len = r - m;

    // store the left and right sub arrays
    int leftArray[] = new int[leftArray_len];
    int rightArray[] = new int[rightArray_len];

    for (int i = 0; i < leftArray_len; i++) {
      leftArray[i] = a[l + i];
    }
    for (int i = 0; i < rightArray_len; i++) {
      rightArray[i] = a[m + i + 1];
    }

    // merge the two arrays
    int leftP = 0, rightP = 0;
    int currP = l;
    while (leftP < leftArray_len && rightP < rightArray_len) {
      if (leftArray[leftP] < rightArray[rightP]) {
        a[currP] = leftArray[leftP];
        leftP++;

      } else {
        a[currP] = rightArray[rightP];
        rightP++;
      }
      currP++;
    }

    // while any of the sub arrays remain
    while (leftP < leftArray_len) {
      a[currP] = leftArray[leftP];
      leftP++;
      currP++;
    }
    while (rightP < rightArray_len) {
      a[currP] = rightArray[rightP];
      rightP++;
      currP++;
    }

  }

  public static void sort(int a[], int l, int r) {
    if (l < r) {
      int m = l + (r - l) / 2;

      sort(a, l, m);
      sort(a, m + 1, r);

      merge(a, l, m, r);
    }
  }

  public static void main(String[] args) {
    System.out.println("----------------------------------------");
    System.out.println("Implementing Merge Sort (Divide and Conquer)");
    int nums[] = new int[] { 43, 21, 41, 0, -12, 87, 21 };
    System.out.println("Initially the array to be sorted is: " + Arrays.toString(nums));

    sort(nums, 0, nums.length - 1);
    System.out.println("After sorting: " + Arrays.toString(nums));
     System.out.println("----------------------------------------");
  }
}
