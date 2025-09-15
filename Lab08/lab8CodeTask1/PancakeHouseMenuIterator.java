import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class PancakeHouseMenuIterator implements Iterator<MenuItem> {
    private List<MenuItem> items;
    private int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public MenuItem next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        MenuItem item = items.get(position);
        position++;
        return item;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
