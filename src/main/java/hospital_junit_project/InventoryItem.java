package hospital_junit_project;
import java.time.LocalDate;

class InventoryItem {
    private static int items_count = 0;

    private int Item_id;
    private String name;
    private int quantity;
    private double price;
    private String expiryDate;

    public InventoryItem(int itemId, String name, int quantity, double price, String expiryDate) {
        items_count++;
        Item_id = itemId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.expiryDate = expiryDate;
    }

    public static int get_items_count() {
        return items_count;
    }

    public int getItem_id() {
        return Item_id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
       if(quantity>=0)
    	this.quantity = quantity;
       else
    	   System.out.println("Enter valid quantity number  ");
    }

    public double getPrice() {
       
    	return price;
    }

    public void setPrice(double price) {
        if (price>=5&&price<=10000)
    	this.price = price;
        else
        	System.out.println("Enter valid price in range ");
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
    	LocalDate expiryDatee = LocalDate.parse(expiryDate);

        // Get the current date
        LocalDate currentDate = LocalDate.now();
    	if(expiryDatee.isBefore(currentDate))
    		System.out.println("This item is expired Enter valid expiry date");
    	else 
    		this.expiryDate = expiryDate;
    }
}
