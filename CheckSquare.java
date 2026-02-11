  public class CheckSquare {

    // Function to calculate square of distance between two points
    static int distance(int x1, int y1, int x2, int y2) {
        return (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
    }

    public static void main(String[] args) {

        // Given points
        int x1 = 20, y1 = 10;
        int x2 = 10, y2 = 20;
        int x3 = 20, y3 = 20;
        int x4 = 10, y4 = 10;

        // Calculate all 6 distances
        int d1 = distance(x1, y1, x2, y2);
        int d2 = distance(x1, y1, x3, y3);
        int d3 = distance(x1, y1, x4, y4);
        int d4 = distance(x2, y2, x3, y3);
        int d5 = distance(x2, y2, x4, y4);
        int d6 = distance(x3, y3, x4, y4);

        int[] distances = {d1, d2, d3, d4, d5, d6};

        java.util.Arrays.sort(distances);

        // Check square condition
        if (distances[0] > 0 &&
            distances[0] == distances[1] &&
            distances[1] == distances[2] &&
            distances[2] == distances[3] &&
            distances[4] == distances[5]) {

            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

  

