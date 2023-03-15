package com.careerdevs;
class Sports1{

    String getName(){
        return "Generic Sports";
    }

    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer1 extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }



    // Write your overridden getNumberOfTeamMembers method here
    @Override
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName() );
    }

}

public class JavaMethodOverriding {
    public static void main(String []args){
        Sports1 c1 = new Sports1();
        Soccer1 c2 = new Soccer1();
        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();
        System.out.println(c2.getName());
        c2.getNumberOfTeamMembers();
    }
}
