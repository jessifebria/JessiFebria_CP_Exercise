
package exercise3;

public class Lingkaran extends Operasi_Angka{
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
        this.b=1;
    }

    @Override
    protected double getC() {
        return c;
    }

    @Override
    protected void setC() {
        this.c=3.14285714*a*a;
    }

    @Override    
    protected void tampil() {
        System.out.println("Luas dari Lingkaran dengan jari-jari "+a+" = "+c);
    }
}
