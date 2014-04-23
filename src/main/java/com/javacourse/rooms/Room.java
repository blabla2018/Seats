package com.javacourse.rooms;

import com.javacourse.dimensions.Dimension;
import com.javacourse.seats.SeatImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anatoly.prokofyev on 23.04.14.
 */
public class Room {
    private RoomType roomType;
    private Dimension dimension = new Dimension(0, 0, 0);
    private List<SeatImpl> seatList = new ArrayList<SeatImpl>();

    public Room() {
    }

    public Room(RoomType roomType) {
        setType(roomType);
    }

    public void setType(RoomType roomType) {
        this.roomType = roomType;
    }

    public RoomType getType() {
        return roomType;
    }

    public void setSize(int x, int y, int z) {
        dimension = new Dimension(x, y, z);
    }

    public long getSquare() {
        return dimension.getSquare();
    }

    public long getCubicCapacity() {
        return dimension.getCubicCapacity();
    }

    public void addSeat(SeatImpl seat) {
        seatList.add(seat);
    }

    public void removeSeat(int index) {
        seatList.remove(index);
    }

    public int getSeatCount() {
        return seatList.size();
    }

    public int getBrokenSeatCount() {
        int count = 0;
        for (SeatImpl seat : seatList)
            if (seat.getBroken())
                count++;
        return count;
    }

    public void sitOnSeatByWeight(int index, int weight) {
        seatList.get(index).sitByWeight(weight);
    }

    public float getProbabilyOfBroken(int weight) {
        int count = 0;
        for (SeatImpl seat : seatList)
            if (weight > seat.getMaxWeight())
                count++;
        return (float)count/getSeatCount();
    }
}
