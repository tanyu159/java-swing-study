/**
 * 数据模型类，用于存储在树的节点当中
 */
public class Goods {
    private String name;
    private double price;
    public Goods(String name,double price)
    {
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString()
    {
        //叶节点显示出来的内容，这里叶节点应当将商品名字
        return name;
    }
}
