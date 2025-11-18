import java.util.ArrayList;

public class UserList
{
    public ArrayList<User> users = new ArrayList<User>();

    public void addUser(User user)
    {
        this.users.add(user);
        if(user == null)
        {
            return;
        }
    }

    public ArrayList<User> getUsers()
    {
        return this.users;
    }
}
