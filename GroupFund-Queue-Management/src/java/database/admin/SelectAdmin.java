/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.admin;

import database.customer.SelectCustomer;
import java.sql.SQLException;

/**
 *
 * @author Dell
 */
public class SelectAdmin extends SelectCustomer {

    public SelectAdmin() throws SQLException{
    }
    
    public boolean validate(String userId, String password) throws SQLException
    {
        String name = null, secretWord = null;
        try
        {
            // Construct the query.
            String searchQuery = "SELECT * FROM GROUPFUND.ADMIN WHERE USERID='" + userId + "'";
            // Execute the query.
            resultSet = statement.executeQuery(searchQuery);
            while (resultSet.next())
            {
                name = resultSet.getString(5);
                secretWord = resultSet.getString(6);
            }
        } catch (Exception e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
        if (name != null && secretWord != null)
        {
            if (name.equals(userId) && secretWord.equals(password))
            {
                setName(userId);
                setPassword(password);
                return true;
            }
        }
        return false;
    }
    
}
