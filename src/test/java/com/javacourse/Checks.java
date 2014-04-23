package com.javacourse;

import com.javacourse.rooms.Room;
import com.javacourse.rooms.RoomType;
import com.javacourse.seats.Chair;
import com.javacourse.seats.Stool;
import com.javacourse.seats.Table;
import org.junit.Test;

/**
 * Created by anatoly.prokofyev on 23.04.14.
 */
public class Checks {

    @Test
    public void createRooms() {
        System.out.println("\n\nTEST\nCheck room types");
        Room dinner = new Room(RoomType.DININGROOM);
        dinner.setSize(3,4,3);
        System.out.println("Dinning room square: " + dinner.getSquare());
        System.out.println("Dinning cubical capacity: " + dinner.getCubicCapacity());

        Room bedRoom1 = new Room();
        bedRoom1.setType(RoomType.BEDROOM);
        System.out.println("Bedroom room square (Dimensions are not set): " + bedRoom1.getSquare());
        bedRoom1.setType(RoomType.getRandom());
        System.out.println("Bedroom room was randomly updated to " + bedRoom1.getType());
    }

    @Test
    public void checkSeats() {
        System.out.println("\n\nTEST\nCheck seats breakability");
        Stool stool1 = new Stool(100);
        System.out.println("Is the stool broken (just created): " + stool1.getBroken());
        stool1.sitByWeight(99);
        System.out.println("Is the stool broken (sit by accepted weight): " + stool1.getBroken());
        stool1.sitByWeight(199);
        System.out.println("Is the stool broken (sit by NOT accepted weight): " + stool1.getBroken());
        stool1.sitByWeight(99);
        System.out.println("Is the stool broken (sit by accepted weight, but already broken): " + stool1.getBroken());
    }

    @Test
    public void addSeatsIntoRoom() {
        System.out.println("\n\nTEST\nCreate a room and add stools, chairs and table");
        Room room = new Room();
        room.addSeat(new Stool(100));
        room.addSeat(new Stool(200));
        room.addSeat(new Chair(50));
        room.addSeat(new Chair(60));
        room.addSeat(new Table(500));
        System.out.println("Count of seats in the room: " + room.getSeatCount());
        System.out.println("Count of broken seats in the room: " + room.getBrokenSeatCount());

        System.out.println("\nSit by accepted weight");
        room.sitOnSeatByWeight(0, 10);
        room.sitOnSeatByWeight(1, 20);
        room.sitOnSeatByWeight(2, 30);
        System.out.println("Count of broken seats in the room: " + room.getBrokenSeatCount());

        System.out.println("\nSit by NOT accepted weight on 2 seats");
        room.sitOnSeatByWeight(0, 101);
        room.sitOnSeatByWeight(1, 201);
        System.out.println("Count of broken seats in the room: " + room.getBrokenSeatCount());
    }

    @Test
    public void checkTables() {
        System.out.println("\n\nTEST\nCheck tables");
        Table table = new Table(500);
        System.out.println("Table form (Dimensions are not set): " + table.getFormFactor());
        table.setSize(5,5,1);
        System.out.println("Table form (x == y): " + table.getFormFactor());
        table.setSize(5,6,1);
        System.out.println("Table form (x != y): " + table.getFormFactor());
    }

    @Test
    public void checkBreakability() {
        System.out.println("\n\nTEST\nCheck probability of break");
        Room room = new Room();
        room.addSeat(new Stool(100));
        room.addSeat(new Stool(200));
        room.addSeat(new Chair(50));
        room.addSeat(new Chair(60));
        room.addSeat(new Table(500));
        int weight = 90;
        System.out.println("Probability that weight=" + weight + " breaks one of seats: " + room.getProbabilyOfBroken(weight));
    }
}
