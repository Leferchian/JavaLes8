package ru.netology.function;

public class Radio {
    private int currentStation;

    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int nextStation() {
        currentStation++;
        if (currentStation == 10) {
            currentStation = 0;
        }
        return currentStation;
    }

    public int prevStation() {
        currentStation--;
        if (currentStation == -1) {
            currentStation = 9;
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
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int nextVolume() {
        if (currentVolume < 10) {
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
