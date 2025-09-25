package Lab05.Memento;

import javax.swing.table.DefaultTableModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ScheduleTableModel extends DefaultTableModel {

    public ScheduleTableModel(Object[][] data, Object[] columnNames) {
        super(data, columnNames);
    }

    public TableMemento createMemento() {
        return new TableMemento(columnIdentifiers, getDataVector());
    }

    public void setMemento(TableMemento memento) {
        if (memento == null) {
            return;
        }
        Vector<?> restoredColumns = memento.getColumnIdentifiers();
        @SuppressWarnings("unchecked")
        Vector<Vector<?>> restoredData = (Vector<Vector<?>>) (Vector<?>) memento.getDataVector();
        // Replace the model's data entirely
        setDataVector(restoredData, restoredColumns);
    }

    // Inner static memento class
    public static class TableMemento implements Serializable {
        private final List<Object> columnIdentifiersList;
        private final List<List<Object>> dataList;

        TableMemento(Vector<?> columnIdentifiers, Vector<?> dataVector) {
            this.columnIdentifiersList = new ArrayList<>();
            for (Object ci : columnIdentifiers) {
                this.columnIdentifiersList.add(ci);
            }

            this.dataList = new ArrayList<>();
            for (Object rowObj : dataVector) {
                @SuppressWarnings("unchecked")
                Vector<Object> rowVector = (Vector<Object>) rowObj;
                List<Object> rowCopy = new ArrayList<>(rowVector);
                this.dataList.add(rowCopy);
            }
        }

        Vector<Object> getColumnIdentifiers() {
            return new Vector<>(columnIdentifiersList);
        }

        Vector<Vector<Object>> getDataVector() {
            Vector<Vector<Object>> deepCopy = new Vector<>();
            for (List<Object> row : dataList) {
                deepCopy.add(new Vector<>(row));
            }
            return deepCopy;
        }

        @Override
        public String toString() {
            return "[ci=" + columnIdentifiersList + "\n" +
                    "dl=" + dataList + "]";
        }
    }
}


