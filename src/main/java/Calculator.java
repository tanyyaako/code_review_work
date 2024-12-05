public class Calculator {
    /** * Adds two integers.
     * @param a the first integer * @param b the second integer
     * @return the sum of a and b */
    public int add(int a, int b){
        return a+b;
    }

    /** * Subtracts the second integer from the first.
     * @param a the first integer * @param b the second integer
     * @return the difference (a - b) */
    public int dif(int a, int b){
        return a-b;
    }

    /** * Divides the first integer by the second.
     * @param a the numerator * @param b the denominator
     * @return the quotient (a / b) * @throws ArithmeticException if b is 0
     */
    public int div(int a, int b){
        if (b == 0) {
            throw new ArithmeticException("Not zero");
        }
        return a/b;
    }
    /** * Multiplies two integers.
     * @param a the first integer * @param b the second integer
     * @return the product of a and b */
    public int times(int a, int b){
        return a*b;
    }

    /** * Solves the expression: (a + b) * (c - d) / d
     * @param a the first integer
     * @param b the second integer
     * @param c the third integer
     * @param d the fourth integer
     * @return the result of the expression */
    public int solver(int a, int b, int c, int d){
        int sum = add(a,b);
        int diff = dif(c,d);
        int time = times(sum,diff);
        return div(time,d);
    }
}
