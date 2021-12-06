/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexnumber;

/**
 *
 * @author faiaz
 */
public class ComplexTry {
    
   /**
     * The output should be:
     * <pre>
     * a = 1.0 + i2.0
     * b (-a) = -1.0 - i2.0
     * c = 2.0 + i3.0
     * d (a + c) = 3.0 + i5.0
     * e (a - c) = -1.0 - i1.0
     * f (1 / a) = 0.2 - i0.4
     * g (a / c) = 0.6153846153846154 + i0.07692307692307693
     * h (a * c) = -4.0 + i7.0
     * </pre>
     * @param args Command line not used.
     */
    public static void main(String[] args) {
        ComplexNumber a, b, c, d, e, f, g, h;
        a = new ComplexNumber(1, 2);
        System.out.println("a = " + a);
        b = a.negate();
        System.out.println("b (-a) = " + b);
        c = new ComplexNumber(2, 3);
        System.out.println("c = " + c);
        d = a.add(c);
        System.out.println("d (a + c) = " + d);
        e = a.subtract(c);
        System.out.println("e (a - c) = " + e);
        f = a.reciprocal();
        System.out.println("f (1 / a) = " + f);
        g = a.divide(c);
        System.out.println("g (a / c) = " + g);
        h = a.multiply(c);
        System.out.println("h (a * c) = " + h);
    }
  
}