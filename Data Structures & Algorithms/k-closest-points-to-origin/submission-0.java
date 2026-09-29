class Solution {
    public int[][] kClosest(int[][] points, int k) {
        List<double[]> list = new ArrayList<>();
        Comparator<double[]> comparator = new Comparator<double[]>() {
            public int compare(double[]a, double[]b) {
                return Double.compare(a[0], b[0]);
            }
        };
        for (int i = 0; i < points.length; i++) {
            double a = (double)points[i][0];
            double b = (double)points[i][1];
            list.add(new double[]{Math.pow((Math.pow(a,2)+Math.pow(b,2)), 0.5),a,b });
        }
        Collections.sort(list, comparator);
        int[][]solution = new int[k][2];
        for (int i = 0; i < k; i++) {
            double[]arr = list.get(i);
            int a = (int)arr[1];
            int b = (int)arr[2];
            solution[i] = new int[]{a,b};
        }
        return solution;

    }
}
