package radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio rad = new Radio(10);

    @Test
    public void newStation() {
        rad.setCurrentStation(7);

        int expected = 7;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void newVolume() {

        rad.setCurrentVolume(8);

        int expected = 8;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void validStationLeft() {

        rad.setCurrentStation(7);
        rad.setCurrentStation(-1);

        int expected = 7;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void validStationRight() {

        rad.setCurrentStation(10);

        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void validStationOk() {

        rad.setCurrentStation(5);

        int expected = 5;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {

        rad.setCurrentStation(7);
        rad.nextStation();

        int expected = 8;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationMax() {

        rad.setCurrentStation(9);
        rad.nextStation();

        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {

        rad.setCurrentStation(7);
        rad.prevStation();

        int expected = 6;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationMin() {
        rad.setCurrentStation(0);
        rad.prevStation();

        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUp() {

        rad.setCurrentVolume(57);
        rad.increaseVolume();

        int expected = 58;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUpMax() {

        rad.setCurrentVolume(100);
        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDown() {

        rad.setCurrentVolume(7);
        rad.creaseVolume();

        int expected = 6;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDownMin() {

        rad.setCurrentVolume(0);
        rad.creaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
