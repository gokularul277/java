public class checkarrayissortedornot {
    public static void main(String[] args) {

        int[] g = {87,88,89,90};

        if (sorte(g)) {
            System.out.println("sorted");
        } else {
            System.out.println("not sorted");
        }
    }

    static boolean sorte(int[] g) {

        for (int i = 0; i < g.length - 1; i++) {

            if (g[i] >g[i + 1]) {
                return false;
            }
        }

        return true;
    }
}