import com.owlike.genson.Genson;

public class Item {
    private String barcode;
    private String name;
    private String unit;
    private String price;
    private String number;

    public Item() {
    }

    public String getBarcode() {
        return barcode;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public String getPrice() {
        return price;
    }

    public String getNumber() {
        return number;
    }

    public Item(String barcode, String name, String unit, String price, String number) {
        this.barcode = barcode;
        this.name = name;
        this.unit = unit;
        this.price = price;
        this.number = number;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    static Item convertJSONToObject() {
        Genson genson = new Genson();
      return genson.deserialize("{\"barcode\":\"123\",\"name\":\"pei\",\"unit\":\"瓶\",\"price\":\"3.00\",\"number\":\"1\"}",Item.class);
    }

    public String serializeToJSON() {
        Genson genson = new Genson();
        return genson.serialize(this);
    }

    @Override
    public String toString() {
        return "Item{" +
                "barcode='" + barcode + '\'' +
                ", name='" + name + '\'' +
                ", unit='" + unit + '\'' +
                ", price=" + price +
                ", number=" + number +
                '}';
    }
}
