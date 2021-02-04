package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String>members = new ArrayList<>();
        members.add("a");
        members.add("b");
        members.add("c");
        MusicBand musicBand = new MusicBand("EEE", 1980, members);

        List<String>members1 = new ArrayList<>();
        members1.add("HHH");
        members1.add("TTT");
        members1.add("YYY");
        MusicBand musicBand1 = new MusicBand("Return", 2000, members1);

        System.out.println(members);
        System.out.println(members1);

        MusicBand.transferMembers(musicBand, musicBand1);
        musicBand.printMembers();
        musicBand1.printMembers();

    }
}
