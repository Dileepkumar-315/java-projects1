package day7;
public class Islands {

    static int countIslands(char[][] g) {
        int count = 0;
        for (int i = 0; i < g.length; i++)
            for (int j = 0; j < g[0].length; j++)
                if (g[i][j] == '1') {
                    mark(g, i, j);
                    count++;
                }
        return count;
    }

    static void mark(char[][] g, int i, int j) {
        if (i < 0 || j < 0 || i >= g.length || j >= g[0].length || g[i][j] != '1') return;
        g[i][j] = '0';
        mark(g, i + 1, j); mark(g, i - 1, j);
        mark(g, i, j + 1); mark(g, i, j - 1);
    }

    public static void main(String[] args) {
        char[][] grid = {
            "11000000000000000000".toCharArray(),
            "11000000000000000000".toCharArray(),
            "00100000000000000000".toCharArray(),
            "00000001110000000000".toCharArray(),
            "00000001110000000000".toCharArray(),
            "00000000000000000000".toCharArray(),
            "00001100000000000000".toCharArray(),
            "00001100000000000000".toCharArray(),
            "00000000000110000000".toCharArray(),
            "00000000000110000000".toCharArray(),
            "00000000000000001100".toCharArray(),
            "00000000000000001100".toCharArray(),
            "00000000000000000000".toCharArray(),
            "00011000000000110000".toCharArray(),
            "00011000000000110000".toCharArray(),
            "00000000000000000000".toCharArray(),
            "11100000000000000000".toCharArray(),
            "10100000000000000000".toCharArray(),
            "11100000000000000000".toCharArray(),
            "00000000000000000000".toCharArray()
        };

        System.out.println("Islands: " + countIslands(grid));
    }
}
