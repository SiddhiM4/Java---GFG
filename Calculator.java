class Solution {
    public static void utility(int a, int b, int operator) {
        String result;

        if (operator == 1) {
            result = String.valueOf(a + b);
        } else if (operator == 2) {
            result = String.valueOf(a - b);
        } else if (operator == 3) {
            result = String.valueOf(a * b);
        } else {
            result = "Invalid Input";
        }
        System.out.print(result);
    }
}
