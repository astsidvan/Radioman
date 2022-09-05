package radio;

public class Radio {
    private int currentStation;
    private int maxCurrentStation = 10;
    private int currentVolume;
    private int maxCurrentVolume = 100;
    
    public Radio(){
        maxCurrentStation = 10;
    }

    public Radio(int maxCurrentStation, int maxCurrentVolume){
        this.maxCurrentStation = maxCurrentStation;
    }
    public void setCurrentStation(int inStation) {
        if (inStation < 0) {
            return;
        }
        if (inStation > maxCurrentStation - 1) {
            return;
        }
        currentStation = inStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentVolume(int inVolume) {

        currentVolume = inVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void nextStation() {
        if (currentStation == maxCurrentStation - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = maxCurrentStation - 1;
        } else {
            currentStation--;
        }
    }


    public void increaseVolume() {
        if (currentVolume < maxCurrentVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void creaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}
