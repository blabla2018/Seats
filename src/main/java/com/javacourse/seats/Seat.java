package com.javacourse.seats;

/**
 * Created by anatoly.prokofyev on 23.04.14.
 */
interface Seat {
    public void sitByWeight(int weight);
    public boolean getBroken();
    public void setSize(int x, int y, int z);
    public long getSquare();
}
