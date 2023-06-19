import java.io.*;
import java.util.*;

public class Main2 {
    static BufferedReader br;
    static StringTokenizer st;
    static PrintWriter pw;

    static List<Edge>[] adj;
    static boolean[] poisoned;
    static int[] size, parent, depth;
    static long[] dist;
    static int centroid;

    public static void main(String[] args) {
        br = new BufferedReader(new InputStreamReader(System.in));
        pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int n = nextInt();
        int m = nextInt();
        adj = new List[n + 1];
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int i = 0; i < n - 1; i++) {
            int u = nextInt();
            int v = nextInt();
            int w = nextInt();
            adj[u].add(new Edge(v, w));
            adj[v].add(new Edge(u, w));
        }
        poisoned = new boolean[n + 1];
        for (int i = 1; i <= m; i++) {
            int u = nextInt();
            int v = nextInt();
            poisoned[u] = true;
            poisoned[v] = true;
        }
        size = new int[n + 1];
        parent = new int[n + 1];
        depth = new int[n + 1];
        dist = new long[n + 1];
        Arrays.fill(parent, -1);
        dfs1(1, 0, 0);
        dfs2(1, 0, n);
        pw.println(dist[centroid]);
        pw.close();
    }

    static void dfs1(int u, int p, int d) {
        size[u] = 1;
        parent[u] = p;
        depth[u] = d;
        for (Edge e : adj[u]) {
            int v = e.v;
            int w = e.w;
            if (v != p) {
                dist[v] = dist[u] + w;
                dfs1(v, u, d + 1);
                size[u] += size[v];
            }
        }
    }

    static void dfs2(int u, int p, int n) {
        boolean isCentroid = true;
        int maxSubtree = 0;
        for (Edge e : adj[u]) {
            int v = e.v;
            if (v != p) {
                dfs2(v, u, n);
                maxSubtree = Math.max(maxSubtree, size[v]);
                if (size[v] > n / 2) {
                    isCentroid = false;
                }
            }
        }
        maxSubtree = Math.max(maxSubtree, n - size[u]);
        if (maxSubtree <= n / 2) {
            isCentroid = true;
        }
        if (isCentroid) {
            centroid = u;
        }
    }

    static class Edge {
        int v, w;

        Edge(int v, int w) {
            this.v = v;
            this.w = w;
        }
    }

    static String next() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    static int nextInt() {
        return Integer.parseInt(next());
    }
}
