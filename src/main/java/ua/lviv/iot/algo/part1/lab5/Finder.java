package ua.lviv.iot.algo.part1.lab5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Finder {

    public String findImagesFiles(final String text, final String searchWord) {
        Pattern pattern = Pattern.compile(searchWord
                + ".*?(\\.png|\\.jpeg|\\.jpg|\\.gif)");
        Matcher matcher = pattern.matcher(text);
        StringBuilder foundedFiles = new StringBuilder();

        while (matcher.find()) {
            foundedFiles.append(matcher.group()).append("\n");
        }

        if (foundedFiles.length() > 0) {
            return foundedFiles.toString();
        } else {
            return null;
        }
    }
}
