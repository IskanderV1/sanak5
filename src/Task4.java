public class Task4 {
    public static void main(String[] args) {
        int[] az = new int[10];



        for (int i = 0; i < az.length; i++) {
           az[i] = i + 1;
        }
        for (int m : az) {
            System.out.println(m);
        }
    }
}
