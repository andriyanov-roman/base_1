package home_task7.Goverment;


public class City extends District {
    public String nameCity;

    public City(String nameGoverment, String nameArea, String nameDistrict,String nameCity) {
        super(nameGoverment, nameArea, nameDistrict);
        this.nameCity = nameCity;
    }
}
