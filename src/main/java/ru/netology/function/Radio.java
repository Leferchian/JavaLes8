package ru.netology.function;

public class Radio {
    private int currentStation;
    private int quantityStation = 10;
    private int currentVolume;
    private final int maxVolume = 100;

    public Radio(int quantityStation) {
        this.quantityStation = quantityStation;
    }

    public Radio() {
    }

    public int setMaxVolume() {
        return maxVolume;
    }

    public int setMaxStationNumber() {
        return quantityStation - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > setMaxStationNumber()) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int nextStation() {
        currentStation++;
        if (currentStation == quantityStation) {
            currentStation = 0;
        }
        return currentStation;
    }

    public int prevStation() {
        currentStation--;
        if (currentStation == -1) {
            currentStation = setMaxStationNumber();
        }
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > setMaxVolume()) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int nextVolume() {
        if (currentVolume < setMaxVolume()) {
            currentVolume++;
        }
        return currentVolume;
    }

    public int prevVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
        return currentVolume;
    }

}
