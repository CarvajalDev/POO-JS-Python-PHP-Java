class Paypal extends Payment{
    String email;
    String password;

    public Paypal(Integer id, String type, String email, String password){
        super(id, type);
        this.email = email;
        this.password = password;
    }

}