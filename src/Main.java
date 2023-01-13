public class Main {
    public static void main(String[] args) {

       Popugay popugay=new Popugay();
       popugay.setBird("Попугай");
       popugay.setName("Кеша");
       popugay.setColor("Зелено красный");
       popugay.setAge(3);
        System.out.println("Канаттуу -> "+ popugay.getBird());
        System.out.println("Аты -> "+ popugay.getName());
        System.out.println("Ону -> "+ popugay.getColor());
        System.out.println("Жашы -> "+ popugay.getAge());

        System.out.println("//////////////////////////////");
        

        Sobaka sobaka =new Sobaka();
        sobaka.setName("Ак тош");
        sobaka.setAge(5);
        sobaka.setWeight(15);
        sobaka.setColor("Черный");
        sobaka.setBreed("Тайган");
        System.out.println("Аты -> "+ sobaka.getName());
        System.out.println("Жашы -> "+ sobaka.getAge());
        System.out.println("Салмагы ->"+ sobaka.getWeight());
        System.out.println("Ону -> "+ sobaka.getColor());
        System.out.println("Пародасы -> "+ sobaka.getBreed());

        System.out.println("//////////////////////////////");


        Afish afish=new Afish();
        afish.setName("Рыба ангел");
        afish.setColor("Зеленый");
        afish.setAquarium("Живет в аквариуме");
        afish.setWeight(0.5);
        System.out.println("Аты -> "+ afish.getName());
        System.out.println("Ону -> "+ afish.getColor());
        System.out.println("Жашаган жер -> "+ afish.getAquarium());
        System.out.println("Салмагы -> "+ afish.getWeight());

        System.out.println("/////////////////////////////////");



        Thecat thecat = new Thecat();
        thecat.setName("Борис");
        thecat.setBreed("Англиский");
        thecat.setColor("Рыжий");
        thecat.setAge(3);
        thecat.setWeight(1.3);
        System.out.println("Аты -> "+ thecat.getName());
        System.out.println("Породасы -> "+ thecat.getBreed());
        System.out.println("Ону -> "+ thecat.getColor());
        System.out.println("Жашы -> "+ thecat.getAge());
        System.out.println("Салмагы -> "+ thecat.getWeight());
    }
}