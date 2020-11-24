package cn.itcast.day06;

public class ChangeArray {
    public static void main(String[] args) {
        ChangeArray changeArray=new ChangeArray();
        changeArray.changeArray();
        System.out.println("==================");
        changeArray.maximum();
    }
    public void changeArray(){
        int[] targetArr={10,39,58,4,32,324,423,42,454,367,767,8,786,453};
        for(int i=0;i<targetArr.length;i++){
            int min=i;
            int max=targetArr.length-1-i;
            int temp;
            if(max>min){
                temp=targetArr[min];
                targetArr[min]=targetArr[max];
                targetArr[max]=temp;
            }
        }
        for(int i=0;i<targetArr.length;i++){
            System.out.println(targetArr[i]);
        }
    }
    public void maximum(){
        int[] targetArray={231,3123,12313,12312,3131,435,364,57567,5786,7978978,0,57464,6464234,2342,3424};
        int max=targetArray[0];
        for (int i=1;i<targetArray.length;i++){
            if(targetArray[i]>max){
                max=targetArray[i];
            }
        }
        System.out.println(max);
    }
}
