import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Object extends Object_Component {
    private List<Object_Component> children = new ArrayList<>();

    public Object() {
    }

    @Override
    public void add(Object_Component component) {
        children.add(component);
    }

    @Override
    public void remove(Object_Component component) {
        children.remove(component);
    }

    @Override
    public Object_Component getChild(int i) {
        return children.get(i);
    }

    @Override
    public void render() {
        for (Object_Component child : children) {
            child.render();
        }
    }

    @Override
    public float volume() {
        float total = 0;
        for (Object_Component child : children) {
            total += child.volume();
        }
        return total;
    }

    @Override
    public Iterator createIterator() {
        return children.iterator();
    }
}
