package Model;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(){}
    public Triangle(double a,double b,double c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    /**
     * 模型自己的方法
     * @return
     */
    public String getArea()
    {
        //计算前应该判定是否是三角形，这里省略了
        //利用海伦公式求面积
        double p=(a+b+c)/2.0;
        double area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return String.valueOf(area);
    }
}
