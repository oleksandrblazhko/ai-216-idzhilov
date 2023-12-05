import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) 
        selectedSongs1 = selectSong(userPreference1, availableSongs1);

    public static List<AvailableSong> selectSong(UserPreference userPreference, List<AvailableSong> availableSongs)
        // Створюємо новий список для вибраних пісень
        List<AvailableSong> selectedSongs = new ArrayList<>();

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
