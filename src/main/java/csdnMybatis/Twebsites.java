
package csdnMybatis;

public class  Twebsites {
    private int id;
    private String name;

//可以通过IDEA 的快捷键自动生成下面的get set  快捷键就是alt +insert  选择，get and set
    public int getId(){ return id;}
    public void setId(int id){this.id=id;}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
