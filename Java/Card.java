import java.util.Date;

class Card extends Payment{
    Integer number;
    Integer cvv;
    Date date;

    public Card(Integer id, String type, Integer number, Integer cvv, Date date){
        super(id, type);
        this.number = number;
        this.cvv = cvv;
        this.date = date;
    }

}