package ru.netology.radio;

public class Radio {
    private int currentVolume = 5;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int maxStation;
    private int minStation = 0;
    private int currentStation = 2;

    public Radio() {
        this.maxStation = 9;
    }

    public  Radio(int stationCount) {
        this.maxStation = stationCount - 1;
    }
    public int getCurrentVolume() { //получаем текущую громкость
        return currentVolume;
    }

    protected void setMaxVolume() { //Разрешаем устанавливать максимальную громкость для тестов
        currentVolume = maxVolume;
    }

    protected void setMinVolume() { //Разрешаем устанавливать минимальную громкость для тестов
        currentVolume = minVolume;
    }

    public void setCurrentVolume(int currentVolume) { //разрешаем устанавливать громкость в диапазоне 0-10 для тестов
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextVolume() { //изменение громкости в большую сторону
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
            return;
        }
        setCurrentVolume(currentVolume);
    }

    public void prevVolume() { //Уменьшение громкости
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        setCurrentVolume(currentVolume);
    }

    public void setMinStation() { // Устанавливаем миксимальную станцию для тестов
        currentStation = minStation;
    }

    public void setMaxStation() { // Устанавливаем минимальную станцию для тестов
        currentStation = maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) { //разрешаем устанавливать программы в диапазоне 0-9 для тестов
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() { //изменение программы на следующую
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void prevStation() { //изменение программы на предудущую
        if (currentStation > minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }
}
