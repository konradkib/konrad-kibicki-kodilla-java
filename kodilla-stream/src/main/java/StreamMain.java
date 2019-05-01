import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;

public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("ALA MA KOTA",text -> text.toLowerCase());
        poemBeautifier.beautify("ALA MA KOTA",text -> text.concat(" I JEST MILUSI"));
        poemBeautifier.beautify("       MA      ",text -> text.trim());
        poemBeautifier.beautify("ala ma kota",text -> text.toUpperCase());
        poemBeautifier.beautify("ala ma kota",text -> "-----> "+text+" <-----");



    }
}
