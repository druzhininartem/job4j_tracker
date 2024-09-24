package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        String song;
        switch (position) {
            case 1:
                song = "Пусть бегут неуклюже";
                break;
            case 2:
                song = "Спокойной ночи";
                break;
            default:
                song = "Песня не найдена";
                break;
        }
        System.out.println(song);
    }

    public static void main(String[] args) {
        Jukebox jukebox = new Jukebox();
        jukebox.music(1);
        jukebox.music(2);
        jukebox.music(99);
    }
}
