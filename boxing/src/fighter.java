public class fighter {

    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    public fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    int hit(fighter r) {
        if (r.isDodge()) {
            System.out.println(r.name + " SALDIRIYI ENGELLEDİ!!!");

            return r.health;
        } 

            System.out.println(this.name + "=>" + r.name + " " + this.damage + " hasar vurdu");

            if (r.health - this.damage < 0) {
                return 0;
            }

            return r.health - this.damage;
        
    }

    boolean isDodge() {
        double randomNumber = Math.random() * 100;

        return this.dodge >= randomNumber;
    }

}