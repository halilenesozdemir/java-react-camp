public class Category {
    int id;
    String name;
    int order;
    String description;

    public Category(){
        System.out.println("Ben calistim!");
    }

    public Category(int id,String name,int order,String description){
        this();
        this.id = id;
        this.name = name;
        this.order = order;
        this.description = description;
    };


}