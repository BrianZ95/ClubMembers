public class Main{
    public static void main(String[] args){
        ClubMembers test = new ClubMembers();
        test.addMembers("person1", 2019, false);
        test.addMembers("person2", 2018, true);
        test.addMembers("person3", 2017, false);
        test.addMembers("person4", 2020, true);
        System.out.println(test.getlist());
        System.out.println();
        System.out.println(test.removeMembers(2018));
        System.out.println();
        System.out.println(test.getlist());
        
    }
}