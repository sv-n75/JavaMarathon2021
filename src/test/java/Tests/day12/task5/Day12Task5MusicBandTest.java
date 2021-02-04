package Tests.day12.task5;

import day12.task5.MusicArtist;
import day12.task5.MusicBand;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day12Task5MusicBandTest {

    @Test
    void transferMembers() {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Grace Slick", 50));
        members1.add(new MusicArtist("Marty Balin", 35));
        members1.add(new MusicArtist("Paul Kantner", 24));
        members1.add(new MusicArtist("Jorma Kaukonen", 40));
        MusicBand band1 = new MusicBand("Jefferson Airplane", 1965, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("John Lennon", 32));
        members2.add(new MusicArtist("Paul McCartney", 54));
        members2.add(new MusicArtist("Ringo Starr", 61));
        MusicBand band2 = new MusicBand("The Beatles", 1960, members2);

        MusicBand.transferMembers(band1, band2);
        assertEquals(0, band1.getMembers().size(), "Участники: гр. А = 4, гр. В = 3. После объединения в группе А");
        assertEquals(7, band2.getMembers().size(), "Участники: гр. А = 4, гр. В = 3. После объединения в группе В");

    }
}