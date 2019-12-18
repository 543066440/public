package fs;

/**
 * <p>Title: Book</p>
 * <p>Describe: TODO</p>
 * @author wangsp
 * @date 2019年4月19日
 */
public class Book
{
    String name;    //图书名称
    int id,price;    //图书编号和价格
    //空的构造方法
    private Book(){}
    //带两个参数的构造方法
    protected Book(String _name,int _id)
    {
        this.name=_name;
        this.id=_id;
    }
    //带可变参数的构造方法
    public Book(String...strings)throws NumberFormatException
    {
        if(0<strings.length)
            id=Integer.valueOf(strings[0]);
        if(1<strings.length)
            price=Integer.valueOf(strings[1]);
    }
    //输出图书信息
    public void print()
    {
        System.out.println("name="+name);
        System.out.println("id="+id);
        System.out.println("price="+price);
    }
	@Override
	public String toString() {
		return "Book [name=" + name + ", id=" + id + ", price=" + price + "]";
	}
    
    
}