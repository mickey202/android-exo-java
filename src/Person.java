public class Person extends House {

    public Person(int surface, String color, boolean taxes) {
        super(surface, color, taxes);
       
    }

    @Override
    public void buytaxes() {
    
        if (getTaxes() == true) {
            System.out.println("je paye les taxes");
        }
        else {
            System.out.println("je ne paye pas les taxes");
    
        }
        
    }

    @Override
    public void display() {

        System.out.println("La surface de ma maison est de "+getSurface()+" et elle est de couleur "+getColor());
        
    }
    
}
