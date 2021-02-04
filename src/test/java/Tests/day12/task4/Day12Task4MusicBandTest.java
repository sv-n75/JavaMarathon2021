package Tests.day12.task4;

import day12.task4.MusicBand;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day12Task4MusicBandTest {

    @Test
    void transferMembers() {
        List<String> members1 = new ArrayList<>();
        members1.add("Grace Slick");
        members1.add("Marty Balin");
        members1.add("Paul Kantner");
        MusicBand band1 = new MusicBand("Jefferson Airplane", 1965, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("John Lennon");
        members2.add("Paul McCartney");
        MusicBand band2 = new MusicBand("The Beatles", 1960, members2);

        MusicBand.transferMembers(band1, band2);

        assertEquals(0, band1.getMembers().size(), "Участники: гр. А = 3, гр. В = 2. После объединения в группе А");
        assertEquals(5, band2.getMembers().size(), "Участники: гр. А = 3, гр. В = 2. После объединения в группе В");
    }

}
