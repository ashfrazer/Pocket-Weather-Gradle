public class WeatherData {
    private String location;
    private String temperature;
    private String condition;
    private String feel;
    private String high;
    private String low;
    private String time;
    private String date;
    private String[] hourly_time;
    private String[] hourly_temp;
    private String[] hourly_condition;

    public WeatherData(String location, String temperature, String condition, String feel, String high, String low, String time
    , String date, String[] hourly_time, String[] hourly_temp, String[] hourly_condition) {
        this.location = location;
        this.temperature = temperature;
        this.condition = condition;
        this.feel = feel;
        this.high = high;
        this.low = low;
        this.time = time;
        this.date = date;
        this.hourly_time = hourly_time;
        this.hourly_temp = hourly_temp;
        this.hourly_condition = hourly_condition;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getLocation() {
        return location;
    }
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
    public String getTemperature() {
        return temperature;
    }
    public void setCondition(String condition) {
        // Shorten text
        if (condition.equals("Showers in the Vicinity")) {
            condition = "Rain Coming";
        }
        this.condition = condition;
    }
    public String getCondition() {
        return condition;
    }
    public void setFeel(String feel) { this.feel = feel; }
    public String getFeel() { return feel; }
    public void setHigh(String high) {
        this.high = high;
    }
    public String getHigh() {
        return high;
    }
    public void setLow(String low) {
        this.low = low;
    }
    public String getLow() {
        return low;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getTime() {
        return time;
    }
    public void setDate(String date) { this.date = date; }
    public String getDate() { return date; }
    public void setHourly_time(String[] hourly_time) { this.hourly_time = hourly_time; }
    public String[] getHourly_time() { return hourly_time; }
    public void setHourly_temp(String[] hourly_temp) { this.hourly_temp = hourly_temp; }
    public String[] getHourly_temp() { return hourly_temp; }
    public void setHourly_condition(String[] hourly_condition) { this.hourly_condition = hourly_condition; }
    public String[] getHourly_condition() { return hourly_condition; }

    @Override
    public String toString() {
        return String.format("""
                Location: %s
                Temperature: %s
                Condition: %s
                High: %s
                Low: %s
                Time: %s
                """,
                location, temperature, condition, high, low, time);
    }
}
