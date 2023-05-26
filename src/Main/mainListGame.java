/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author anoth
 */
public class mainListGame {
    private String gameName; 
    
    public mainListGame(String cekGame){
        switch (cekGame)
        {
            case "ml" -> setGameName("Mobile Legends");
            case "aov" -> setGameName("Arena of Valor");
            case "hdi" -> setGameName("Higgs Domino");
            case "stumble" -> setGameName("Stumble Guys");
            case "valo" -> setGameName("Valorant");
            case "ff" -> setGameName("Free Fire");
        }
    }
    
    public mainListGame(){
    }
    
    public void setGameName(String gameName){
        this.gameName = gameName;
    }
    public String getGameName(){
        return gameName;
    }
}

final class mobileLegends extends mainListGame{
    private String pilihanTopup;
    private String harga;
    
    public mobileLegends(int tombol){
        super();
        
        switch (tombol)
        {
            case 1 ->
            {
                setPilihanTopup("11 Diamonds + 1 Bonus");
                setHarga("Rp. 3.330");
            }
            case 2 ->
            {
                setPilihanTopup("17 Diamonds + 2 Bonus");
                setHarga("Rp. 5.797");
            }
            case 3 ->
            {
                setPilihanTopup("53 Diamonds + 6 Bonus");
                setHarga("Rp. 16.872");
            }
            case 4 ->
            {
                setPilihanTopup("77 Diamonds + 8 Bonus");
                setHarga("Rp. 24.254");
            }
            case 5 ->
            {
                setPilihanTopup("367 Diamonds + 41 Bonus");
                setHarga("Rp. 115.995");
            }
            case 6 ->
            {
                setPilihanTopup("503 Diamonds + 65 Bonus");
                setHarga("Rp. 158.175");
            }
            case 7 ->
            {
                setPilihanTopup("1708 Diamonds + 302 Bonus");
                setHarga("Rp. 527.250");
            }
            case 8 ->
            {
                setPilihanTopup("4003 Diamonds + 827 Bonus");
                setHarga("Rp. 1.265.400");
            }
            case 9 ->
            {
                setPilihanTopup("Weekly Diamond Pass");
                setHarga("Rp. 32.190");
            }
            case 10 ->
            {
                setPilihanTopup("Twilight Pass");
                setHarga("Rp. 151.364");
            }
        }
        main.pilihantopup.setText(getPilihanTopup());
        main.hargatopup.setText(getHarga());
    }
    
    public void setPilihanTopup(String pilihanTopup){
        this.pilihanTopup = pilihanTopup;
    }
    public String getPilihanTopup(){
        return pilihanTopup;
    }
    public void setHarga(String harga){
        this.harga = harga;
    }
    public String getHarga(){
        return harga;
    }
}

final class arenaOfValor extends mainListGame{
    private String pilihanTopup;
    private String harga;
    
    public arenaOfValor(int tombol){
        super();
        
        switch (tombol)
        {
            case 1 ->
            {
                setPilihanTopup("40 Vouchers");
                setHarga("Rp. 10.000");
            }
            case 2 ->
            {
                setPilihanTopup("90 Vouchers");
                setHarga("Rp. 20.000");
            }
            case 3 ->
            {
                setPilihanTopup("230 Vouchers");
                setHarga("Rp. 50.000");
            }
            case 4 ->
            {
                setPilihanTopup("470 Vouchers");
                setHarga("Rp. 100.000");
            }
            case 5 ->
            {
                setPilihanTopup("950 Vouchers");
                setHarga("Rp. 200.000");
            }
            case 6 ->
            {
                setPilihanTopup("1430 Vouchers");
                setHarga("Rp. 300.000");
            }
            case 7 ->
            {
                setPilihanTopup("2390 Vouchers");
                setHarga("Rp. 500.000");
            }
            case 8 ->
            {
                setPilihanTopup("4800 Vouchers");
                setHarga("Rp. 1.000.000");
            }
            case 9 ->
            {
                setPilihanTopup("24050 Vouchers");
                setHarga("Rp. 5.000.000");
            }
            case 10 ->
            {
                setPilihanTopup("48200 Vouchers");
                setHarga("Rp. 10.000.000");
            }
        }
        main.pilihantopup.setText(getPilihanTopup());
        main.hargatopup.setText(getHarga());
    }
    
    public void setPilihanTopup(String pilihanTopup){
        this.pilihanTopup = pilihanTopup;
    }
    public String getPilihanTopup(){
        return pilihanTopup;
    }
    public void setHarga(String harga){
        this.harga = harga;
    }
    public String getHarga(){
        return harga;
    }
}

final class higgsDomino extends mainListGame{
    private String pilihanTopup;
    private String harga;
    
    public higgsDomino(int tombol){
        super();
        
        switch (tombol)
        {
            case 1 ->
            {
                setPilihanTopup("30M Koin Emas-D");
                setHarga("Rp. 5.000");
            }
            case 2 ->
            {
                setPilihanTopup("60M Koin Emas-D");
                setHarga("Rp. 10.000");
            }
            case 3 ->
            {
                setPilihanTopup("100M Koin Emas-D");
                setHarga("Rp. 15.000");
            }
            case 4 ->
            {
                setPilihanTopup("200M Koin Emas-D");
                setHarga("Rp. 30.000");
            }
            case 5 ->
            {
                setPilihanTopup("400M Koin Emas-D");
                setHarga("Rp. 60.000");
            }
            case 6 ->
            {
                setPilihanTopup("500M Koin Emas-D");
                setHarga("Rp. 80.000");
            }
            case 7 ->
            {
                setPilihanTopup("1B Koin Emas-D");
                setHarga("Rp. 125.000");
            }
            case 8 ->
            {
                setPilihanTopup("2B Koin Emas-D");
                setHarga("Rp. 250.000");
            }
            case 9 ->
            {
                setPilihanTopup("4B Koin Emas-D");
                setHarga("Rp. 500.000");
            }
            case 10 ->
            {
                setPilihanTopup("8B Koin Emas-D");
                setHarga("Rp. 1.000.000");
            }
        }
        main.pilihantopup.setText(getPilihanTopup());
        main.hargatopup.setText(getHarga());
    }
    
    public void setPilihanTopup(String pilihanTopup){
        this.pilihanTopup = pilihanTopup;
    }
    public String getPilihanTopup(){
        return pilihanTopup;
    }
    public void setHarga(String harga){
        this.harga = harga;
    }
    public String getHarga(){
        return harga;
    }
}

final class stumbleGuys extends mainListGame{
    private String pilihanTopup;
    private String harga;
    
    public stumbleGuys(int tombol){
        super();
        
        switch (tombol)
        {
            case 1 ->
            {
                setPilihanTopup("Pile of Gems(250)");
                setHarga("Rp. 12.000");
            }
            case 2 ->
            {
                setPilihanTopup("Pile of Gems(500)");
                setHarga("Rp. 23.000");
            }
            case 3 ->
            {
                setPilihanTopup("Bag of Gems(800)");
                setHarga("Rp. 31.500");
            }
            case 4 ->
            {
                setPilihanTopup("Crate of Gems(1600 + 75T)");
                setHarga("Rp. 55.295");
            }
            case 5 ->
            {
                setPilihanTopup("Vault of Gems(5000 + 275T)");
                setHarga("Rp. 125.000");
            }
            case 6 ->
            {
                setPilihanTopup("Pile of Stumble Token(50)");
                setHarga("Rp. 10.000");
            }
            case 7 ->
            {
                setPilihanTopup("Pile of Stumble Token(120)");
                setHarga("Rp. 37.700");
            }
            case 8 ->
            {
                setPilihanTopup("Pile of Stumble Token(250)");
                setHarga("Rp. 75.000");
            }
            case 9 ->
            {
                setPilihanTopup("Vault of Stumble Token(650)");
                setHarga("Rp. 160.000");
            }
            case 10 ->
            {
                setPilihanTopup("Vault of Stumble Token(1300)");
                setHarga("Rp. 315.000");
            }
        }
        main.pilihantopup.setText(getPilihanTopup());
        main.hargatopup.setText(getHarga());
    }
    
    public void setPilihanTopup(String pilihanTopup){
        this.pilihanTopup = pilihanTopup;
    }
    public String getPilihanTopup(){
        return pilihanTopup;
    }
    public void setHarga(String harga){
        this.harga = harga;
    }
    public String getHarga(){
        return harga;
    }
}

final class valorant extends mainListGame{
    private String pilihanTopup;
    private String harga;
    
    public valorant(int tombol){
        super();
        
        switch (tombol)
        {
            case 1 ->
            {
                setPilihanTopup("125 Points");
                setHarga("Rp. 14.250");
            }
            case 2 ->
            {
                setPilihanTopup("420 Points");
                setHarga("Rp. 47.500");
            }
            case 3 ->
            {
                setPilihanTopup("700 Points");
                setHarga("Rp. 76.000");
            }
            case 4 ->
            {
                setPilihanTopup("1375 Points");
                setHarga("Rp. 142.500");
            }
            case 5 ->
            {
                setPilihanTopup("2400 Points");
                setHarga("Rp. 237.500");
            }
            case 6 ->
            {
                setPilihanTopup("4000 Points");
                setHarga("Rp. 380.000");
            }
            case 7 ->
            {
                setPilihanTopup("8150 Points");
                setHarga("Rp. 760.000");
            }
            case 8 ->
            {
                setPilihanTopup("10500 Points");
                setHarga("Rp. 1.000.000");
            }
            case 9 ->
            {
                setPilihanTopup("21000 Points");
                setHarga("Rp. 1.950.000");
            }
            case 10 ->
            {
                setPilihanTopup("50000 Points");
                setHarga("Rp. 4.800.000");
            }
        }
        main.pilihantopup.setText(getPilihanTopup());
        main.hargatopup.setText(getHarga());
    }
    
    public void setPilihanTopup(String pilihanTopup){
        this.pilihanTopup = pilihanTopup;
    }
    public String getPilihanTopup(){
        return pilihanTopup;
    }
    public void setHarga(String harga){
        this.harga = harga;
    }
    public String getHarga(){
        return harga;
    }
}

final class freeFire extends mainListGame{
    private String pilihanTopup;
    private String harga;
    
    public freeFire(int tombol){
        super();
        
        switch (tombol)
        {
            case 1 ->
            {
                setPilihanTopup("5 Diamonds");
                setHarga("Rp. 1.000");
            }
            case 2 ->
            {
                setPilihanTopup("12 Diamonds");
                setHarga("Rp. 2.000");
            }
            case 3 ->
            {
                setPilihanTopup("50 Diamonds");
                setHarga("Rp. 8.000");
            }
            case 4 ->
            {
                setPilihanTopup("70 Diamonds");
                setHarga("Rp. 10.000");
            }
            case 5 ->
            {
                setPilihanTopup("140 Diamonds");
                setHarga("Rp. 20.000");
            }
            case 6 ->
            {
                setPilihanTopup("355 Diamonds");
                setHarga("Rp. 50.000");
            }
            case 7 ->
            {
                setPilihanTopup("720 Diamonds");
                setHarga("Rp. 100.000");
            }
            case 8 ->
            {
                setPilihanTopup("1450 Diamonds");
                setHarga("Rp. 200.000");
            }
            case 9 ->
            {
                setPilihanTopup("2180 Diamonds");
                setHarga("Rp. 300.000");
            }
            case 10 ->
            {
                setPilihanTopup("3640 Diamonds");
                setHarga("Rp. 500.000");
            }
        }
        main.pilihantopup.setText(getPilihanTopup());
        main.hargatopup.setText(getHarga());
    }
    
    public void setPilihanTopup(String pilihanTopup){
        this.pilihanTopup = pilihanTopup;
    }
    public String getPilihanTopup(){
        return pilihanTopup;
    }
    public void setHarga(String harga){
        this.harga = harga;
    }
    public String getHarga(){
        return harga;
    }
}