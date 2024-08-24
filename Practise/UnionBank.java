public class UnionBank extands ReservBank{
    private void savingAccount(int interest){
    sop("Intrest rate of SA is "+ intrest +"%");
    super.savingAccount(8);
    }
    private void fixedDeposit(){
    sop("Intrest rate of FD is 5%");
    }
    public static void main(String [] args){
    UnionBank bank = new UnionBank();
    bank.savingAccount(7);
    bank.CurrentAccount();
    bank.fixedDeposit();
    }
}