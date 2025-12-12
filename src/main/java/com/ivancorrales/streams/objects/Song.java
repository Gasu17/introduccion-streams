package com.ivancorrales.streams.objects;

import java.util.Objects;

public class Song {
    private final String title;
    private final String artist;
    private final int seconds;
    private final double rating;

    public Song(String title, String artist, int seconds, double rating) {
        this.title = title;
        this.artist = artist;
        this.seconds = seconds;
        this.rating = rating;
    }

    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public int getSeconds() { return seconds; }
    public double getRating() { return rating; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song)) return false;
        Song song = (Song) o;
        return Objects.equals(title, song.title) && Objects.equals(artist, song.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist);
    }
}
