
public class HanoiTower{

    public static void towerofHanoi(int num_of_disk ,String src,String helper,String dest){
if(num_of_disk==1){
    System.out.println("tranfer disk " + num_of_disk + "from" + src + "to" +dest);
    return;
}
towerofHanoi(num_of_disk-1,src,dest,helper);
    System.out.println("tranfer disk" + num_of_disk + "from" + src + "to" +dest);
towerofHanoi(num_of_disk-1,helper,src,dest);

    }

    public static void main(String args[]){
        int num_of_disk=3;
        towerofHanoi(num_of_disk,"Src","Helper","Dest");
    }




}