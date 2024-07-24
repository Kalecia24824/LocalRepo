package crud.data; 

import java.sql.*; 

//database connection cleanup: close, prepared and result sets
public class DBUtil {
    public static void closeStatement(Statement s) {
        try {
            if (s != null) {
                s.close(); 
            } //end of if 
        } //end of try

        catch (SQLException e) {
            System.out.println(e);
        } //end of catch 

    } //end of closeStatement 

    public static void closePreparedStatement(Statement ps) {
        try {
            if (ps != null) {
                ps.close(); 
            } //end of if 
        } //end of try

        catch (SQLException e) {
            System.out.println(e);
        } //end of catch 

    } //end of closePreparedStatement

    public static void closeResultSet (ResultSet rs) {
        try {
            if (rs != null) {
                rs.close(); 
            } //end of if 
        } //end of try

        catch (SQLException e) {
            System.out.println(e);
        } //end of catch 

    } //end of closeResultSet

} //end of DBUtil 