package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();

        bands.add(new MusicBand("The Beatles", 1980));
        bands.add(new MusicBand("The Rolling Stones", 1980));
        bands.add(new MusicBand("Queen", 1980));
        bands.add(new MusicBand("Deep Purple", 1980));
        bands.add(new MusicBand("Led Zeppelin", 1980));
        bands.add(new MusicBand("Pink Floyd", 1980));
        bands.add(new MusicBand("AC/DC", 1980));
        bands.add(new MusicBand("Nirvana", 1980));
        bands.add(new MusicBand("Scorpions", 2001));
        bands.add(new MusicBand("Metallica", 2002));
        bands.add(new MusicBand("Guns N’ Roses", 2003));
        bands.add(new MusicBand("The Doors", 2004));
        bands.add(new MusicBand("The Who", 2005));
        bands.add(new MusicBand("Black Sabbath", 2006));
        bands.add(new MusicBand("Aerosmith", 1980));
        bands.add(new MusicBand("Bon Jovi", 2011));

        Collections.shuffle(bands);

        System.out.println(bands);
        System.out.println(groupsAfter2000(bands));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> groupsAfter2000 = new ArrayList<>();
        for (int i = 0; i < bands.size(); i++) {
            if (bands.get(i).getYear() > 2000) {
                groupsAfter2000.add(bands.get(i));
            }
        }
        return groupsAfter2000;
    }

}
