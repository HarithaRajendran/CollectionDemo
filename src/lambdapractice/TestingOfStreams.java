package lambdapractice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestingOfStreams {
	public static void main(String[] args) throws IOException {
		
		List<String> band = Files.lines(Paths.get("test.txt"))
				.filter(p -> p.contains("pq"))
				.map(m -> m + "llll").collect(Collectors.toList());
		band.forEach(System.out::println);;
	}
}
