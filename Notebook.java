import java.util.Objects;

public class Notebook {
    private String brand, model, os, graphicCard;
    private Integer ram, capacity;

    public Notebook(String brand, String model, String os) {
        this.brand = brand;
        this.model = model;
        this.os = os;
        this.ram = 8;
        this.capacity = 256;
        this.graphicCard = "Nvidia 1060";
    }

    public Notebook(String brand, String model, Integer ram, Integer capacity, String os, String graphicCard) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.capacity = capacity;
        this.os = os;
        this.graphicCard = graphicCard;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getRam() {
        return ram;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public String getOs() {
        return os;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ";\nModel: " + this.model + ";\nRAM: " + this.ram + ";\nCapacity: " + this.capacity + ";\nGraphic card: "
                + this.graphicCard + ";\nOS: " + this.os + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return Objects.equals(brand, notebook.brand) && Objects.equals(model, notebook.model) && Objects.equals(ram, notebook.ram) && Objects.equals(capacity, notebook.capacity) && Objects.equals(os, notebook.os) && Objects.equals(graphicCard, notebook.graphicCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, ram, capacity, os, graphicCard);
    }
}


