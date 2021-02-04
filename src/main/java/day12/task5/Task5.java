package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members = new ArrayList<>();
        members.add(new MusicArtist("BBB", 4));
        members.add(new MusicArtist("BCB", 6));
        members.add(new MusicArtist("DFD", 6));
        day12.task5.MusicBand musicBand = new day12.task5.MusicBand("aha", 1980, members);

        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("YYY", 6));
        members1.add(new MusicArtist("UUU", 12));
        members1.add(new MusicArtist("rre", 88));
        day12.task5.MusicBand musicBand1 = new day12.task5.MusicBand("Depe", 2000, members1);

        System.out.println(members);
        System.out.println(members1);

        MusicBand.transferMembers(musicBand, musicBand1);
        musicBand.printMembers();
        musicBand1.printMembers();

    }
}
