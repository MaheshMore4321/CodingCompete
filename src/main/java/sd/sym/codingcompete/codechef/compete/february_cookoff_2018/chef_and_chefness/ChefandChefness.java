package sd.sym.codingcompete.codechef.compete.february_cookoff_2018.chef_and_chefness;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class ChefandChefness {

  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    FastScanner in = new FastScanner(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    ChefAndChefness solver = new ChefAndChefness();
    int testCount = Integer.parseInt(in.next());
    for (int i = 1; i <= testCount; i++) {
      solver.solve(i, in, out);
    }
    out.close();
  }

  static class ChefAndChefness {
    public void solve(int testNumber, FastScanner in, PrintWriter out) {
      //   int n = in.nextInt();
      int k = in.nextInt() + 2;
      char[] c = in.next().toCharArray();

      int[][][][] dp = new int[k][k][k][k];
      int[][][][] newDp = new int[k][k][k][k];
      int INF = Integer.MAX_VALUE / 3;
      for (int i = 0; i < k; i++) {
        for (int j = 0; j < k; j++) {
          for (int t = 0; t < k; t++) {
            for (int l = 0; l < k; l++) {
              newDp[i][j][t][l] = dp[i][j][t][l] = INF;
            }
          }
        }
      }
      dp[0][0][0][0] = 0;
      for (char ch : c) {
        if (ch == 'c') {
          for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
              for (int t = 0; t < k; t++) {
                int[] prev = dp[i][j][t];
                int[] next = newDp[Math.min(k - 1, i + 1)][j][t];
                int[] next2 = newDp[i][j][t];
                for (int l = 0; l < k; l++) {
                  if (prev[l] == INF) {
                    continue;
                  }
                  next[l] = Math.min(next[l], prev[l]);
                  next2[l] = Math.min(next2[l], prev[l] + 1);
                }
              }
            }
          }
        } else if (ch == 'h') {
          for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
              for (int t = 0; t < k; t++) {
                int[] prev = dp[i][j][t];
                int[] next = newDp[i][Math.min(k - 1, i + j)][t];
                int[] next2 = newDp[i][j][t];
                for (int l = 0; l < k; l++) {
                  if (prev[l] == INF) {
                    continue;
                  }
                  next[l] = Math.min(next[l], prev[l]);
                  next2[l] = Math.min(next2[l], prev[l] + 1);
                }
              }
            }
          }
        } else if (ch == 'e') {
          for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
              for (int t = 0; t < k; t++) {
                int[] prev = dp[i][j][t];
                int[] next = newDp[i][j][Math.min(k - 1, t + j)];
                int[] next2 = newDp[i][j][t];
                for (int l = 0; l < k; l++) {
                  if (prev[l] == INF) {
                    continue;
                  }
                  next[l] = Math.min(next[l], prev[l]);
                  next2[l] = Math.min(next2[l], prev[l] + 1);
                }
              }
            }
          }
        } else if (ch == 'f') {
          for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
              for (int t = 0; t < k; t++) {
                int[] prev = dp[i][j][t];
                int[] next2 = newDp[i][j][t];
                for (int l = 0; l < k; l++) {
                  if (prev[l] == INF) {
                    continue;
                  }
                  next2[Math.min(k - 1, l + t)] = Math.min(next2[Math.min(k - 1, l + t)], prev[l]);
                  next2[l] = Math.min(next2[l], prev[l] + 1);
                }
              }
            }
          }
        }

        for (int i = 0; i < k; i++) {
          for (int j = 0; j < k; j++) {
            for (int t = 0; t < k; t++) {
              int[] prev = dp[i][j][t];
              int[] next2 = newDp[i][j][t];
              for (int l = 0; l < k; l++) {
                prev[l] = next2[l];
                next2[l] = INF;
              }
            }
          }
        }
      }
      int result = INF;
      for (int i = 0; i < k; i++) {
        for (int j = 0; j < k; j++) {
          for (int t = 0; t < k; t++) {
            result = Math.min(result, dp[i][j][t][k - 2]);
          }
        }
      }
      out.println(result == INF ? -1 : result);
    }

  }

  static class FastScanner {
    BufferedReader br;
    StringTokenizer st;

    public FastScanner(InputStream in) {
      br = new BufferedReader(new InputStreamReader(in));
    }

    public String next() {
      while (st == null || !st.hasMoreElements()) {
        String line = null;
        try {
          line = br.readLine();
        } catch (IOException e) {
        }
        st = new StringTokenizer(line);
      }
      return st.nextToken();
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }

  }
}



