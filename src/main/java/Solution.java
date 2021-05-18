public class Solution {

    public int sum_of_min_val(int[] mass){
        int first_min = 0;
        int second_min = 0;
        for (int j : mass) {

            if (j < first_min) {
                second_min = first_min;
                first_min = j;
            } else if (j < second_min) {
                second_min = j;
            }

        }
        return first_min + second_min;
    }
}
