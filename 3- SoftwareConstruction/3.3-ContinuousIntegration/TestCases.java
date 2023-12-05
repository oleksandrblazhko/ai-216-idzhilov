import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TestCases {
    public static void main(String[] args) {
        // Example test data
        Map<String, Integer> preferences1 = Map.of("Pop", 4, "Rock", 5, "EDM", 3);
        List<AvailableSong> availableSongs1 = List.of(
                new AvailableSong("Song1", "Artist1", "Pop"),
                new AvailableSong("Song2", "Artist2", "Rock"),
                new AvailableSong("Song3", "Artist3", "EDM")
        );

        UserPreference userPreference1 = new UserPreference(preferences1);

        // Test case 1.1
        List<AvailableSong> selectedSongs1 = selectSong(userPreference1, availableSongs1);
        System.out.println("TC 1.1 (User selected songs based on preferences): " + selectedSongs1);

        // Test case 1.2
        UserPreference emptyUserPreference = new UserPreference(Map.of());
        List<AvailableSong> selectedSongs2 = selectSong(emptyUserPreference, availableSongs1);
        System.out.println("TC 1.2 (User with empty preferences): " + selectedSongs2);

        // Test case 1.3
        List<AvailableSong> emptyAvailableSongs = List.of();
        List<AvailableSong> selectedSongs3 = selectSong(userPreference1, emptyAvailableSongs);
        System.out.println("TC 1.3 (No available songs): " + selectedSongs3);
    }

    public static List<AvailableSong> selectSong(UserPreference userPreference, List<AvailableSong> availableSongs) {
        List<AvailableSong> selectedSongs = new ArrayList<>();

        if (userPreference.isEmpty() || availableSongs.isEmpty()) {
            System.out.println("Invalid - Empty result");
            return selectedSongs;
        }

        // Add your logic for selecting songs based on user preferences and available songs here
        // For example, just add all available songs for demonstration purposes
        selectedSongs.addAll(availableSongs);

        System.out.println("Correct - Dictionary with information about the selected song");
        return selectedSongs;
    }
}

class AvailableSong {
    private String title;
    private String artist;
    private String genre;

    public AvailableSong(String title, String artist, String genre) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }

    // Add any other methods or fields as needed
}

class UserPreference {
    private Map<String, Integer> preferences;

    public UserPreference(Map<String, Integer> preferences) {
        this.preferences = preferences;
    }

    // Add any other methods or fields as needed

    public boolean isEmpty() {
        return preferences.isEmpty();
    }
}
