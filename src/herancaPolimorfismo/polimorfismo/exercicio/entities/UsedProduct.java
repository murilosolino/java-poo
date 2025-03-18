package herancaPolimorfismo.polimorfismo.exercicio.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class UsedProduct extends Product{

    private LocalDate manufactureDate;

    public UsedProduct(){};

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return super.getName() + " (used) $ " + String.format("%.2f", super.getPrice()) + " (Manufacture date: " + manufactureDate.format(fmt) + ")";
    }

}
