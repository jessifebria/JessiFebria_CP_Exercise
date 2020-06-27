
package exercise3;

public class Segitiga extends Operasi_Angka {
     protected double a,b,c;
    
    @Override
    protected double getA() {
        return a;
    }

    @Override
    protected void setA(double a) {
      this.a =a;  
    }

    @Override
    protected double getB() {
        return b;
    }

    @Override
    protected void setB(double b) {
        this.b=b;
    }

    @Override
    protected double getC() {
        return c;
    }

    @Override
    protected void setC() {
        this.c=a*b/2;
    }

    @Override    
    protected void tampil() {
        System.out.println("Luas dari Segitiga dengan alas "+a+" , tinggi "+b+" = "+c);
    }
}
