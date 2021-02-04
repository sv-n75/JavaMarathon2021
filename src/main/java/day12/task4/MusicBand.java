package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public int getYear() {
        return year;
    }

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<String> getMembers() {
        return members;
    }

    public void printMembers() {
        System.out.println(getMembers());
    }

    public static void transferMembers(MusicBand band1, MusicBand band2) {
        for (String members :
                band1.getMembers()) {
            band2.getMembers().add(members);
        }
        band1.getMembers().clear();
    }
}
