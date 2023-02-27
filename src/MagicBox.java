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

    public T pick() throws RuntimeException {
        for (T item : items) {
            if (item == null) {
                nullNumber++;
            }
        }
            for (T item1 : items) {
                if (item1 == null) {
                    throw new RuntimeException("Коробка не полна. Осталось заполнить ячеек: " + nullNumber);
                }
            }
            Random random = new Random();
            int randomInt = random.nextInt(items.length);
            return items[randomInt];
        }
    }

