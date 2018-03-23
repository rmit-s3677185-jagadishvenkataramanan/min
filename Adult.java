import java.util.ArrayList;

public class Adult extends User 
	//author jagadish
{
	//create list to add child details
    private ArrayList<Child> childID;
    public Adult(String name, String status, String image, int age)
    {
        this.name=name;
        this.status=status;
        this.image=image;
        this.age=age;
        this.friendList=new ArrayList<User>();
        childID=new ArrayList<Child>();
    }

    public void connectChild(Child child)
    {
        childID.add(child);
    }

    public void displayChildren()
    	//To display child parents
    {
        System.out.println("Following are the children of "+name);
        for (Child child: childID) {
            System.out.println(child.getName());
        }
    }



}
