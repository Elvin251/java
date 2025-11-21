package az.developia.demo2.Lesson54;


public class MusicEntity {
    private Long id;
    private String name;
    private String artist;
    private Integer duration;
    private String musicType;

    public MusicEntity() {
    }

    public MusicEntity(Long id, String name, String artist, Integer duration, String musicType) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.duration = duration;
        this.musicType = musicType;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getArtist() { return artist; }
    public void setArtist(String artist) { this.artist = artist; }

    public Integer getDuration() { return duration; }
    public void setDuration(Integer duration) { this.duration = duration; }

    public String getMusicType() { return musicType; }
    public void setMusicType(String musicType) { this.musicType = musicType; }
}
