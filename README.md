## Welcome to Pocket Weather (with Gradle)!
(Submission for **CSCI-3355: Software Design and Construction**)

This project was created with the goal of exploring **Gradle** and **web scraping**, two areas I've been interested in for some time.
To achieve this goal, I explored various libraries and ultimately decided to learn [jsoup](https://jsoup.org/)-- a Java library that parses HTML pages.

Pocket Weather generates a small, sleek window that contains basic weather information regarding a location of your choice. This information is scraped
from https://weather.com/.

I created a dozen icons that correspond with the current weather condition of your specified location.

Note that there are some new additions to this application from the last project with Maven.

<p align="center">
  <img src="https://raw.githubusercontent.com/ashfrazer/Pocket-Weather/master/src/main/resources/imgs/lightning.png" alt="Lightning" />
</p>

## How to Run Pocket Weather
Once you clone this repository, there are a few different options to run Pocket Weather.

If you want to run the JAR file, open your terminal and navigate to the project. Then, enter the command `java -jar build/libs/PocketWeather-1.0-SNAPSHOT.jar`.

Another option is to open your IDE and enter `gradlew run` into the terminal. 

If you do not have Maven installed, navigate to the *WeatherApp* class and run the program. This class is the executable portion of the program. Once you run 
*WeatherApp*, the user interface should generate. 

Proceed to enter in a zip code of your choice, and then enjoy the results!

## How to Test Pocket Weather (Gradle)
The class **WeatherScraperTest** is a test class that ensures that any potential errors found in scraping weather data are caught. To run the test, navigate to the project's directory in your terminal and enter `gradlew clean test`. This will execute **WeatherScraperTest**.
