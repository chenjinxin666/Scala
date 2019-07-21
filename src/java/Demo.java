package java;
//36个人搬36快转，没人刚好搬一次搬完。男人每人每次搬4块，女人每人每次半3 块。小孩两个人每次搬一块
public class Demo {
    public static void main(String[] args) {
        int manNum=0;
        int womanNum=0;
        for (int i =0;i<=9;i++ ){
            for (int j =0;j<12;j++){
                if (((i*4+j*3+(36-i-j)/2)==36) && ((36-i-j)%2==0)){
                    manNum=i;
                    womanNum=j;
                    System.out.println("男人的数量"+manNum);
                    System.out.println("女人的数量"+womanNum);
                    System.out.println("小孩的数量"+(36-manNum-womanNum));
                }
            }
        }
    }
}
