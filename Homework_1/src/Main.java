public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder();
        Sailor sailor = new Sailor();
        Pilot pilot = new Pilot();
        builder.allInfo("Иван","Иванов",35,"Строитель");
        sailor.allInfo("Николай","Сидоров",46,"Моряк");
        pilot.allInfo("Виктор","Николаев",26,"Пилот");

        Tiger tiger = new Tiger();
        Crocodile crocodile = new Crocodile();
        Kangaroo kangaroo = new Kangaroo();
        tiger.allInfo("Тигр","Пантеры","Кошачьи","Хищники","Млекопитающие","Хордовые");
        crocodile.allInfo("Крокодил","Пресмыкающиеся", "Алигаторы","Вторично-водные","Анфибии","Хордовые");
        kangaroo.allInfo("Кенгуру","Заячьи", "Сумчатые","Кенгуровые","Млекопитающие","Хордовые");
    }
}