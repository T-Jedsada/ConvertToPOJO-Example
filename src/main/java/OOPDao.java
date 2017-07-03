import com.google.gson.annotations.SerializedName;
import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.ArrayList;
import java.util.List;

public class OOPDao {

    @SerializedName("name")
    private String name;
    @SerializedName("names")
    private ArrayList<String> listName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getListName() {
        return listName;
    }

    public void setListName(ArrayList<String> listName) {
        this.listName = listName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OOPDao oopDao = (OOPDao) o;

        if (name != null ? !name.equals(oopDao.name) : oopDao.name != null) return false;
        return listName != null ? listName.equals(oopDao.listName) : oopDao.listName == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (listName != null ? listName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "OOPDao{" +
                "name='" + name + '\'' +
                ", listName=" + listName +
                '}';
    }
}