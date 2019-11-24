package labsession4;

public class BankAccount {
    public int account = 0;

    public synchronized void moTaiKhoan(){
        account = 10;
        System.out.println("Mo tai khoan Account = "+account);
        try {
            notifyAll();
        }
        catch (Exception e){}
    }

    public synchronized void napTien(){
        if (account == 0){
            try{
                wait();
            }
            catch (Exception e){}
        }
        System.out.println("Nap tien vao tai khoan: "+account);
    }

    public synchronized void doiMatKhau(){
        if (account == 0){
            try{
                wait();
            }
            catch (Exception e){}
        }
        System.out.println("Doi mat khau tai khoan: "+account);
    }

    public synchronized void lamTheATM(){
        if (account == 0){
            try{
                wait();
            }
            catch (Exception e){}
        }
        System.out.println("Lam ATM cho tai khoan: "+account);
    }
}