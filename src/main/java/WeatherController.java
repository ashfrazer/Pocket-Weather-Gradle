public class WeatherController {
    private WeatherScraper weatherScraper;
    private WeatherApp weatherApp;

    public WeatherController(WeatherScraper weatherScraper, WeatherApp weatherApp) {
        this.weatherScraper = weatherScraper;
        this.weatherApp = weatherApp;
    }

    public void getWeather(String zipcode) throws WeatherScraperException {
        // Create weatherData object that contains scraped data
        WeatherData weatherData = weatherScraper.scrapeData(zipcode);

        // Call update GUI method
        weatherApp.updateWeatherUI(weatherData);
    }
}
