package template;

abstract class Data_Miner {
    
    public final void mine(String path) {
        Object file = openFile(path);
        Object rawData = extractData(file);
        Object data = parseData(rawData);
        Object analysis = analyzeData(data);
        sendReport(analysis);
        closeFile(file);
    }
    
    public abstract Object openFile(String path);
    public abstract Object extractData(Object file);
    public abstract Object parseData(Object rawData);
    public abstract void closeFile(Object file);
    
    public Object analyzeData(Object data) {
        System.out.println("Analizando datos genéricos: " + data);
        return "Resultado del análisis";
    }

    public void sendReport(Object analysis) {
        System.out.println("Enviando reporte: " + analysis);
    }
}
