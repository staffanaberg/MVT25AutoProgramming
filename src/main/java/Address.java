public class Address {
    //attribut
    //gatuadress (String)
    //postnummer (int)
    //private datatyp variabelnamn;
    private String address;
    private int number;

    //konstruktor
    //ursprungsvärden till attributen
    //public KlassNamn() {}
    public Address(String address, int number) {
        this.address = address;
        this.number = number;
    }

    //returnera gatuadress
    //public void metodNamn() {}
    //public datatyp metodNamn() {}
    public String getAddress() {
        return address;
    }

    //returnera postnummer
    public int getNumber() {
        return number;
    }

}
