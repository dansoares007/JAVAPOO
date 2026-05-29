package Atividade_02022026;

public class ImportedProduct extends Produto{
    private final Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee){
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double totalPrice(){
        return getPrice() + customsFee;
    }

    @Override
    public String priceTag(){
        return getName()
                + " $ "
                + totalPrice()
                + "( Customs Fee: $ "
                + customsFee + ") \n";
    }
}
