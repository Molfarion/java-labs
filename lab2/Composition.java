public class Composition {
    private String title;
    private int duration; // in seconds
    private String genre;

    public Composition(String title, int duration, String genre) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return String.format("Composition: %s, Duration: %d seconds, Genre: %s", title, duration, genre);
    }

    public static Composition createComposition(String type, String title, int duration, String genre, String extra) {
        if (duration <= 0) {
            throw new IllegalArgumentException("Duration must be greater than zero.");
        }

        switch (type.toLowerCase()) {
            case "instrumental":
                return new Instrumental(title, duration, genre, extra);
            case "vocal":
                return new Vocal(title, duration, genre, extra);
            case "electronic":
                return new Electronic(title, duration, genre, extra);
            default:
                throw new IllegalArgumentException("Unknown composition type: " + type);
        }
    }
}

class Vocal extends Composition {
    private String lyrics;

    public Vocal (String title, int duration, String genre, String lyrics) {
        super(title, duration, genre);
        this.lyrics = lyrics;
    }

    @Override
    public String toString() {
        return String.format("Vocal: %s, Duration: %d seconds, Genre: %s, Lyrics: %s", getTitle(), getDuration(), getGenre(), lyrics);
    }
}

class Instrumental extends Composition {
    private String instrument;

    public Instrumental (String title, int duration, String genre, String instrument) {
        super(title, duration, genre);
        this.instrument = instrument;
    }

    @Override
    public String toString() {
        return String.format("Instrumental: %s, Duration: %d seconds, Genre: %s, Instrument: %s", getTitle(), getDuration(), getGenre(), instrument);
    }
}

class Electronic extends Composition {
    private String artist;

    public Electronic (String title, int duration, String genre, String artist) {
        super(title, duration, genre);
        this.artist = artist;
    }

    @Override
    public String toString() {
        return String.format("Electronic: %s, Duration: %d seconds, Genre: %s, Produced by: %s", getTitle(), getDuration(), getGenre(), artist);
    }
}
