package exceptions;

import java.util.Scanner;
import java.net.URL;
import java.io.IOException;

public class AirportInfo {
    public static String getNameOfAirport(String iata)
            throws IOException, AirportInfoException {

        var url = "https://soa.smext.faa.gov/asws/api/airport/status/" + iata;

        try(var scanner = new Scanner(new URL(url).openStream())) {
            var response = scanner.nextLine();

            if(!response.contains("Name")) {
                throw new AirportInfoException("Invalid airport code " + iata);
            }

            return response.split("\"")[3]; //a bruteforce way to get the Name
        }
    }
}
