package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public int getYear() {
        return year;
    }

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void printMembers() {
        System.out.println(this.members);
    }

    public static void transferMembers(MusicBand band1, MusicBand band2) {
        for (MusicArtist ma :
                band1.getMembers()) {
            band2.getMembers().add(ma);
        }
        band1.getMembers().clear();
    }
}
