

public class App {
    public static void main(String[] args){
        String[][] world = new String[7][4];

        for(int i = 0;i<world.length;i++){
            for(int j=0;j<world[i].length;j++){
                if(i==3&&j==3){
                    world[i][j]=" ";
                    continue;
                }
                
                if(i==0 || i==3 || i==6 ){
                    world[i][j]="*";
                }
                else if(j==0 || j==3){
                    world[i][j]="*";
                }
                else{
                    world[i][j]=" ";
                }
            }
        }
        for(String[] i:world){
            for(String j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}