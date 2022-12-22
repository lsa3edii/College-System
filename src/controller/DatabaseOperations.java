package controller;

public class DatabaseOperations {
    
    Repository repo;
    
    public DatabaseOperations() {
        //
    }
    
    public void setType(Repository repo) {
        this.repo = repo;
    }
            
    public boolean insert() {
        if(repo.insert())
            return true;
        return false;
    }
    
    public void update() {
        repo.update();
    }
    
    public void delete() {
        repo.delete();
    }
    
    public boolean checkLogin() {
        if(repo.check())
            return true;
        return false;
    }
            
}
