package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_should_setRoomToOccupiedAndDirty() {
        // Arrange
        Room room = new Room(2,139.0,false,false);

        // Act
        room.checkIn();

        // Assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }


    @Test
    public void checkOut_should_notCheckInOccupiedRoomAndDirty() {
        //arrange
        Room room = new Room(2,139.00,false,true);
        room.checkIn();


        //Act
        room.checkOut();

        //Assert
        assertFalse(room.isOccupied());
        assertTrue(room.isDirty());
    }


    @Test
    public void cleanRoom_should_notCleanCleanRoom() {
        //Arrange
        Room room = new Room(2,139.00,false,true);
        room.checkIn();

        //Act
        room.cleanRoom();

        //Assert
        assertFalse(room.isDirty());


    }
}