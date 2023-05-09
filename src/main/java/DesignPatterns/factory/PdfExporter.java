package DesignPatterns.factory;

class PdfExporter implements FileExporter{
    @Override
    public String export(String content) {
        return "Pdf ->" + content;
    }
}
