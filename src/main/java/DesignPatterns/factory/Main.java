package DesignPatterns.factory;

public class Main {
    public static void main(String[] args) {

        String file = FileExporterFactory.getInstance(FileExporterFactory.FileType.PDF)
                .export("Test content");
        System.out.println(file);
    }
}
