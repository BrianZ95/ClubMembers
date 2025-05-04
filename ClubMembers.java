import java.util.ArrayList;
public class ClubMembers {
    private ArrayList<MemberInfo> memberList;

    public ClubMembers(){
        memberList = new ArrayList<MemberInfo>();
    }
    /**
     * Adds new club members to memberList, as described in part (a).
     * Precondition: names is a non-empty array.
     */
    public void addMembers(String[] names, int gradYear) {
            for (String name : names){
                memberList.add(new MemberInfo(name, gradYear, true));
            }
    }

    public void addMembers(String names, int gradYear, boolean academicStanding) {
        memberList.add(new MemberInfo(names, gradYear, academicStanding));
    }   

    public ArrayList<MemberInfo> getlist(){
        return memberList;
    }

    /**
     * Removes members who have graduated and returns a list of members who have
     * graduated
     * and are in good standing, as described in part (b).
     */
    public ArrayList<MemberInfo> removeMembers(int year) {
        ArrayList<MemberInfo> graduated = new ArrayList<>();
        for (int i = 0; i < memberList.size(); i++){
            if (memberList.get(i).getGradYear() <= year && memberList.get(i).inGoodStanding()){
                graduated.add(memberList.get(i));
            }
            if (memberList.get(i).getGradYear() <= year){
                memberList.remove(i);
                i--;
            }
        }
        return graduated;
     }
    // There may be instance variables, constructors, and methods that are not
    // shown.
}