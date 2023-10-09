public class Bank {

    private int saldo;

    public Bank(int saldo){

        this.saldo = saldo;
    }

    public void SimpanUang(int jumlah){
        System.out.println("\nSimpang uang: Rp."+jumlah);
        saldo = saldo + jumlah;
    }

    public void ambilUang(int jumlah){
        System.out.println("\nAmbil Uang: Rp."+jumlah);
        saldo = saldo - jumlah;
    }

    public int getSaldo(){
        return saldo;
    }

}
