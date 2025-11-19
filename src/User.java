public class User
{
    public int c_id;
    public String c_nam;
    public String address;

    public User(String name, int i){
        c_id = i;
        if(name.length() < 0 || name.length() > 100) // Testing length
        {
            return; //If string is invalid, we dont try to store it
        }
        c_nam = name;
    }

    public void setC_nam(String n)
    {
        if(n.length() < 0)
        {
            return; //If string is invalid, we dont try to store it
        }
        c_nam = n;
    }

    public void setAddress(String address)
    {
      this.address = address;
    }

    public int getId(){ return c_id; }

    public String getName(){ return c_nam; }

    public String getAddress(){ return "STREETNAME"; }

    @Override
    public boolean equals(Object o){
        if(o instanceof User u){
            return u.c_nam == c_nam;
        }
        return false;
    }
}
