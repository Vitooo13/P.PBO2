public class Main {
    public static void main (String[] args){
        Person person = new Person ("Jovan", 19, "Bogor", "082233445566");
        Person person1 = person;
        person1.displayInfo();

        // Ubah Nilai atribut menggunakan setter
        person1.setName("Alfito");
        person1.setAge(21);
        person1.setAddress("Jakarta");
        person1.setTelp("0825271628711");
        
        //Tampilkan Kembali Informasi
        System.out.println("Updated Information: ");
        person1.displayInfo();
    } 
}