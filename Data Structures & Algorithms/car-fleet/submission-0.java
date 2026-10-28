class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int [][]pos = new int [position.length][2];
        for (int i = 0; i < position.length; i++) {
            pos[i][0] = position[i];
            pos[i][1] = speed[i];
        }
        Arrays.sort(pos, (a, b) -> Integer.compare(a[0], b[0]));    
        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < pos.length; i++) {
            double time = (double)(target-pos[i][0])/pos[i][1];
            stack.push(time);
        }
        int fleets = 0;
        
        double currentTime = 0.0;

        while (!stack.isEmpty()) {
            double time = stack.pop();
            if (time > currentTime) {
                fleets++;
                    currentTime = time; 
            }
        }
        return fleets;
    }
}
