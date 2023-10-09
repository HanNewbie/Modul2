public class BankBeraksi {

    public static void main(String[] args){
        Bank a = new Bank(10000);
        System.out.println("Selamat Datang di Bank ABC");
        System.out.println("Saldo saat ini: Rp."+a.getSaldo());
        a.SimpanUang(50000);
        System.out.println("Saldo Saat ini: Rp."+a.getSaldo());
        a.ambilUang(15000);
        System.out.println("Saldo Saat ini: Rp."+a.getSaldo());
    }
}
