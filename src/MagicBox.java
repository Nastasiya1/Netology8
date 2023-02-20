import java.util.Arrays;
import java.util.Random;

public class MagicBox<T> {
    protected T[] items;

    public MagicBox(T[] items) {
        this.items = items;
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    int nullNumber = 0;

    public T pick() {
        for (T item : items) {
            if (item == null) {
                nullNumber++;
            }
        }
        if (!Arrays.asList(items).contains(null)) {
            Random random = new Random();
            int randomInt = random.nextInt(items.length);
            return items[randomInt];
        }
        String str = "Коробка не полна. Осталось заполнить ячеек: " + nullNumber;
        T result = (T) str;
        return result;
    }
}

