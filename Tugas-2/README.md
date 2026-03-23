# Penjelasan Tugas 2

### 1. Deskripsi Kasus
Kode yang saya buat adalah kode untuk manajemen pesanan art commission. Terkadang saya menemukan kasus di mana seorang artist kebingungan dalam mengatur list pesanan yang ia terima dan sejauh mana progresnya. Oleh karena itu, saya mencoba mengimplementasikan struktur data OOP dalam kasus ini. Kode ini dapat menyimpan nama pemesan, jenis pesanan, harga, status, serta karakter yang diminta.

### 2. Class Diagram
Class diagram yang saya buat adalah sebagai berikut:
![Diagram](../assets/Tugas-2/Diagram.png)
Diagram tersebut menunjukkan bahwa class utamanya adalah `ArtComm`. Kemudian, terdapat dua turunan dari kelas `ArtComm`, yakni `DigiArt` dan `TradiArt`, yang mewakili jenis art untuk commission.

### 3. Kode Program Java
Kode program yang saya buat adalah sebagai berikut:
```java
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
```
Kode tersebut merupakan kode sederhana untuk manajemen pesanan art commission. Kode tersebut terdiri dari beberapa bagian antara lain:
#### a) Abstract Class
```java
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
```
Bagian ini memuat `ArtComm` sebagai kelas utama yang membawa nama pemesan, jenis art, status pesanan, karakter, serta harga pesanan. Terdapat setter harga di mana harga hanya akan masuk jika `harga > 0`. Kemudian, terdapat juga getter untuk harga dan status untuk mengembalikan nilai dari variabelnya. Terakhir, terdapat fungsi yang dapat diturunkan, yakni `infoComm()` yang nantinya akan diturunkan ke kelas-kelas turunan `ArtComm`.

### b) Inheritance Class
Terdapat dua kelas turunan pada kode ini, yakni kelas turunan `DigiArt` dan `TradiArt`. Masing-masing potongan kode kelas turunan adalah sebagai berikut:
```java
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
```
```java
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
```
Kedua kelas turunan ini memiliki atribut yang sama-sama diturunkan dari kelas utamanya. Kemudian kedua kelas turunan ini mengoverride fungsi `infoComm()` untuk menampilkan informasi pesanan sesuai dengan jenis art yang dipesan.

#### c) Output
```java
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
```
Bagian ini adalah bagian `main` dari kode. Pada potongan kode ini terdapat array dari `ArtComm` dengan nama `workingList` yang berisi list dari pemesan serta status pesanannya. Output dari program ini juga berisi jumlah karya dengan status on progress dan queued untuk mempermudah artist mengatur waktu dalam mengerjakan pesanan.

### 4. Screenshot Output
