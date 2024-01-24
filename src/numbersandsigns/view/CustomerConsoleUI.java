package view;

import org.fusesource.jansi.Ansi;

public class CustomerConsoleUI {

    public CustomerConsoleUI() {

    }

    public static void printTitle(String text)
    {
        System.out.println(Ansi.ansi()
                .fgDefault()
                .bg(Ansi.Color.BLUE)
                        .fg(Ansi.Color.MAGENTA)
                .a(Ansi.Attribute.INTENSITY_BOLD)
                .a("__ " + text + " __")
                .reset());
    }

    public static void printLine(Character fillChar, int length )
    {
        String text = String.valueOf(fillChar).repeat(length);

        System.out.println(Ansi.ansi()
                        .fgDefault()
                        .bg(Ansi.Color.BLUE)
                        .fg(Ansi.Color.MAGENTA)
                        .a(Ansi.Attribute.INTENSITY_BOLD)
                        .a(text)
                        .reset());
    }



}
