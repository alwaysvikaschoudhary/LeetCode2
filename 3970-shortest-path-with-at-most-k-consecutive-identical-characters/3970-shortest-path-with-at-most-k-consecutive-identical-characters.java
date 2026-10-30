class Solution {
    public int shortestPath(int a, int[][] b, String c, int d) {
        java.util.List<int[]>[] e = new java.util.ArrayList[a];
        for (int f = 0; f < a; f++) {
            e[f] = new java.util.ArrayList<>();
        }
        for (int[] g : b) {
            e[g[0]].add(new int[]{g[1], g[2]});
        }

        int[][] h = new int[a][d + 1];
        for (int f = 0; f < a; f++) {
            java.util.Arrays.fill(h[f], t());
        }

        java.util.PriorityQueue<int[]> i = new java.util.PriorityQueue<>((A, B) -> Integer.compare(A[0], B[0]));
        i.offer(new int[]{0, 0, 1});
        h[0][1] = 0;

        while (!i.isEmpty()) {
            int[] l = i.poll();
            int m = l[0];
            int n = l[1];
            int o = l[2];

            if (m > h[n][o]) {
                continue;
            }
            
            if (v(n, a - 1)) {
                return m;
            }

            for (int[] p : e[n]) {
                int q = p[0];
                int r = p[1];
                int s = x(c.charAt(n), c.charAt(q)) ? w(o, 1) : 1;

                if (y(s, d)) {
                    int z = w(m, r);
                    if (z < h[q][s]) {
                        h[q][s] = z;
                        i.offer(new int[]{z, q, s});
                    }
                }
            }
        }
        return -1;
    }

    private int t() {
        return Integer.MAX_VALUE;
    }

    private boolean v(int E, int F) {
        return E == F;
    }

    private int w(int G, int H) {
        return G + H;
    }

    private boolean x(char I, char J) {
        return I == J;
    }

    private boolean y(int K, int L) {
        return K <= L;
    }
}