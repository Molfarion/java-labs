import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Album album = createAlbum();
        displayTotalAlbumDuration(album);
        displaySortedAlbum(album);
        displayCompositionsByDuration(album, 230, 260);
    }

    private static Album createAlbum() {
        List<Composition> compositions = new ArrayList<>();
        compositions.add(Composition.createComposition("vocal", "Livin' la Vida Loca", 222, "pop", "She's into superstitions..."));
        compositions.add(Composition.createComposition("instrumental", "Interstellar: Main theme", 288, "classical ambient", "organ"));
        compositions.add(Composition.createComposition("electronic", "Nightcall", 257, "synth-pop electro synthwave", "Kavinsky"));
        compositions.add(Composition.createComposition("vocal", "Billie Jean", 294, "pop", "she was more like a beauty queen from a movie scene..."));
        compositions.add(Composition.createComposition("instrumental", "Clair de Lune", 300, "classical", "piano"));
        compositions.add(Composition.createComposition("electronic", "Strobe", 631, "electro", "Deadmau5"));
        return new Album(compositions);
    }

    private static void displayTotalAlbumDuration(Album album) {
        System.out.println("Total album duration: " + album.calculateTotalDuration() + " seconds\n");
    }

    private static void displaySortedAlbum(Album album) {
        album.sortCompositionsByGenre();
        System.out.println("Sorted by Genre:");
        album.printAlbum();
    }

    private static void displayCompositionsByDuration(Album album, int minDuration, int maxDuration) {
        List<Composition> foundCompositions = album.findCompositionsByDuration(minDuration, maxDuration);
        
        if (!foundCompositions.isEmpty()) {
            System.out.println("\nFound compositions within duration range:");
            for (Composition composition : foundCompositions) {
                System.out.println(composition.toString());
            }
        } else {
            System.out.println("No compositions found in the given duration range.");
        }
    }
}

class Album {
    private List<Composition> compositions;

    public Album(List<Composition> compositions) {
        this.compositions = compositions;
    }

    public void printAlbum() {
        for (Composition composition : compositions) {
            System.out.println(composition.toString());
        }
    }

    public int calculateTotalDuration() {
        int totalDuration = 0;
        for (Composition composition : compositions) {
            totalDuration += composition.getDuration();
        }
        return totalDuration;
    }

    public void sortCompositionsByGenre() {
        compositions.sort(Comparator.comparing(Composition::getGenre));
    }

    public List<Composition> findCompositionsByDuration(int minDuration, int maxDuration) {
        List<Composition> matchingCompositions = new ArrayList<>();
        for (Composition composition : compositions) {
            if (composition.getDuration() >= minDuration && composition.getDuration() <= maxDuration) {
                matchingCompositions.add(composition);
            }
        }
        return matchingCompositions;
    }
}
