package ua.lviv.iot.algo.part1.lab5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinderTest {

    @Test
    void testFindImagesFiles() {
        String text = "fefefe yy summer2022.png 7k7k summer2022.gif";
        String searchWord = "summer2022";

        Finder finder = new Finder();
        String result = finder.findImagesFiles(text, searchWord);

        Assertions.assertEquals("summer2022.png\nsummer2022.gif\n", result);

        searchWord = "bbb";
        result = finder.findImagesFiles(text, searchWord);

        Assertions.assertNull(result);
    }
}
