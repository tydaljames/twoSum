import java.util.HashMap;

public class sumTwo {

    /*Takes an integer array and a desired sum,
    * and searches for two integers that add up to that sum.
    *
    * If a sum is found, indexes of the integers will be returned
    * Will return -1 if no sum found
    *
    * Uses a single loop for O(n) time complexity**/
    public int [] twoSum(int[] num, int sum){
        int[] twoReturn = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x=0; x<num.length; x++){
            int y = sum - num[x];
            if(map.containsKey(y) && num[x] != y) {
                twoReturn[0] = map.get(y);
                twoReturn[1] = x;
                System.out.println(twoReturn[0] + "," + twoReturn[1]);
                return twoReturn;
            }

            map.put(num[x], x);
        }

        twoReturn[0] = -1;
        twoReturn[1] = -1;
        System.out.println("-1\r\nNo valid sum");
        return twoReturn;

    }




    public static void main(String[] args){
        sumTwo two = new sumTwo();
        int[] num = new int[4];
        num[0] = 2;
        num[1] = 12;
        num[2] = 8;
        num[3] = 7;


        two.twoSum(num, 9);

    }
}
