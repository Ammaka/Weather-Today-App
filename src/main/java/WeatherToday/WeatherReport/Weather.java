package WeatherToday.WeatherReport;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {
    private String main;
    private String description;

    public String getDescription() {
        return "Description: "+description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMain() {
        return "Current condition: "+main;
    }

    public void setMain(String main) {
        this.main = main;
    }

  public String to_String(){
        return "Current Condition: "+main+", Description: "+description;
  }
}
