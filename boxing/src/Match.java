public class Match {

    fighter f1;
    fighter f2;
    fighter winner=null;
    int maxW;
    int minW;

   

    public Match(fighter f1, fighter f2, int maxW, int minW) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxW = maxW;
        this.minW = minW;
    }

    public void run(){
        
       if (Math.random()*100>50){
        fighter temp=f1;
        f1=f2;
       }
       System.out.println("MAÇA BAŞLAYCAK DÖVÜŞÇÜ:"+this.f1.name);


        
        if(isCheck()){
            while(this.f1.health>0&&this.f2.health>0){

                System.out.println("======YENİ ROUND=====");
                this.f2.health=this.f1.hit(f2);

                if(isWin()){
                    this.winner=f1;

                    break;
                }

                this.f1.health=this.f2.hit(f1);

                if(isWin()){
                    this.winner=f2;

                    break;
                }



            }

            
            System.out.println(this.winner.name+" kalan sağlık: "+this.winner.health);

        }



        else{
            System.out.println("Karşılaşma yapılamaz.");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minW && this.f1.weight <= maxW) && (this.f2.weight >= minW && this.f2.weight <= maxW);
    }

     boolean isWin() {

       if(this.f1.health==0){
        System.out.println("KAZANAN DOVUSCU: "+ this.f2.name);
        return true;
       }
       if(this.f2.health==0){
        System.out.println("KAZANAN DOVUSCU "+this.f1.name);
        return true;
       }
       else{
        return false;
       }

       

    }

}
