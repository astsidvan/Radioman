package radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void test1() {
        Radio rad = new Radio();
        rad.setCurrentStation(7);

        int expected = 7;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void test2() {
        Radio vol = new Radio();
        vol.setCurrentVolume(8);

        int expected = 8;
        int actual = vol.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void test3() {
        Radio rad = new Radio();
        rad.setCurrentStation(7);
        rad.setCurrentStation(-1);

        int expected = 7;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);

        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        Radio rad = new Radio();
        rad.setCurrentStation(5);

        int expected = 5;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        Radio rad = new Radio();
        rad.setCurrentStation(7);
        rad.next();

        int expected = 8;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test7() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.next();

        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test8() {
        Radio rad = new Radio();
        rad.setCurrentStation(7);
        rad.prev();

        int expected = 6;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test9() {
        Radio rad = new Radio();
        rad.prev();

        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test10() {
        Radio rad = new Radio();
        rad.setCurrentVolume(7);
        rad.increaseVolume();

        int expected = 8;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test11() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        rad.increaseVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test12() {
        Radio rad = new Radio();
        rad.setCurrentVolume(7);
        rad.creaseVolume();

        int expected = 6;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test13() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.creaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
