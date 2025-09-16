package tm;

public class Coustmer_tm {
    private String ID;
    private String Name;
    private String Address;
    private String NIC;
    private String Contact;

    public Coustmer_tm() {
    }

    public Coustmer_tm(String ID, String name, String address, String NIC, String contact) {
        this.ID = ID;
        this.Name = name;
        this.Address = address;
        this.NIC = NIC;
        this.Contact = contact;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }
}
