public class Minimum_mooves {
    public int minMoves(int[] nums) {
        int min = nums[0];
        long sum = 0;

        for (int num : nums) {
            sum += num;
            if (num < min) {
                min = num;
            }
        }

        return (int) (sum - (long) min * nums.length);
    }

    public static void main(String[] args) {
        Minimum_mooves solution = new Minimum_mooves();

        // Test cases
        int[] test1 = {1, 2, 3};
        System.out.println(solution.minMoves(test1)); // Output: 3

        int[] test2 = {1, 1, 1};
        System.out.println(solution.minMoves(test2)); // Output: 0

        int[] test3 = {5, 2, 1};
        System.out.println(solution.minMoves(test3)); // Output: 5
    }
}