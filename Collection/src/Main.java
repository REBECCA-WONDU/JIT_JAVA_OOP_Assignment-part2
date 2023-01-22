public class Main {
    public static void main(String[] args) {
        public int isSquare(int n) {
            int i;
            for (i = 0; i <= n; i++) {
                if (i * i == n)
                    return 1;
                break;
            }
            return 0;
        }
        public static int checkConcatenatedSum(int n, int catlen)
        {
            int isConcatenatedSum = 1;
            int sum = 0, tempn = n;
            do
            {
                int lastdigit = tempn % 10;
                int tempsum = 0;
                int tens = 1;
                for (int i = 1; i <= catlen; i++)
                {

                    tempsum += (tens * lastdigit);
                    tens *= 10;
                }

                tempn = tempn / 10;
                sum += tempsum;
            } while (tempn >= 1);

            if (sum != n) isConcatenatedSum = 0;
            return isConcatenatedSum;
        }
        public static int isLegalNumber(int[] a, int bases)
        {
            int isLegalNumber = 1;

            for (int i = 0; i < a.length ; i++)
            {
                if (a[i] >= bases)
                    isLegalNumber = 0;

            }
            return isLegalNumber;
        }

    }
}