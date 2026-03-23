public class Tugas_2 {
    public static void main(String[] args) {
        System.out.println("========== DATA ART COMMISSION NAO ==========");

        ArtComm[] workingList = {
            new DigiArt("Hanazonkk | @Hanazonkk", "Render", 70000, "On Progress", "Mafuyu Asahina - PJSK"),
            new DigiArt("Chikennnnn | @Rho_Ai", "Sketch", 50000, "On Progress", "Elysia - HI3"),
            new TradiArt("Blackroses | @Blackroses687", "BnW", 45000, "Queued", "Blackroses - Roblox Ava"),
            new TradiArt("Zyzyzy | @ramzysyg", "Lineart", 40000, "Queued", "Zyzyzy - MC Skin"),
            new DigiArt("Ketchup | @BuildJune", "Colored Sketch", 65000, "Queued", "Nanno - Girl From Nowhere")
        };
        int working = 0;
        int queued = 0;
        for (ArtComm i : workingList){
            i.infoComm();
            System.out.println("----------------------------------------------");
            if (i.getStatus().equals("On Progress")){
                working++;
            }
            else if (i.getStatus().equals("Queued")){
                queued++;
            }
        }
        System.out.println("On Progress: " + working + " | Queued: " + queued);
        System.out.println("==============================================");
    }
}

abstract class ArtComm {
    protected String namaPembeli;
    protected String jenis;
    protected int harga;
    protected String status;
    protected String chara;

    public ArtComm(String nama, String j, String stat, String character){
        this.namaPembeli = nama;
        this.jenis = j;
        this.status = stat;
        this.chara = character;
    }

    public void setHarga(int h){
        if (h > 0){
            this.harga = h;
        }
    }

    public int getHarga(){
        return harga;
    }

    public String getStatus(){
        return status;
    }

    abstract void infoComm();
}

class DigiArt extends ArtComm{
    public DigiArt(String nama, String j, int h, String stat, String character){
        super(nama, j, stat, character);
        this.setHarga(h);
    }
    @Override
    void infoComm(){
        System.out.println("DIGITAL ART");
        System.out.println("Nama pembeli: " + namaPembeli);
        System.out.println("Jenis Art Commision: " + jenis);
        System.out.println("Harga: " + harga);
        System.out.println("Karakter: " + chara);
        System.out.println("Status: " + status);
    }
}

class TradiArt extends ArtComm{
    public TradiArt(String nama, String j, int h, String stat, String character){
        super(nama, j, stat, character);
        this.setHarga(h);
    }
    @Override
    void infoComm(){
        System.out.println("TRADITIONAL ART");
        System.out.println("Nama pembeli: " + namaPembeli);
        System.out.println("Jenis Art Commision: " + jenis);
        System.out.println("Harga: " + harga);
        System.out.println("Karakter: " + chara);
        System.out.println("Status: " + status);
    }
}