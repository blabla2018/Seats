package com.javacourse.seats;

import com.javacourse.dimensions.Dimension;

/**
 * Created by anatoly.prokofyev on 23.04.14.
 */
public class SeatImpl implements Seat {
    private int maxWeight;
    private boolean isBroken = false;
    private Dimension dimension = new Dimension(0, 0, 0);

    public SeatImpl(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void sitByWeight(int weight) {
        isBroken |= weight > maxWeight;
    }

    public boolean getBroken() {
        return isBroken;
    }

    public void setSize(int x, int y, int z) {
        dimension = new Dimension(x, y, z);
    }

    public long getSquare() {
        return dimension.getSquare();
    }

    public int getX() {
        return dimension.x;
    }

    public int getY() {
        return dimension.y;
    }

    public int getZ() {
        return dimension.z;
    }

    public int getMaxWeight() {
        return maxWeight;
    }
}
