package com.kurs.stream.kursstream.beautifier;

public class PoemBeautifier {

    public void beaufify(String text, PoemDecorator decorator) {
        System.out.println(decorator.decorate(text));
    }


}
