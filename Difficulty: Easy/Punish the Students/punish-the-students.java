// User function Template for Java

class Solution {
  public static int shouldPunish(int roll[], int marks[], int n, double avg) {
    // your code here
    // let first sort by theier rollNo
    int swapCount = 0;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (roll[j] > roll[j + 1]) {
          int temp = roll[j];
          roll[j] = roll[j + 1];
          roll[j + 1] = temp;
          
          int tempMark = marks[j];
          marks[j] = marks[j + 1];
          marks[j + 1] = tempMark;

          swapCount++;
        }
      }
    }

    //Now calculate the deducted marks;
    int totalMarks = 0;
    for (int i = 0; i < n; i++) {
     
      totalMarks += marks[i];
    }
    

    double newAvg = (double)(totalMarks- 2*swapCount) / n;

    return newAvg > avg ? 1 : 0;
  }
}