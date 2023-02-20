public class MagicBox<T> {
    protected int[] amount;
    protected T item;

    public <T> MagicBox(amount) {
        this.amount = amount;
    }

    T[] items = (T[]) new Object[amount.length];

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = T item;
                return true;
            } else {
                return false;
            }
        }

    }
}
