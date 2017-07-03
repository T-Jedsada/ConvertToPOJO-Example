import com.google.gson.annotations.SerializedName;

public class TestDao {
    @SerializedName("name")
    private String name;
    @SerializedName("age")
    private int age;
    @SerializedName("cars")
    private CarInfoDao cars;
    @SerializedName("oop")
    private OOPDao oopDao;

    @Override
    public String toString() {
        return "TestDao{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                ", oopDao=" + oopDao +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestDao testDao = (TestDao) o;

        if (age != testDao.age) return false;
        if (name != null ? !name.equals(testDao.name) : testDao.name != null) return false;
        if (cars != null ? !cars.equals(testDao.cars) : testDao.cars != null) return false;
        return oopDao != null ? oopDao.equals(testDao.oopDao) : testDao.oopDao == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (cars != null ? cars.hashCode() : 0);
        result = 31 * result + (oopDao != null ? oopDao.hashCode() : 0);
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public CarInfoDao getCars() {
        return cars;
    }

    public void setCars(CarInfoDao cars) {
        this.cars = cars;
    }

    public OOPDao getOopDao() {
        return oopDao;
    }

    public void setOopDao(OOPDao oopDao) {
        this.oopDao = oopDao;
    }
}
