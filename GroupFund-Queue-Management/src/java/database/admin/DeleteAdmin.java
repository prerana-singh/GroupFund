/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.admin;

import database.UserExistsException;
import java.sql.SQLException;

/**
 * 
 * @author Dell
 */
public class DeleteAdmin extends InsertAdmin {

    public DeleteAdmin() throws SQLException {
    }
    
    void deleteBanker(String userId) throws SQLException, UserExistsException
    {
        String deleteQuery = "DELETE FROM GROUPFUND.ADMIN WHERE USERID = '" + userId + "'";
        if (!checkUser(userId))
        {
            statement.executeUpdate(deleteQuery);
        } else
        {
            throw new UserExistsException("User doesnt exist!");
        }
    }
    
}
