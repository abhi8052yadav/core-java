public class ProductCustomer {
        private int itemno;
        private String name;
        private int price;
        private int qty;
        public ProductCustomer(){
        }
        public ProductCustomer(int itemno,String name)
        {
            this.itemno = itemno;
            this.name = name;
        }
        public void setPrice(int pri)
        {
            price = pri;
        }
        public int getPrice()
        {
            return price;
        }
        public void setQuantity(int q)
        {
            qty = q;
        }
        public int getQuantity(){
            return qty;
        }
        public String getName()
        {
            return name;
        }
        public int getItemNumber(){
            return itemno;
        }
}
class Mainhai{
    public static void main(String[] args)
    {
        ProductCustomer pc = new ProductCustomer(56,"pepsi");
        pc.setPrice(50);
        pc.setQuantity(10);
        System.out.println(pc.getName()+" has "+pc.getQuantity()+" quantity.");
    }
}

