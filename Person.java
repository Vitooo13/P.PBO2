public class Person {
    private String name;
    private int age;
    private String address;
    private String telp;
 
    public Person(String name, int age, String address, String telp){
        this.name = name;
        this.age = age;
        this.address = address;
        this.telp = telp;
   }

   public void setName(String name) {
         this.name = name;
   }
       
   public String getName() {
          return this.name;
   }
       
   public void setAge(int age) {
       this.age = age;
   }
     
       public int getAge() {
       return this.age;
   }
      
   public void setAddress(String address) {
       this.address = address;
 }
     
 public String getAddress() {
        return this.address;
 }

 public void setTelp(String telp) {
   this.telp = telp;
}
 
   public String getTelp() {
    return this.telp;
}

   public void displayInfo() {
       System.out.println(" ");
       System.out.println("Name : " + this.name);
       System.out.println("Age : " + this.age);
       System.out.println("Address : " + this.address);
       System.out.println("Telp : " + this.telp);
       System.out.println(" ");
  }
} 
