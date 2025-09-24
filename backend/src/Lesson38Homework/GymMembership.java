package Lesson38Homework;

class GymMembership {
    String memberName, membershipType; int durationMonths;
    GymMembership(String name,String type,int duration){memberName=name;membershipType=type;durationMonths=duration;}
    double calculateFee(){
        if(membershipType.equalsIgnoreCase("Premium")) return durationMonths*50;
        else return durationMonths*30;
    }
}

class PremiumMembership extends GymMembership {
    boolean personalTrainer, spaAccess;
    PremiumMembership(String name,int duration,boolean trainer,boolean spa){
        super(name,"Premium",duration);
        personalTrainer=trainer; spaAccess=spa;
    }
    @Override
    double calculateFee(){
        double fee = super.calculateFee();
        if(personalTrainer) fee+=100;
        if(spaAccess) fee+=50;
        return fee;
    }
}

 class Main30 {
    public static void main(String[] args){
        PremiumMembership pm = new PremiumMembership("Elsen",6,true,true);
        System.out.println("Fee: "+pm.calculateFee());
    }
}
