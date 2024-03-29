package algorithm.basic.graph.unionfind;

public class UnionFind {
    private int[] parent;

    // 默认节点的值为[0, size-1]
    public UnionFind(int size) {
        // 初始让每个元素的根节点=自己
        parent = new int[size];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }
    }

    // 不用parent[a] = b 是为了避免产生环 即出现 parent[a]=b; parent[b]= a 的情况, 破坏了并查集的树形结构
    public void union(int a, int b) {
        parent[findRoot(a)] = findRoot(b);
    }

    // 核心代码
    public int findRoot(int a) {
        if (parent[a] != a) {
            parent[a] = findRoot(parent[a]);
        }
        return parent[a];
    }

    public boolean isConnected(int a, int b) {
        return findRoot(a) == findRoot(b);
    }
}
