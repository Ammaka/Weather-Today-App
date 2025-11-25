package WeatherToday.Server;

import WeatherToday.WeatherReport.WholeReport;
//tells it how to map the DTO object

public class DTOMapper {

    //this is a factory method named from
    // it takes a whole report object and returns a WeatherTodayDTO object
    public static WeatherTodayDTO from(WholeReport wholeReport) {

        // Weather array always has at least 1 element
        String weatherMain = wholeReport.getWeather().getFirst().getMain();
        String weatherDescription = wholeReport.getWeather().getFirst().getDescription();

        return new WeatherTodayDTO(
                wholeReport.getName(),                 // city
                wholeReport.getSys().getCountry(),     // ISO country
                wholeReport.getCoord().getLon(),       // longitude
                wholeReport.getCoord().getLat(),       // latitude
                wholeReport.getMain().getTemp(),       // temperature
                wholeReport.getMain().getFeels_like(), // feels like
                wholeReport.getMain().getHumidity(),// humidity
                wholeReport.getSys().getSunrise(),
                wholeReport.getSys().getSunset(),
                weatherMain,                           // weather main
                weatherDescription// weather description

        );
    }
}


