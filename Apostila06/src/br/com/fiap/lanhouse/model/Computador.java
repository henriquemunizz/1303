package br.com.fiap.lanhouse.model;

public class Computador {

    private String processador;
    private String placadeVideo;
    private int id;
    private boolean eSSD;
    private int memoriaRam;
    private double armazenamento;

    //CONSTRUTOR

    public Computador(int id, String processador){
        this.id = id;
        this.processador = processador;

    }

    public Computador(String processador,String placadeVideo,double armazenamento, int memoriaRam, boolean eSSD, int id){

        System.out.print("Processador: ");
        this.processador = processador;

        System.out.print("Placa de vídeo: ");
        this.placadeVideo = placadeVideo;

        System.out.print("Armazenamento: ");
        this.armazenamento = armazenamento;

        System.out.print("Memória Ram: ");
        this.memoriaRam = memoriaRam;

        System.out.print("É SSD?: ");
        this.eSSD = eSSD;

        System.out.print("ID: ");
        this.id = id;

    }

    //GET E SET
    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getPlacadeVideo() {
        return placadeVideo;
    }

    public void setPlacadeVideo(String placadeVideo) {
        this.placadeVideo = placadeVideo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean iseSSD() {
        return eSSD;
    }

    public void seteSSD(boolean eSSD) {
        this.eSSD = eSSD;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public double getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(double armazenamento) {
        this.armazenamento = armazenamento;
    }
}
