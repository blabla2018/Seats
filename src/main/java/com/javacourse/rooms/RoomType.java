package com.javacourse.rooms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum RoomType {
    KITCHEN,
    BEDROOM,
    DININGROOM,
    BATHROOM,
    NURSERY;

    private static final List<RoomType> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static RoomType getRandom()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}