package lesson4;

public class ThirdDistinctMaximum {

    public static void main(String[] args) {

        try {
            int[] nums = {
                    -231, -1, 2, 3, 4, 5, 6, 7, 8, 8, 6, 4, 1
            };
            System.out.println("3rd largest element is " + thirdLargest1(nums));

            int[] nums2 = {
                    -1, -2, -3, -4, 5, -6, -7
            };
            System.out.println("3rd largest element is " + thirdLargest1(nums2));

            int[] nums3 = {
                    -1, -2
            };
            System.out.println("3rd largest element is " + thirdLargest1(nums3));

            // Solution 2 - a bit more clear
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        }

    }

    static int thirdLargest1( int nums[]) throws Exception {
        int maxIndex1 = -1;
        int maxIndex2 = -1;
        int maxIndex3 = -1;

        // Solution 1 - naive. Could do better :)
        for(int i = 0; i < nums.length; i++){

            int value;
            if (maxIndex1 >= 0) {
                value = nums[maxIndex1];
            } else {
                value = -232;
            }
            if ( nums[i] > value ) {
                maxIndex3 = maxIndex2;
                maxIndex2 = maxIndex1;
                maxIndex1 = i;
            }
        }
        System.out.println(maxIndex1);
        if(maxIndex3 < 0){
            if( maxIndex2 < 0 ) {
                if( maxIndex1 < 0 ) {
                    throw new Exception("Something is wrong with the algorithm");
                }
                return nums[maxIndex1];
            }
            return nums[maxIndex1];
        }
        return nums[maxIndex3];
    }
}
