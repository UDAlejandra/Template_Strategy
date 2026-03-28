package template;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Proceso CSV ---");
        Data_Miner csvMiner = new CSV_Data_Miner();
        csvMiner.mine("datos.csv");

        System.out.println("\n--- Proceso PDF ---");
        Data_Miner pdfMiner = new PDF_Data_Miner();
        pdfMiner.mine("reporte.pdf");
                
        System.out.println("\n--- Proceso PDF ---");
        Data_Miner docMiner = new Doc_Data_Miner();
        docMiner.mine("reporte.pdf");
    }
}