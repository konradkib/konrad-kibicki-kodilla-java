import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
        public static void main(String[] args) {

                PoemBeautifier poemBeautifier = new PoemBeautifier();
                poemBeautifier.beautify("sample text",text ->text.toUpperCase());
                poemBeautifier.beautify("text",text ->"ABC"+text+"ABC");
                poemBeautifier.beautify("            sample      ",text ->text.trim());
                poemBeautifier.beautify("SUNNY DAY",text ->text.toLowerCase());


}}
