class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {
        int n = twoDimArray.length;
        int tmp;
        for (int i = 0; i < n; ++i) {
            int start = 0;
            int end = twoDimArray[i].length - 1;
            while (start < end) {
                tmp = twoDimArray[i][start];
                twoDimArray[i][start] = twoDimArray[i][end];
                twoDimArray[i][end] = tmp;
                --end;
                ++start;
            }
        }
    }
}
