public class User {
    String name;
    String notelp;

    public void setName(String name){
        this.name=name;
    }
    public void settelp(String notelp){
        this.notelp=notelp;
    }
    public void hasil(){
    System.out.println("Masukkan Nama Anda :",this.name);
    System.out.println("Masukkan Nomor Telepon :",this.notelp);
    System.out.println("Register Success");
    }
}
