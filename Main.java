public class Main {
    public static void main(String[] args) {
        int[] results = {540, 612, 587, 635, 598, 621, 573};
        int bestResult = results[0];
        for (int i = 1; i < results.length; i++) {
            if (results[i] > bestResult) {
                bestResult = results[i];
            }
        }
        System.out.println("Победитель! Лучший результат: " + bestResult + " см.");
    }
}
