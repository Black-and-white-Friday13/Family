/**
 * Created by abegansky on 10.10.16.
 */
public class Main {
    public static void main(String[] args)
    {
        Human MatherGrandfather = new Human("Вася",true, 74, null, null );
        Human MatherGrandmother = new Human("Аня",false, 73, null, null );
        Human PopeGrandfather = new Human("Олег",true, 71, null, null );
        Human PopeGrandmother = new Human("Яна",false, 72, null, null );
        Human mother = new Human("Аня",false, 42, MatherGrandfather, MatherGrandmother);
        Human father = new Human("Андрей",true, 40, PopeGrandfather, PopeGrandmother);
        Human son = new Human("Костя",true, 21, father, mother );
        Human daughter = new Human("Марина",false, 23, father, mother );
        Human daughter1 = new Human("Алина",false, 20, father, mother );

        System.out.println(MatherGrandfather.toString());
        System.out.println(MatherGrandmother.toString());
        System.out.println(PopeGrandfather.toString());
        System.out.println(PopeGrandmother.toString());
        System.out.println(mother.toString());
        System.out.println(father.toString());
        System.out.println(son.toString());
        System.out.println(daughter.toString());
        System.out.println(daughter1.toString());

    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}
