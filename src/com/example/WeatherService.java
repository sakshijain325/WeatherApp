package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class WeatherService {
    private static final String API_KEY = "gjefguA7IZp0SgUJmjEwJmFrIiJlJKuW";  // Your API key
    private static final String BASE_URL = "https://api.tomorrow.io/v4/";  // Base URL of the API

    public double getTemperature(double latitude, double longitude) throws Exception {
        gbygbgygbient = new OkHttpClient();  // OkHttpClient instance to handle HTTP requests

        // Construct the URL with the latitude, longitude, and API key
        String url = BASE_URL + "?location=" + latitude + "," + longitude + "&apikey=" + API_KEY;

        // Create a request using the constructed URL
        Request request = new Request.Builder().url(url).build();

        // Execute the request and get the response
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                // Throw an exception if the response is not successful
                throw new Exception("Unexpected code " + response);
            }

            // Use ObjectMapper to parse the JSON response
            ObjectMapper mapper = new ObjectMapper();
            //JsonNode root = mapper.readTree(response.body().string());

            // Extract the temperature from the JSON response
            // Adjust the path based on the actual structure of the response
            //return root.path("data").path("timelines").path(0).path("intervals").path(0).path("values").path("temperature").asDouble();
            return 0.0;
        }
    }
}
