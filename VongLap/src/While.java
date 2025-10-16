public class While {
    public static void main(String[] args) {
        int n = 0;
        int sum = 0;

        while (sum <= 10000) {
            n++;
            sum += n;
        }

        System.out.println("Số nhỏ nhất thỏa điều kiện là: " + n);
    }
}
