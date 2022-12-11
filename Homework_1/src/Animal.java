public class Animal {
   private String name;
   private String genus;
   private String family;
   private String team;
   private String klass;
   private String type;

   public void allInfo(String name,String genus,String family,String team,String klass,String type){
       this.name=name;
       this.genus=genus;
       this.family=family;
       this.team=team;
       this.klass=klass;
       this.type=type;
       System.out.println("Имя: " + name);
       System.out.println("Род: " + genus);
       System.out.println("Семейство: " + family);
       System.out.println("Отряд: " + team);
       System.out.println("Класс: " + klass);
       System.out.println("Тип: " + type);
       System.out.println("\n");
   }

}
