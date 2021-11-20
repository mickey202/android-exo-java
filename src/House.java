public abstract class House implements buytaxes {

    public int surface;
    public boolean taxes;


    public House(int surface, String color, boolean taxes) {
        this.surface = surface;
        this.color = color;
        this.taxes= taxes;
    }

    public String color;

    public abstract void display();

    public int getSurface() {
        return surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getTaxes() {
        return taxes;
    }

    public void setTaxes(boolean taxes) {
        this.taxes = taxes;
    }


    
}
