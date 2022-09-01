package Task8;

import java.util.Objects;

public class CustomDouble {
    private int i ;
    private double d;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomDouble that = (CustomDouble) o;
        return i == that.i && Double.compare(that.d, d) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, d);
    }

    public CustomDouble(int i, double d) {
        this.i = i;
        this.d = d;
    }

    public CustomDouble sum(CustomDouble c ) {
        CustomDouble y = new CustomDouble(0,0);
        y.i = i +c.i ;
        y.d = d +c.d;
        while (y.d>1){
            y.i += 1;
            y.d -= 1;
        }
        return y;
    }
    public CustomDouble ded(CustomDouble c ) {
        CustomDouble y = new CustomDouble(0,0);
        y.i = i -c.i ;
        y.d = d -c.d;
        while (y.d<0.1){
            y.i -= 1;
            y.d += 1;
        }
        return y;
    }
    public double toDouble (){
        return i+d ;
    }

    public int getI() {
        return i;
    }

    public double getD() {
        return d;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setD(double d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "CustomDouble{" +
                "i=" + i +
                ", d=" + d +
                '}';
    }
}

