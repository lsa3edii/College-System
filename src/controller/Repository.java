package controller;

import model.*;

public interface Repository {
    
    User user = new User();
    
    public boolean insert();
    public void update();
    public void delete();
    public boolean check(); 
    public String selectName();
    public boolean checkPassword();
}
