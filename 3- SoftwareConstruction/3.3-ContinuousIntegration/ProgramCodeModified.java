import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProgramCode {
    public static void main(String[] args) {
        // Приклад тестових даних
        Map<String, Integer> preferences1 = Map.of("Pop", 4, "Rock", 5, "EDM", 3);
        List<AvailableSong> availableSongs1 = List.of(
                new AvailableSong("Song1", "Artist1", "Pop")
                new AvailableSong("Song2", "Artist2", "Rock")
                new AvailableSong("Song3", "Artist3", "EDM")
        );

        UserPreference userPreference1 = new UserPreference(preferences1);

        List<AvailableSong> selectedSongs1 = selectSong(userPreference1, availableSongs1);
        System.out.println("Результат для Тест кейс 1.1: " + selectedSongs1);
    }

    public static List<AvailableSong> selectSong(UserPreference userPreference, List<AvailableSong> availableSongs) {
        // Створюємо новий список для вибраних пісень
        List<AvailableSong> selectedSongs = new ArrayList<>();

        // Перевіряємо, чи користувач та доступні пісні не є порожніми
        if (userPreference.isEmpty() || availableSongs.isEmpty()) {
            // Виводимо повідомлення про помилку та повертаємо порожній список
            System.out.println("Неправильний - порожній результат");
            return selectedSongs;
        }

        // Додайте код для вибору пісні на основі вказаних уподобань користувача та наявних пісень
        // Ваша логіка тут...
        // Наприклад, просто додаємо всі пісні, які доступні
        selectedSongs.addAll(availableSongs);

        // Виводимо повідомлення про успішне виконання та повертаємо список вибраних пісень
        System.out.println("Правильний - Словник з інформацією про вибрану пісню");
        return selectedSongs;
    }

}
