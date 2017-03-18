package Func;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by katie on 24/03/2017.
 */
public class Keyword_Search {

    private static File file;
    private static String name;
    private static boolean found = false;
    private static List<String > messages = new ArrayList<String>();

    private Keyword_Search(){}

    public static String getName() { return name; }

    public static void setName(String name) { Keyword_Search.name = name; }

    public static File getFile() { return file; }

    public static void setFile(File file) { Keyword_Search.file = file; }

    public static List<String> getMessages() {
        return messages;
    }

    public static void setMessages(List<String> messages) {
        Keyword_Search.messages = messages;
    }

    public static void searcher(File file) {
            for (File each : file.listFiles()) {
                if (each.isDirectory()) {
//                System.out.println(each.getName() + " is a directory");
                    searcher(each);
                } else {
//                System.out.println(each.getName() + " is a file");
                    if (each.getName().matches("(.*)" + Keyword_Search.name + "(.*)")) {
                        messages.add(each.getAbsolutePath());
                    }
                }
            }
        }
}
