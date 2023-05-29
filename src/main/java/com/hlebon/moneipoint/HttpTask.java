//
package com.hlebon.moneipoint;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class HttpTask {

  public static final String TEMPLATE = "https://jsonmock.hackerrank.com/api/inventory?barcode=%s";

  public static int getDiscountedPrice(int barcode) {
    try {
      String response = doRequest(barcode);
      return (int) parse(response);
    } catch (Exception e) {
      // do nothing
    }
    return -1;
  }

  private static String doRequest(int barcode) throws IOException {
    String url = String.format(TEMPLATE, barcode);

    HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
    connection.setRequestMethod("GET");

    BufferedReader reader =
        new BufferedReader(new InputStreamReader(connection.getInputStream()));
    String line;
    StringBuilder response = new StringBuilder();

    while ((line = reader.readLine()) != null) {
      response.append(line);
    }

    reader.close();
    connection.disconnect();
    return response.toString();
  }

  private static long parse(String jsonString) throws ParseException {
      JSONParser parser = new JSONParser();
      JSONObject jsonObject = (JSONObject) parser.parse(jsonString);
      long total = (long) jsonObject.get("total");
      if (total == 0) {
        return -1;
      }
      JSONArray dataArray = (JSONArray) jsonObject.get("data");
      JSONObject data = (JSONObject) dataArray.get(0);

      double discount = (long) data.get("discount");
      double price = (long) data.get("price");

      return Math.round(price - (discount * price / 100.0));
  }
}
