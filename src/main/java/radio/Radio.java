package radio;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public void setCurrentStation(int inStation) {
        if (inStation < 0) {
            return;
        }
        if (inStation > 9) {
            return;
        }
        currentStation = inStation;
    }
    public int getCurrentStation(){
        return currentStation;
    }
    public void setCurrentVolume(int inVolume){

        currentVolume = inVolume;
    }
    public int getCurrentVolume(){
        return currentVolume;
    }

    public void next() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }


    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void creaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}
