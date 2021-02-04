package day12.task5;

public class MusicArtist {
    private String nameArtists;
    private int ageArtists;

    public MusicArtist(String nameArtists, int ageArtists) {
        this.nameArtists = nameArtists;
        this.ageArtists = ageArtists;
    }

    public String getNameArtists() {
        return nameArtists;
    }

    public int getAgeArtists() {
        return ageArtists;
    }

    @Override
    public String toString() {
        return "MusicArtists{" +
                "nameArtists='" + nameArtists + '\'' +
                ", ageArtists=" + ageArtists +
                '}';
    }
}
