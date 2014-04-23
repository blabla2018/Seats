package com.javacourse.seats;

/**
 * Created by anatoly.prokofyev on 23.04.14.
 */
public class Table extends SeatImpl {
    public Table(int maxWeight) {
        super(maxWeight);
    }

    public String getFormFactor() {
        if (getX() == 0)
            return "Dimensions are not set!";
        return getX() == getY() ? "square" : "rectangle";
    }
}
