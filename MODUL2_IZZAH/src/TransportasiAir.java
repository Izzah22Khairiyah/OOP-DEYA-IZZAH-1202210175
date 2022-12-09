public class TransportasiAir {
    protected int jmlhKursi;
    protected int harga;

    public TransportasiAir(int jmlhKursi, int harga){
        this.jmlhKursi = jmlhKursi;
        this.harga = harga;
    }
    
    public void informasi() {
        System.out.println("Transportasi air jenis" + " " + "dengan kursi berjumlah" + " " + jmlhKursi +  " ditetapkan dengan biaya sebesar Rp." + " " + harga);
    }

    public void berlayar() {
        System.out.println("Transportasi air dengan jenis" + " " +  " sedang berlayar");
    }

    public void berlabuh() {
        System.out.println("Transportasi air dengan jenis" + " sedang berlabuh di pantai");
    }

}
