package WeatherToday.WeatherReport;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Sys {
    private String country;
    private int sunrise;
    private int sunset;

    DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
    ZoneId zone = ZoneId.systemDefault();

    public void setSunset(int sunset) {
        this.sunset = sunset;
    }

    public String getSunset() {
        return "the sun sets at: "+Instant.ofEpochSecond(sunset).atZone(zone).format(format);
    }

    public void setSunrise(int sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunrise() {
        return "the sun rises at: "+Instant.ofEpochSecond(sunrise).atZone(zone).format(format);
    }



    public String getCountry() {
        return "Country: "+country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


}
