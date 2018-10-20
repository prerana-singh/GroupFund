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
public class InsertAdmin extends SelectAdmin {

    public InsertAdmin() throws SQLException {
    }
    
    
     public void setData(String accountName, int countryCode, int stateCode, int branchCode, String userId, String password) throws SQLException, UserExistsException
    {
        String insertQuery = "INSERT INTO ADMIN VALUES ('" + accountName + "', " + countryCode + "," + stateCode + "," + branchCode +",'" + userId + "', '" + password + " ' )";
        if (!checkUser(userId))
        {
            throw new UserExistsException("User already exists.");
        } else
        {
            statement.executeUpdate(insertQuery);
        }
    }
     
     
     protected boolean checkUser(String userId) throws SQLException
    {
        String searchQuery = "SELECT * FROM ADMIN WHERE USERID = '" + userId + "'";
        resultSet = statement.executeQuery(searchQuery);
        if (resultSet.next())
        {
            return false;
        }
        return true;
    }
    
}
