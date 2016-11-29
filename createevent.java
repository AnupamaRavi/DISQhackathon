import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.sql.*;
public class createevent extends Applet
{
    TextField name,pass;
    Button b1,b2;
    public void init()
    {
        Label n=new Label("EventName:",Label.CENTER);
        Label p=new Label("Rules:",Label.CENTER);
        name=new TextField(20);
        pass=new TextField(1000);
        pass.setEchoChar('$');
        b1=new Button("submit");
        b2=new Button("cancel");
        add(n);
        add(name);
        add(p);
        add(pass);
        add(b1);
        add(b2);
        n.setBounds(70,90,90,60);
        p.setBounds(70,130,90,60);
        name.setBounds(280,100,90,20);
        pass.setBounds(200,140,90,20);
        b1.setBounds(100,260,70,40);
        b2.setBounds(180,260,70,40);
 
 
    }
	public static void main(String g[])
{ createevent stu=new createevent();
 stu.setVisible(true);
 try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(""jdbc:mysql://127.0.0.1:3306/disq",""sastra123"",""sastra123""); 
//192.168.72.111
Statement stmt=con.createStatement();  
PreparedStatement pstmt;
 pstmt=con.prepareStatement("insert into test values(?)"); 
con.close();  
}catch(Exception e){ System.out.println(e);
                      e.printStackTrace();
}  
}  
 
 
 
}

