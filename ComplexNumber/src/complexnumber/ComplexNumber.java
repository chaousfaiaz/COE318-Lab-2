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
import java.lang.Math;
public class ComplexNumber {
private double real, imaginary;
    /**
     * @param args the command line arguments
     */
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public double getReal(){ return real; }
    public double getImaginary(){ return imaginary;}
     public ComplexNumber negate(){
     return new ComplexNumber(-real, -imaginary);
     } 
    public ComplexNumber add(ComplexNumber z) {
        return new ComplexNumber(real + z.real, imaginary +z.imaginary);
    }
    public ComplexNumber subtract(ComplexNumber z) {
        return new ComplexNumber(real - z.real, imaginary - z.imaginary);
      
    }
    public ComplexNumber multiply(ComplexNumber z) {
        return new ComplexNumber(real* z.real - imaginary*z.imaginary, imaginary* z.real + real*z.imaginary);
    }
     public ComplexNumber reciprocal(){ 
         double denominator = Math.pow(real,2) + imaginary*imaginary;
         return new ComplexNumber(real/denominator , - imaginary/denominator);
             }
     public ComplexNumber divide(ComplexNumber z){
        double denominator = z.real*z.real + Math.pow(z.imaginary,2);
        double realNumerator = real*z.real + imaginary*z.imaginary;
        double imaginaryNumerator = imaginary*z.real - real*z.imaginary;
        return new ComplexNumber(realNumerator/denominator, imaginaryNumerator/denominator);
     }
      @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE!
        String str = "" + this.getReal();
        if (this.getImaginary() == 0.0) {
            return str;
        }
        if (this.getImaginary() > 0) {
            return str + " + i" + this.getImaginary();
        } else {
            return str + " - i" + -this.getImaginary();
        }
    }
    
    
}
