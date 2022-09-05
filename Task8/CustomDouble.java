package Task8;

import java.util.Objects;

public class CustomDouble {
    private int i;
    private double d;

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final CustomDouble that = (CustomDouble) o;
        return i == that.i && Double.compare(that.d, d) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, d);
    }

    public CustomDouble(final int i, final double d) {
        this.i = i;
        if (d < 1) {
            this.d = d;
        } else {
            this.d = d - (int) d;
            System.out.println("Error:Can`t initialized second part properly");
        }
    }

    public CustomDouble sum(final CustomDouble c) {
        final CustomDouble y = new CustomDouble(0, 0);
        final int Integer;
        y.i = i + c.i;
        y.d = d + c.d;
        if (y.d > 1) {
            Integer = (int) y.d;
            y.d = y.d - Integer;
            y.i = y.i + Integer;
        }
        return y;
    }

    public CustomDouble ded(final CustomDouble c) {
        final CustomDouble y = new CustomDouble(0, 0);
        final int Integer;
        y.i = i - c.i;
        y.d = d - c.d;
        if (y.d < 0.1) {
            Integer = (int) y.d;
            y.d = y.d + Integer;
            y.i = y.i - Integer;
        }
        return y;
    }

    public double toDouble() {
        return i + d;
    }

    public int getI() {
        return i;
    }

    public double getD() {
        return d;
    }

    public void setI(final int i) {
        this.i = i;
    }

    public void setD(final double d) {
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

