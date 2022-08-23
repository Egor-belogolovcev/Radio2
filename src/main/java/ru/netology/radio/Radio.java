package ru.netology.radio;

public class Radio {
    private int currentVolume =2;
    private int currentStation;

    public int getCurrentVolume() { //получаем текущую станцию
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) { //разрешаем устанавливать громкость в диапазоне 0-10 для тестов
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextVolume() { //изменение громкости в большую сторону
        if (currentVolume < 10) {
            currentVolume++;
            return;
        }
        currentVolume = 10;
    }

    public void prevVolume() { //изменение громкости в меньшую сторону
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }
        public int getCurrentStation () {
            return currentStation;
        }
    public void setCurrentStation ( int currentStation){ //разрешаем устанавливать программы в диапазоне 0-9 для тестов
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 10) {
            return;
        }
        this.currentStation = currentStation;
    }
        public void next () { //изменение программы на следующую
            if (currentStation < 9) {
                currentStation++;
            } else {
                currentStation = 0;
            }
        }

        public void prev () { //изменение программы на предудущую
            if (currentStation > 0) {
                currentStation--;
            } else {
                currentStation = 9;
            }
        }
    }
