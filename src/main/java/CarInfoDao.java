import com.google.gson.annotations.SerializedName;

class CarInfoDao {
    @SerializedName("car1")
    private String carOne;
    @SerializedName("car2")
    private String carTwo;
    @SerializedName("car3")
    private String carThree;

    public String getCarOne() {
        return carOne;
    }

    public void setCarOne(String carOne) {
        this.carOne = carOne;
    }

    public String getCarTwo() {
        return carTwo;
    }

    public void setCarTwo(String carTwo) {
        this.carTwo = carTwo;
    }

    public String getCarThree() {
        return carThree;
    }

    public void setCarThree(String carThree) {
        this.carThree = carThree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarInfoDao that = (CarInfoDao) o;

        if (carOne != null ? !carOne.equals(that.carOne) : that.carOne != null) return false;
        if (carTwo != null ? !carTwo.equals(that.carTwo) : that.carTwo != null) return false;
        return carThree != null ? carThree.equals(that.carThree) : that.carThree == null;
    }

    @Override
    public int hashCode() {
        int result = carOne != null ? carOne.hashCode() : 0;
        result = 31 * result + (carTwo != null ? carTwo.hashCode() : 0);
        result = 31 * result + (carThree != null ? carThree.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CarInfoDao{" +
                "carOne='" + carOne + '\'' +
                ", carTwo='" + carTwo + '\'' +
                ", carThree='" + carThree + '\'' +
                '}';
    }
}