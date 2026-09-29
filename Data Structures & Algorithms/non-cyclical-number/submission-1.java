class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(n,1);
        int temp = n;
        while (temp != 1) {
            int sum = 0;
            while(temp > 0) {
                sum+=(temp%10)*(temp%10);
                temp = temp/10;
            }
            temp = sum;
            System.out.println(temp);
            if (hm.get(temp) == null) {
               hm.put(temp, 1);
            } else {

                return false;
            }
        }
        return true;
    }
}
