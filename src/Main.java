public class Main {
    public static void main(String[] args) {
        Item i = Item.convertJSONToObject();
        System.out.println(i);

        Item item = new Item("111","pei","unit","23","2");
        System.out.println(item.serializeToJSON());

    }
}
