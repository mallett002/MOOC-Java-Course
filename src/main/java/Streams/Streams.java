package Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
Stream Pipeline---------------------------------------------------------------------------------------------------------

*** Source ***
 - Created from Collections, Lists, Sets, ints, longs, doubles, arrays, lines of a file

*** 0 or more Intermediate operations ***
 - filter(), map(), sort(), anyMatch(), distinct(), findFirst(), flatMap(), map(), skip(), sorted()

*** Terminal Operation ***
 - Either void or return a non-stream result
 - forEach(), collect(), reduce()
 - forEach(): applies the same function to each element
 - collect(): saves the elements into a colleciton
 - other options: reduce stream to a single summary element
    - count(), max(), min(), reduce(), summaryStatistics(), ifPresent()
*/


public class Streams {
    public static void main(String[] args) throws IOException {
        // 1. Integer Stream--------------------------------------------------------------------------------------------
        IntStream
            .range(1, 10) // Source: range of #s from 1 - 9
            .forEach(System.out::print); // Terminal: print each item
        System.out.println();

        // 2. Integer Stream with skip----------------------------------------------------------------------------------
        IntStream
            .range(1, 10)
            .skip(5) // skip first 5 elements
            .forEach(x -> System.out.println(x)); // print each on own line
        System.out.println();

        // 3. Integer Stream with sum-----------------------------------------------------------------------------------
        System.out.println(
            IntStream
                .range(1, 5)
                .sum()
        );
        System.out.println();

        // 4. Stream.of sorted and findFirst----------------------------------------------------------------------------
        // Stream.of can stream many different things such as strings, ints and objects
        Stream.of("Will", "Marcela", "Johnny")
            .sorted() // will sort alphabetically
            .findFirst()
            .ifPresent(System.out::println);

        // 5. Stream from Array, sort, filter and print-----------------------------------------------------------------
        String[] names = {"Tony", "Al", "Susan", "Jerry", "Sam", "Will", "Sally"};
        Arrays.stream(names) // same as Stream.of(names)
            .filter(x -> x.startsWith("S"))
            .sorted()
            .forEach(System.out::println);

        // 6. Average of squares of an int array------------------------------------------------------------------------
        Arrays.stream(new int[] {2, 4, 6, 8, 10})
            .map(x -> x * x)
            .average()
            .ifPresent(System.out::println);

        // 7. Stream from List, filter and print------------------------------------------------------------------------
        List<String> people = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "amanda", "Hans", "Shivra");
        people
            .stream()
            .map(String::toLowerCase)
            .filter(x -> x.startsWith("a"))
            .forEach(System.out::println);

        // 8. Stream rows from text file, sort, filter, and print-------------------------------------------------------
        // Have bands.txt which has a list of bands, each on own line
        // Get the stream obj of lines from the path:
        String bandsPath = "C:\\bench\\MOOC\\src\\main\\java\\Streams\\bands.txt";
        Stream<String> bands = Files.lines(Paths.get(bandsPath)); // get the Stream obj

        bands.sorted()
            .filter(band -> band.length() > 13)
            .forEach(System.out::println);
        bands.close(); // Close to prevent memory leak

        // 9. Stream rows from text file and save to List---------------------------------------------------------------
        List<String> bands2 = Files.lines(Paths.get(bandsPath))
            .filter(band -> band.contains("jit"))
            .collect(Collectors.toList()); // Collect it to a list

        bands2.forEach(band -> System.out.println(band));

        // 10. Stream rows from CSV file and count----------------------------------------------------------------------
        String dataPath = "C:\\bench\\MOOC\\src\\main\\java\\Streams\\data.txt";
        Stream<String> rows1 = Files.lines(Paths.get(dataPath));

        int rowCount = (int) rows1
            .map(row -> row.split(",")) // turn it into an array separated by commas
            .filter(row -> row.length == 3) // get rid of ones that don't have 3 items
            .count(); // reduce it to an int at the end (count how many)

        System.out.println(rowCount + " rows.");
        rows1.close();

        // 11. Stream rows from CSV file, parse data from rows----------------------------------------------------------
        Stream<String> rows2 = Files.lines(Paths.get(dataPath)); // Get the Stream obj
        rows2.map(item -> item.split(","))
            .filter(item -> item.length == 3)
            .filter(item -> Integer.parseInt(item[1]) > 15) // keep ones that have second item > 15
            .forEach(item -> System.out.println(item[0] + " " + item[1] + " " + item[2]));
        rows2.close();

        // 12. Stream rows from CSV file, store fields in HashMap-------------------------------------------------------
        Stream<String> rows3 = Files.lines(Paths.get(dataPath));
        Map<String, Integer> map = new HashMap<>();

        map = rows3
                .map(row -> row.split(","))
                .filter(row -> row.length == 3)
                .filter(row -> Integer.parseInt(row[1]) > 15)
                .collect(Collectors.toMap( // Collect it to a map
                        row -> row[0], // String
                        row -> Integer.parseInt(row[1]) // Integer
                ));

        rows3.close();

        for (String key : map.keySet()) { // loop over keys of the map
            System.out.println(key + " " + map.get(key));
        }

        // 13. Reduction sum--------------------------------------------------------------------------------------------
        double total = Stream.of(7.3, 1.5, 4.8)
                .reduce(0.0, (Double a, Double b) -> a + b); // 0.0 is start val, a is total, b is next element

        System.out.println("Total: " + total);

        // 14. Reduction summary statistics (Only works for Integers)---------------------------------------------------
        IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10)
                .summaryStatistics(); // Terminal operation

        System.out.println(summary);
        // -> IntSummaryStatistics{count=7, sum=203, min=2, average=29.000000, max=88}
    }
}
