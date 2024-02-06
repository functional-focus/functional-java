package exceptions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirportNames {
    public static List<DataOrException<String>> getNamesOfAirports(
            List<String> iataCodes) {

        List<DataOrException<String>> result = new ArrayList<>();

        for(var iataCode: iataCodes) {
            try {
                result.add(DataOrException.of(
                        AirportInfo.getNameOfAirport(iataCode).toUpperCase()));
            } catch(IOException | AirportInfoException ex) {
                result.add(DataOrException.of(ex));
            }
        }

        return result;
    }
}
