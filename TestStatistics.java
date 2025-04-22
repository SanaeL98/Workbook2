package Arrays;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {

        int[] scores = {88, 92, 79, 85, 90, 76, 95, 89, 84, 91};

        int sum = 0;
        int high = scores[0];
        int low = scores[0];

        for (int score : scores) {
            sum += score;

            if (score > high) {
                high = score;
            }

            if (score < low) {
                low = score;
            }
        }

        double average = (double) sum / scores.length;

        Arrays.sort(scores);
        double median = (scores[4] + scores[5]) / 2.0;


        System.out.println("Average: " + average);
        System.out.println("High Score: " + high);
        System.out.println("Low Score: " + low);
        System.out.println("Median: " + median);
        System.out.println("Difference between average and median: " + Math.abs(average - median));
            }
        }

