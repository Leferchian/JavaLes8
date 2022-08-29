package ru.netology.function;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RadioTest {


    @ParameterizedTest
    @CsvSource(value = {"-1,0", "0,0", "1,1", "8,8", "9,9", "10,0", "5,5"})
    public void testSetCurrentStation(int valueStation, int expected) {
        Radio station = new Radio();
        station.setCurrentStation(valueStation);

        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"-1,35,0", "0,35,0", "1,35,1", "8,35,8", "9,35,9", "34,35,34", "35,35,0"})
    public void testSetMaxAndCurrentStation(int valueStation, int maxStation, int expected) {
        Radio station = new Radio(maxStation);
        station.setCurrentStation(valueStation);

        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"5,6", "7,8", "8,9", "9,0"})
    public void testNextStation(int valueStation, int expected) {
        Radio station = new Radio();
        station.setCurrentStation(valueStation);

        int actual = station.nextStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"5,32,6", "30,32,31", "31,32,0", "29,32,30"})
    public void testSetMaxAndNextStation(int valueStation, int maxStation, int expected) {
        Radio station = new Radio(maxStation);
        station.setCurrentStation(valueStation);

        int actual = station.nextStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"5,4", "2,1", "1,0", "0,9"})
    public void testPrevStation(int valueStation, int expected) {
        Radio station = new Radio();
        station.setCurrentStation(valueStation);

        int actual = station.prevStation();

        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource(value = {"-1,0", "1,1", "0,0", "101,0", "99,99", "100,100"})
    public void testSetCurrentVolume(int valueVolume, int expected) {
        Radio volume = new Radio();
        volume.setCurrentVolume(valueVolume);

        int actual = volume.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"2,3", "99,100", "100,100", "98,99"})
    public void testNextVolume(int valueVolume, int expected) {
        Radio volume = new Radio();
        volume.setCurrentVolume(valueVolume);

        int actual = volume.nextVolume();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"2,1", "1,0", "0,0", "5,4"})
    public void testPrevVolume(int valueVolume, int expected) {
        Radio volume = new Radio();
        volume.setCurrentVolume(valueVolume);

        int actual = volume.prevVolume();

        assertEquals(expected, actual);
    }
}