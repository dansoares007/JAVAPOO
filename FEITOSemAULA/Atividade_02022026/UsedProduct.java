package Atividade_02022026;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Produto{
    private final LocalDate dataAgora;

    public UsedProduct(String name, Double price, LocalDate dataAgora) {
        super(name, price);
        this.dataAgora = dataAgora;
    }

    public LocalDate getDataAgora() {

        return dataAgora;
    }

    @Override
    public String priceTag(){
        java.time.format.DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return getName() + " (used) "
                + "$ "
                + String.format("%.2f", getPrice()) + " (Manufacture date: "
                + dataAgora.format(fmt)
                + ") \n";
    }
}
