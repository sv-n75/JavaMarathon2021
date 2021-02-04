package Tests.day12.task3;

import day12.task3.MusicBand;
import day12.task3.Task3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class Day12Task3MusicBandTest {

    @Test
    void groupsAfter2000() {
        MusicBand band1 = new MusicBand("Tame impala", 2007);
        MusicBand band2 = new MusicBand("The Cure", 1976);
        MusicBand band3 = new MusicBand("The Beatles", 1960);
        MusicBand band4 = new MusicBand("Gruppa Skryptonite", 2018);
        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(band1);
        musicBands.add(band2);
        musicBands.add(band3);
        musicBands.add(band4);
        Assertions.assertEquals(2, Task3.groupsAfter2000(musicBands).size(), "Для 4 групп: 2007, 1976, 1960, 2018");
    }

}