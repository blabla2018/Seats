package com.javacourse.dimensions;

/**
 * Created by anatoly.prokofyev on 23.04.14.
 */
public class Dimension {
    public int x, y ,z;

    public Dimension(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public long getSquare() {
        return x*y;
    }

    public long getCubicCapacity() {
        return x*y*z;
    }
}
