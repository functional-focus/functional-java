package exceptions;

import java.util.List;

import static exceptions.AirportNames.getNamesOfAirports;

/*
A good strategy to deal with errors and exceptions in functional
programming is to treat an error as a form of data, move it down the
pipeline, and deal with it downstream.

Treat errors and exceptions as forms of data. Wrap the details
in an object and move it downstream.

But the abstract
method get of that interface doesn’t permit any exceptions. Instead, the
good old Callable<T> interface in java.util.concurrent will work great here
—other than method names, the main difference between Callable and
Supplier is that the former will permit exceptions to be thrown from its
call method implementation whereas the latter won’t allow any such
thing from its get method implementation.

In short, we need a Union Type.[16]
A Union Type is a data structure that can hold one of many different
types of data, but an instance of it can hold data of only one of the
expected types at runtime. In our case, we need objects of a Union Type
that hold only one of two types: either the result or an error.

 */
public class Test {
    public static void main(String[] args) {
        var iataCodes = List.of("AUS", "DFW", "HOU", "IHA", "SAT");

//    getNamesOfAirports(iataCodes).stream().map(name -> switch(name) {
//        case Success(String result) -> result;
//        case Failure(Throwable throwable) -> "Error: " + throwable.getMessage();})
//            .forEach((System.out::println));
//    }
    }
}

