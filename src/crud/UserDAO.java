package crud;

import java.util.List;

public interface UserDAO {
	public boolean addUser( User user );
    public void deleteUser( int user );
    public void updateUser( User user );
    public List<User> getAllUsers();
    public User getStudentById( int userId );

}
