class Payment {
    Integer id;
    String type;

    public Payment(Integer id, String type){
        this.id = id;
        this.type = type;
    }

    void printMethodPay(){
        System.out.println("El metodo de pago es: " + id +" de tipo: " + type);
    }

}