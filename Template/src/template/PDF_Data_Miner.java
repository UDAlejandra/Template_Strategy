package template;

class PDF_Data_Miner extends Data_Miner {
    @Override
    public Object openFile(String path) {
        System.out.println("Abriendo PDF en: " + path);
        return "Archivo_PDF_Handle";
    }

    @Override
    public Object extractData(Object file) {
        System.out.println("Extrayendo texto de PDF con OCR...");
        return "Contenido_PDF_Crudo";
    }

    @Override
    public Object parseData(Object rawData) {
        System.out.println("Parseando estructura de páginas PDF...");
        return "Datos_PDF_Estructurados";
    }

    @Override
    public void closeFile(Object file) {
        System.out.println("Cerrando archivo PDF.");
    }
}
