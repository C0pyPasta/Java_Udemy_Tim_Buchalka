import java.sql.*;

//Basic SQL CRUD operations -> C reate R ead U pdate D elete
public class Main {
    //Constans (final keyword) in upper case
    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:C:\\Users\\visie-groep\\Desktop\\RutgerJava\\19_Databases\\TestDB\\" + DB_NAME;

    public static final String TABLE_CONTACTS = "contacts";

    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {
        //Try with resources - try(recourses here) { - is used because you need to close the database connection after you are done. If you use a try with recourses this will be done automatically
//        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\visie-groep\\Desktop\\RutgerJava\\19_Databases\\TestDB\\testjava.db");
//            Statement statement = conn.createStatement()){
//            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");



        try {
            Connection conn = DriverManager.getConnection(CONNECTION_STRING);
//            conn.setAutoCommit(false);
            Statement statement = conn.createStatement(); //Statement instance
            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);

            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                                  " (" + COLUMN_NAME + " text, " +
                                         COLUMN_PHONE + " integer, " +
                                         COLUMN_EMAIL + " text" +
                                  ")");

            insertContact(statement, "Tim", 6545678, "tim@email.com");
            insertContact(statement, "Joe", 45632, "joe@anywhere.com");
            insertContact(statement, "Jane", 4829484, "jane@somewhere.com");
            insertContact(statement, "Fido", 9038, "dog@email.com");

//            statement.execute("INSERT INTO " + TABLE_CONTACTS +
//                                  " (" + COLUMN_NAME + ", " +
//                                         COLUMN_PHONE + ", " +
//                                         COLUMN_EMAIL +
//                                  ")" +
//                                  "VALUES('Tim', 6545678, 'tim@email.com')"
//                                  );
//
//            statement.execute("INSERT INTO " + TABLE_CONTACTS +
//                    " (" + COLUMN_NAME + ", " +
//                    COLUMN_PHONE + ", " +
//                    COLUMN_EMAIL +
//                    ")" +
//                    "VALUES('Joe', 45632, 'joe@anywhere.com')"
//            );
//
//            statement.execute("INSERT INTO " + TABLE_CONTACTS +
//                    " (" + COLUMN_NAME + ", " +
//                    COLUMN_PHONE + ", " +
//                    COLUMN_EMAIL +
//                    ")" +
//                    "VALUES('Jane', 4829484, 'Jane@somewhere.com')"
//            );
//
//            statement.execute("INSERT INTO " + TABLE_CONTACTS +
//                    " (" + COLUMN_NAME + ", " +
//                    COLUMN_PHONE + ", " +
//                    COLUMN_EMAIL +
//                    ")" +
//                    "VALUES('Fido', 9038, 'dog@email.com')"
//            );

            statement.execute("UPDATE " + TABLE_CONTACTS + " SET " +
                    COLUMN_PHONE + "=5566789" +
                    " WHERE " + COLUMN_NAME + "='Jane'");

            statement.execute("DELETE FROM " + TABLE_CONTACTS +
                    " WHERE " + COLUMN_NAME + "='Joe'");

//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                                  "VALUES('Joe', 45632, 'joe@anywhere.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                                  "VALUES('Jane', 4829484, 'jane@somewhere.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                                  "VALUES('Fido', 9038, 'dog@email.com')");
            //Don't forget the WHERE clause or all phone fields WILL be updated!
//            statement.execute("UPDATE contacts SET phone=5566789 WHERE name='Jane'");
//            statement.execute("DELETE FROM contacts WHERE name='Joe'");

            //----------------------------------------------------------------------------------------------------------
//            statement.execute("SELECT * FROM contacts");
//            ResultSet result = statement.getResultSet();

            ResultSet result = statement.executeQuery("SELECT * FROM " + TABLE_CONTACTS);
            while(result.next()) {
                System.out.println(result.getString(COLUMN_NAME) + " " +
                                   result.getInt(COLUMN_PHONE) + " " +
                                   result.getString(COLUMN_EMAIL));
            }

            result.close();

            //Because we are not using a try block with resources here we need to close the statement and the db connection our selves
            //Keep in mind that the closing order is important!
            statement.close();
            conn.close();

        } catch(SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void insertContact(Statement statement, String name, int phone, String email) throws SQLException{
        statement.execute("INSERT INTO " + TABLE_CONTACTS +
                " (" + COLUMN_NAME + ", " +
                COLUMN_PHONE + ", " +
                COLUMN_EMAIL +
                ")" +
                "VALUES('" + name + "', "+ phone + ", '" + email + "')");
    }
}