package assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Team {
   private ArrayList<TeamMember> members = new ArrayList<>();

    /**
     * 
     * @param m an instance of TeamMember
     * Adds a teammember to the instance field members
     */
    public void addTeamMember(TeamMember m) {
        TeamMember member2 = new TeamMember(1, "Arne", "Coach");
        members.add(member2);
    }
    
    // Nothing to do here!
    public void addTeamMembers(ArrayList<TeamMember> t) {
        members.addAll(t);
    }
    
    // Nothing to do here!
    public ArrayList<TeamMember> getAllMembers() {
        return members;
    }
    
    /**
     * 
     * @param m the TeamMember to remove
     * @return if a TeamMember was removed
     */
    public boolean removeTeamMember(TeamMember m){
        return members.remove(m);
    }

    /**
     * 
     * @return the next available id
     * The id must start at 0. If a member is removed from the list,
     * the id must be freed for the next member.
     * The next id must always be the smallest possible id number
     * 
     * * This is hard. Skip this for now if you don't know how to do it
     */
    
    public int getNextId() {

        int count = 0;
        for (int i = 0; i < members.size(); i++) {
            count++;
        }
        return count;
    }

    /**
     * 
     * @param role, a String representing the role of the TeamMember
     * @return an ArrayList of all TeamMember that has the specified role
     */
    public ArrayList<TeamMember> retriveMembersByRole(String role) {
        ArrayList<TeamMember> TeamMembers = new ArrayList<>();
        for(TeamMember member : members){
            if(member.getRole().equals(role)){
                TeamMembers.add(member);
            }
        }
        return TeamMembers;
    }

    /**
     * Sort the TeamMember list in ascending order by name
     * * This is hard. Skip this for now if you don't know how to do it
     */
    public void sortByNameAsc() {
        members.sort(Comparator.comparing(TeamMember::getName));
    }

    /**
     * Sort the TeamMember list in descending order by role
     * 
     * * This is hard. Skip this for now if you don't know how to do it
     */
    public void sortByRoleDesc() {
        Comparator<TeamMember> comparator = (member1, member2) -> member2.getRole().compareTo(member1.getRole());
        members.sort(comparator);
    }
    
}
