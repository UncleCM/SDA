import java.util.Iterator;
import java.util.NoSuchElementException;

public class DinerMenuIterator implements Iterator<MenuItem> {
    private MenuItem[] items;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        while (position < items.length) {
            if (items[position] != null) {
                return true;
            }
            position++;
        }
        return false;
    }

    @Override
    public MenuItem next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        MenuItem item = items[position];
        position++;
        return item;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
