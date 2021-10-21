package extras;

public class Location {
    String city;
    String state;
    int zip_code;
    public float lon;
    public float lat;

    public Location(String city, String state, int zip_code, float lon, float lat) {
        this.city = city;
        this.state = state;
        this.zip_code = zip_code;
        this.lon = lon;
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "Location{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip_code=" + zip_code +
                ", lon=" + lon +
                ", lat=" + lat +
                '}';
    }
}
