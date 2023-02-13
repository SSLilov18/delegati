public class Delegate {
    private String Name;
    private String EGN;
    private String Region;
    private double PytniRazhodi;
    private boolean Cart;
    public Delegate(){

        this.Name = "Stiv";
        this.EGN = "0445065430";
        this.Region = "Sofia";
        this.PytniRazhodi = 140;
        this.Cart = true;
    }
    public Delegate(String name, String EGN, String region,
                    double pytniRazhodi, boolean cart) {
        Name = name;
        this.EGN = EGN;
        Region = region;
        PytniRazhodi = pytniRazhodi;
        Cart = cart;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getEGN() {
        return EGN;
    }
    public void setEGN(String EGN) {
        this.EGN = EGN;
    }
    public String getRegion() {
        return Region;
    }
    public void setRegion(String region) {
        Region = region;
    }
    public double getPytniRazhodi() {
        return PytniRazhodi;
    }
    public void setPytniRazhodi(double pytniRazhodi) {
        PytniRazhodi = pytniRazhodi;
    }
    public boolean isCart() {
        return Cart;
    }
    public void setCart(boolean cart) {
        Cart = cart;
    }
    @Override
    public String toString() {
        return "Delegate{" +
                "Name='" + Name + '\'' +
                ", EGN='" + EGN + '\'' +
                ", Region='" + Region + '\'' +
                ", PytniRazhodi=" + PytniRazhodi +
                ", Cart=" + Cart +
                '}';
    }
}

