import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] original, Person added){
        Person[] finalPersonAdded = Arrays.copyOf(original, original.length + 1);
//        System.out.println(finalPersonAdded.length);

                finalPersonAdded[finalPersonAdded.length - 1] = added;
//        System.out.println(finalPersonAdded[finalPersonAdded.length]);

//        System.out.println(finalPersonAdded);
        return finalPersonAdded;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Boryana");
        people[1] = new Person("Ivan");
        people[2] = new Person("Maria");
        Person newPerson = new Person("James");
//        for(Person individual : people){
//            System.out.println(individual.getName());
//
////            for(String name : individual){
////                System.out.println(name);
////            }
//        }
////        String[][] addedPerson = new String[4];
        Person[] finalArray = addPerson(people, newPerson);
        for(Person oneAtATime : finalArray){
            System.out.println(oneAtATime.getName());
        }
//

//        System.out.println(ArraysExercises.addPerson(Person, newPerson));


    }
}
