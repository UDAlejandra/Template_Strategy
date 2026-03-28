package template;

class Doc_Data_Miner extends Data_Miner {
    @Override
    public Object openFile(String path) {
        System.out.println("Abriendo archivo DOC en: " + path);
        return "Archivo_DOC_Handle";
    }

    @Override
    public Object extractData(Object file) {
        System.out.println("Extrayendo texto de Word (DOC)...");
        return "Contenido_DOC_Crudo";
    }

    @Override
    public Object parseData(Object rawData) {
        System.out.println("Parseando párrafos y fuentes de Word...");
        return "Lista_de_Datos_DOC";
    }

    @Override
    public void closeFile(Object file) {
        System.out.println("Cerrando archivo DOC.");
    }
}
