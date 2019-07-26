
public class Triangle {

    public void createTriangle(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            if (i == n) {
                for (int j = i; j > 0; j--) {

                    System.out.print("1 ");

                }
            } else
                for (int j = i; j > 0; j--) {
                    if (j == 1 || j == i) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                }
            System.out.println();
        }
    }
}
