public class Human{
   private String name;
   private String firstname;
   private int age;
   private String profession;

   public void allInfo(String name,String firstname,int age,String profession){
     this.name=name;
     this.firstname=firstname;
     this.age=age;
     this.profession=profession;
     System.out.println("Имя:" + name);
     System.out.println("Фамилия: " + firstname);
     System.out.println("Возраст: " + age);
     System.out.println("Профессия: " + profession);
     System.out.println("\n");
   }
}
