package smk;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Read {

    public Read() throws SQLException {
        System.out.println("You selected option 2: Read database record");
        DisplayResults();
    }

    private void DisplayResults() throws SQLException {
        try {
            DBUtilities dbUtilities = new DBUtilities();

            String sql_stmt = "SELECT id, name, email, contact_number FROM contacts";
            ResultSet resultSet = dbUtilities.ReadRecords(sql_stmt);

            // process query results
            if (resultSet.next()) {

                ResultSetMetaData metaData = resultSet.getMetaData();
                int numberOfColumns = metaData.getColumnCount();
                System.out.print("Database Records Listingn");

                for (int i = 1; i <= numberOfColumns; i++) {
                    System.out.printf("%-8st", metaData.getColumnName(i));
                }
                System.out.println();

                do {
                    for (int i = 1; i <= numberOfColumns; i++) {
                        System.out.printf("%-8st", resultSet.getObject(i));
                    }
                    System.out.println();
                } while (resultSet.next());
                
                System.out.println();

            } else {
                System.out.println("No database records foundn");
            }

            //close db connection
            dbUtilities.DisconnectFromDB();
        } catch (SQLException ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        } finally {
            CodeBlogConsoleCRUD.DisplayMenu();
        }
    }
}

