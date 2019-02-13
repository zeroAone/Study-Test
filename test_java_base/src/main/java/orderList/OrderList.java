package orderList;

public class OrderList {
    static final int max=100;
    private SLType slType=new SLType();
     class Data{
        String key;
        String name;
        int age;
    }
     class SLType{
        Data[]  listData=new   Data[max];
        int listLen;
    }
    public void initData(){
        slType.listLen=0;
    }
    public int getLen(){
        return slType.listLen;
    }
    public int insertData(Data data){
        slType.listData[++slType.listLen]=data;
        return 1;
    }
}
