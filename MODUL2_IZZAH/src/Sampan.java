public class Sampan extends TransportasiAir{
    protected int layar;

    public Sampan(int jmlhKursi, int biaya, int layar){
        super(jmlhKursi, biaya);
        this.layar = layar;
    }

    @Override
    public void informasi() {
        System.out.println("Transportasi Air jenis Sampan dengan kursi berjumlah " +jmlhKursi+ " ditetapkan dengan biaya sebesar Rp. " + harga);
    }

    @Override
    public void berlayar() {
        System.out.println("Transportasi Air jenis Sampan sedang berlayar menggunakan " +layar+ " layar");
    }

    @Override
    public void berlabuh() {
        System.out.println("Transportasi Air jenis Sampan sedang berlabuh di pantai tanpa jangkar");
    }

    public void berlabuh(int jangkar) {
        System.out.println("Transportasi Air jenis Sampan sedang berlabuh di pantai menggunakan " +jangkar+" jangkar");
    }
}
