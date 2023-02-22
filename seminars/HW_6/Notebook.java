package seminars.HW_6;

public class Notebook {
    private String manufacturer;
    private String model;
    private int ram;
    private int hardDrive;
    private String os;
    private String color;
    private int price;

    public Notebook (String manufacturer, String model, int ram, int hardDrive, String os, String color, int price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.os = os;
        this.color = color;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setram(int ram) {
        this.ram = ram;
    }

    public int getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Notebook{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", RAM=" + ram +
                ", hardDrive='" + hardDrive + '\'' +
                ", OS=" + os +
                ", color=" + color +
                ", price=" + price +
                '}';
    }
}