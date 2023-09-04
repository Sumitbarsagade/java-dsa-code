public class richCustomerWealth {
    public static void main(String[] args) {

        int [][] arr2d ={{1,5},{7,3},{3,5}};
        int ans = wealthly(arr2d);
        System.out.println(ans);

    }

    private static int wealthly(int[][] arr2d) {

        int max=0;
        for (int[] row : arr2d) {
            int sum=0;
            for (int value : row) {
                sum+=value;
            }
            if(sum>max){
                max= sum;
            }
        }

        return max;
    }

}
