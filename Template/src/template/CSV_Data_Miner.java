package template;

class CSV_Data_Miner extends Data_Miner {
    @Override
    public Object openFile(String path) {
        System.out.println("Abriendo CSV en: " + path);
        return "Archivo_CSV_Handle";
    }

    @Override
    public Object extractData(Object file) {
        System.out.println("Extrayendo filas del CSV...");
        return "Contenido_CSV_Crudo";
    }

    @Override
    public Object parseData(Object rawData) {
        System.out.println("Parseando comas y columnas...");
        return "Lista_de_Datos_CSV";
    }

    @Override
    public void closeFile(Object file) {
        System.out.println("Cerrando archivo CSV.");
    }
}