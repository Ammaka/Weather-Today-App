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

    public int getSunset() {
        return sunset;
    }

    public void setSunset(int sunset) {
        this.sunset = sunset;
    }

    public int getSunrise() {
        return sunrise;
    }

    public void setSunrise(int sunrise) {
        this.sunrise = sunrise;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String printCountry() {
        return "Country:" +country;
    }
    public String to_String() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
        ZoneId zone = ZoneId.systemDefault();
        String sunRise= Instant.ofEpochSecond(sunrise).atZone(zone).format(format);
        String sunSet= Instant.ofEpochSecond(sunset).atZone(zone).format(format);

        return "Sun rises at :" +sunRise+" and sets at:"+sunSet;
    }

}
