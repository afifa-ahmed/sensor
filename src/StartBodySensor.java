import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;
public class StartBodySensor extends JFrame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JPanel p1,p2,p3,p4;
	JLabel imgl1=new JLabel();
	JLabel imgl2=new JLabel();
	JLabel imgl3=new JLabel();
	JLabel imgl4=new JLabel();
	JLabel imgl5=new JLabel();
	JLabel imgl6=new JLabel();
	JLabel imgl7=new JLabel();
	JLabel imgl8=new JLabel();
	JLabel imgl9=new JLabel();
	JLabel imgl10=new JLabel();
	JLabel imgl11=new JLabel();
	JLabel imgl12=new JLabel();


	JLabel routerl1=new JLabel();
	JLabel routerl2=new JLabel();
	JLabel routerl3=new JLabel();
	JLabel routerl4=new JLabel();
	JLabel routerl5=new JLabel();

	JLabel BTl1=new JLabel();
	JLabel BTl2=new JLabel();
	JLabel BTl3=new JLabel();

	JLabel tower1=new JLabel();
	JLabel man=new JLabel();
	JLabel tower2=new JLabel();
	JLabel tower3=new JLabel();
	JLabel arrow=new JLabel();


	JLabel routerlebel1;
	JLabel routerlebel2;
	JLabel routerlebel3;
	JLabel routerlebel4;

	JLabel sensor;
	JLabel router;
	JLabel bluetooth;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	JTextField t1,t2,t3,t4;
	JLabel label1,label2,label3,label4,senseman;

	JButton button,bs;
	ImageIcon icon44;

	Timer timer;
	JLabel sd;
	JLabel towerdown;

	public StartBodySensor() 
	{

		setTitle("SPOC: A Secure and Privacy preserving Opportunistic Computing Framework for Mobile-Healthcare Emergency");
		p1=new JPanel();
		p1.setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		p2=new JPanel();
		p2.setLayout(null);

		p3=new JPanel();
		p3.setLayout(null);

		p4=new JPanel();
		p4.setLayout(null);



		ImageIcon icon=new ImageIcon(this.getClass().getResource("BlackNode.png"));
		ImageIcon icon1=new ImageIcon(this.getClass().getResource("BlackRouter.png"));
		ImageIcon icon2=new ImageIcon(this.getClass().getResource("BlackBlueTooth.png"));
		ImageIcon icon3=new ImageIcon(this.getClass().getResource("tower1.png"));
		ImageIcon icon4=new ImageIcon(this.getClass().getResource("man.png"));
		ImageIcon icon5=new ImageIcon(this.getClass().getResource("tower2.png"));
		ImageIcon icon6=new ImageIcon(this.getClass().getResource("tower3.png"));
		ImageIcon icon7=new ImageIcon(this.getClass().getResource("BlackArrow.png"));


		imgl1.setIcon(icon);

		imgl2.setIcon(icon);
		imgl3.setIcon(icon);
		imgl4.setIcon(icon);
		imgl5.setIcon(icon);
		imgl6.setIcon(icon);
		imgl7.setIcon(icon);
		imgl8.setIcon(icon);
		imgl9.setIcon(icon);
		imgl10.setIcon(icon);
		imgl11.setIcon(icon);
		imgl12.setIcon(icon);

		routerl1.setIcon(icon1);
		routerl2.setIcon(icon1);
		routerl3.setIcon(icon1);
		routerl4.setIcon(icon1);
		routerl5.setIcon(icon1);

		BTl1.setIcon(icon2);
		BTl2.setIcon(icon2);
		BTl3.setIcon(icon2);

		tower1.setIcon(icon3);
		man.setIcon(icon4);
		tower2.setIcon(icon5);
		tower3.setIcon(icon6);
		arrow.setIcon(icon7);

		l1=new JLabel("S1");
		l2=new JLabel("S2");
		l3=new JLabel("S3");
		l4=new JLabel("S4");
		l5=new JLabel("S5");
		l6=new JLabel("S6");
		l7=new JLabel("S7");
		l8=new JLabel("S8");
		l9=new JLabel("S9");
		l10=new JLabel("S10");
		l11=new JLabel("S11");



		senseman=new JLabel();


		timer = new Timer(0, null);



		routerlebel1=new JLabel("BCr1");
		routerlebel2=new JLabel("BCr2");
		routerlebel3=new JLabel("BCr3");
		routerlebel4=new JLabel("BCr4");


		imgl1.setBounds(10, 300, 80, 50);


		imgl2.setBounds(110,150, 80, 50);
		imgl3.setBounds(110,420, 80, 50);
		imgl4.setBounds(200,380, 80, 50);
		imgl5.setBounds(250,300, 80, 50);
		imgl6.setBounds(220,120, 80, 50);
		imgl7.setBounds(360,350, 80, 50);
		imgl8.setBounds(280,450, 80, 50);
		imgl9.setBounds(430,400, 80, 50);
		imgl10.setBounds(530,300, 80, 50);
		imgl11.setBounds(350,110, 80, 50);


		l1.setBounds(20, 330, 80, 50);
		l2.setBounds(120,175, 80, 50);
		l3.setBounds(120,445, 80, 50);
		l4.setBounds(210,405, 80, 50);
		l5.setBounds(260,325, 80, 50);
		l6.setBounds(230,145, 80, 50);
		l7.setBounds(370,375, 80, 50);
		l8.setBounds(290,475, 80, 50);
		l9.setBounds(440,425, 80, 50);
		l10.setBounds(540,325, 80, 50);
		l11.setBounds(360,135, 80, 50);

		routerl1.setBounds(120, 280, 100, 80);
		routerl2.setBounds(280, 80, 100, 80);
		routerl3.setBounds(300, 220, 100, 80);
		routerl4.setBounds(500, 180, 100, 80);


		routerlebel1.setBounds(130, 310, 100, 80);
		routerlebel2.setBounds(300, 250, 100, 80);
		routerlebel3.setBounds(280, 110, 100, 80);
		routerlebel4.setBounds(500, 220, 100, 80);


		BTl1.setBounds(160, 250, 100, 50);
		BTl2.setBounds(360, 270, 100, 50);

		tower1.setBounds(650, 100, 200, 250);


		JLabel towerup=new JLabel("Home Health Gateway");
		towerup.setFont(new java.awt.Font("Arial", 3, 18));
		towerup.setForeground(new java.awt.Color(100, 50, 235));
		towerup.setBounds(640, 60, 200, 30);
		towerdown=new JLabel("Details status");




		towerdown.setFont(new java.awt.Font("Arial", 3, 14));
		towerdown.setForeground(new java.awt.Color(100, 50, 150));
		towerdown.setBounds(700, 350, 200, 40);






		JLabel label=new JLabel("Start Sensing");
		label.setFont(new java.awt.Font("Arial", 3, 35));
		label.setForeground(new java.awt.Color(250, 50, 135));
		label.setBounds(100, 520, 500, 40);

		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		t4=new JTextField(10);

		label1=new JLabel("BP");
		label2=new JLabel("Sugar");
		label3=new JLabel("Heart Beat");
		label4=new JLabel("Body Temp");

		t1.setBounds(20, 30, 100, 25);
		t2.setBounds(20, 100, 100, 25);
		t3.setBounds(20, 180, 100, 25);
		t4.setBounds(20, 260, 100, 25);

		label1.setBounds(20, 0, 80, 30);
		label2.setBounds(20, 70, 80, 30);
		label3.setBounds(20, 150, 80, 30);
		label4.setBounds(20, 230, 80, 30);


		// p2.setBackground(new java.awt.Color(100, 100, 100));
		p2.setBorder(new javax.swing.border.EtchedBorder());

		p2.setBounds(840, 0, 300, 300);
		p2.add(t1);
		p2.add(t2);
		p2.add(t3);
		p2.add(t4);
		p2.add(label1);
		p2.add(label2);
		p2.add(label3);
		p2.add(label4);	


		p3.setBounds(840, 305, 300, 250);
		p3.setBorder(new javax.swing.border.EtchedBorder());



		imgl12.setBounds(20, 10, 80, 50);
		routerl5.setBounds(20, 100, 100, 50);
		BTl3.setBounds(20, 180, 100, 50);

		sensor=new JLabel("Sensor");
		router=new JLabel("BackBone Router");
		bluetooth=new JLabel("Bluetooth");

		sensor.setBounds(20, 40, 80, 50);
		router.setBounds(10, 130, 100, 50);
		bluetooth.setBounds(20, 210, 100, 50);


		p3.add(imgl12);
		p3.add(routerl5);
		p3.add(BTl3);


		p3.add(sensor);
		p3.add(router);
		p3.add(bluetooth);

		p4.setBounds(0, 560, 1100, 500);
		p4.setBorder(new javax.swing.border.EtchedBorder());

		button=new JButton("Send to Hcc");
		button.setBounds(500, 10, 120, 30);


		bs=new JButton("Start Body Sensing");
		bs.setBounds(400, 10, 220, 30);


		man.setBounds(20, -30, 200, 200);
		JLabel manlabel=new JLabel("Human Body");
		manlabel.setBounds(20, -0, 100, 40);
		manlabel.setForeground(new java.awt.Color(50, 50, 125));
		manlabel.setFont(new java.awt.Font("Arial", 3, 15));

		tower2.setBounds(880, -30, 200, 200);
		JLabel tower2label=new JLabel("HCC");
		tower2label.setBounds(830, 0, 100, 40);
		tower2label.setFont(new java.awt.Font("Arial", 3, 25));
		tower2label.setForeground(new java.awt.Color(50, 50, 222));

		tower3.setBounds(150, -0, 200, 150);
		JLabel tower3label=new JLabel("Home Health Gateway");
		tower3label.setBounds(140, 0, 250, 40);
		tower3label.setFont(new java.awt.Font("Arial", 3, 20));
		tower3label.setForeground(new java.awt.Color(100, 50, 60));

		arrow.setBounds(450, 50, 400, 100);

		p4.add(manlabel);
		p4.add(man);
		// p4.add(button); 
		p4.add(tower2);
		p4.add(tower2label);
		p4.add(tower3);
		p4.add(tower3label);
		p4.add(arrow);

		p1.add(p2);
		p1.add(p3);
		p1.add(p4);
		// p1.add(bs);



		p1.add(imgl1);
		p1.add(imgl2);
		p1.add(imgl3);
		p1.add(imgl4);
		p1.add(imgl5);
		p1.add(imgl6);
		p1.add(imgl7);
		p1.add(imgl8);
		p1.add(imgl9);
		p1.add(imgl10);
		p1.add(imgl11);

		p1.add(l1);
		p1.add(l2);
		p1.add(l3);
		p1.add(l4);
		p1.add(l5);
		p1.add(l6);
		p1.add(l7);
		p1.add(l8);
		p1.add(l9);
		p1.add(l10);
		p1.add(l11);

		p1.add(routerl1);
		p1.add(routerl2);
		p1.add(routerl3);
		p1.add(routerl4);

		p1.add(routerlebel1);
		p1.add(routerlebel2);
		p1.add(routerlebel3);
		p1.add(routerlebel4);

		p1.add(BTl1);
		p1.add(BTl2);
		p1.add(tower1);
		p1.add(towerdown);
		p1.add(label);
		p1.add(towerup);
		add(p1);

		setSize(980, 720);
		setVisible(true);

		button.addActionListener(this);
		bs.addActionListener(this);

		start();
		this.dispose();
	}

	public void start()
	{
		try
		{

			Thread.sleep(500);
			icon44=new ImageIcon(this.getClass().getResource("senseman.png"));
			man.setIcon(icon44);
			man.setBounds(20, -30, 200, 200);


			Thread.sleep(500);
			ImageIcon icon=new ImageIcon(this.getClass().getResource("GreenNode.png"));
			imgl1.setIcon(icon);
			imgl1.setBounds(10, 300, 80, 50);


			Thread.sleep(500);
			ImageIcon icon11=new ImageIcon(this.getClass().getResource("GreenNode.png"));
			imgl5.setIcon(icon11);
			imgl5.setBounds(250,300, 80, 50);

			Thread.sleep(500);
			ImageIcon icon14=new ImageIcon(this.getClass().getResource("GreenNode.png"));
			imgl6.setIcon(icon14);
			imgl6.setBounds(220,120, 80, 50);

			Thread.sleep(500);
			ImageIcon icon12=new ImageIcon(this.getClass().getResource("GreenNode.png"));
			imgl10.setIcon(icon12);
			imgl10.setBounds(530,300, 80, 50);

			Thread.sleep(500);
			ImageIcon icon111=new ImageIcon(this.getClass().getResource("GreenNode.png"));
			imgl11.setIcon(icon111);
			imgl11.setBounds(360,110, 80, 50);
			
			Thread.sleep(500);
			ImageIcon icon2=new ImageIcon(this.getClass().getResource("GreenBlueTooth.png"));
			BTl2.setIcon(icon2);
			BTl2.setBounds(360, 270, 100, 50);
			
			Thread.sleep(500);
			ImageIcon icon1=new ImageIcon(this.getClass().getResource("GreenRouter.png"));
			routerl1.setIcon(icon1);
			routerl1.setBounds(120, 280, 100, 80);
			
			Thread.sleep(500);
			ImageIcon icon13=new ImageIcon(this.getClass().getResource("GreenRouter.png"));
			routerl4.setIcon(icon13);
			routerl4.setBounds(500, 180, 100, 80);

			Thread.sleep(500);

			towerdown.setText("SENSOR DETAILS ARRIVED");
			towerdown.setBounds(650, 350, 300, 40);



			Thread.sleep(500);

			int temp = numInRange(50, 250);
			String bp = Paillier.encrypt(String.valueOf(temp));
			t1.setText(bp);
			System.out.println(bp + " : " + String.valueOf(temp));
			Thread.sleep(500);

			String sugar=Paillier.encrypt(String.valueOf(temp = numInRange(50, 350)));
			t2.setText(sugar);
			System.out.println(String.valueOf(temp));
			Thread.sleep(500);


			String hb=Paillier.encrypt(String.valueOf(temp = numInRange(50, 250)));
			t3.setText(hb);

			System.out.println(String.valueOf(temp));
			Thread.sleep(500);


			String bt=Paillier.encrypt(String.valueOf(temp = numInRange(96, 105)));
			t4.setText(bt);
			System.out.println(String.valueOf(temp));
			String pname = JOptionPane.showInputDialog(null, "Please Enter the Patient Name");

			while (pname == null || (pname != null && ("".equals(pname))))   
			{
				pname = JOptionPane.showInputDialog(null, "Please Enter the Patient Name");
			}


			Thread.sleep(500);
			ImageIcon icon7=new ImageIcon(this.getClass().getResource("GreenArrow.png"));
			arrow.setIcon(icon7);
			arrow.setBounds(450, 50, 400, 100);


			//			java.util.Date td = new java.util.Date();
			//			SimpleDateFormat sdf = new SimpleDateFormat ( "dd/MM/yyyy" );
			//			String dt = sdf.format ( td ).toString();
			//
			//			String rep="Waiting";
			//			String soln="No";
			//
			//			Class.forName("com.mysql.jdbc.Driver");
			//
			//			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
			//
			//
			//			Paillier dec=new Paillier();
			//
			//			Statement stmt = con.createStatement();
			//			String query = "insert into SensorDetails(PName,bp,sugar,hb,bt,dt,status,solution) values('"+pname+"',
			//			'"+dec.decrypt(t1.getText())+"','"+dec.decrypt(t2.getText())+"','"+dec.decrypt(t3.getText())+"',
			//			'"+dec.decrypt(t4.getText())+"','"+dt+"','"+rep+"','"+soln+"')";	
			//			stmt.executeUpdate(query);


			URL url = new URL("http://localhost:8082/EmergencyRescueSystem/UpdateSensorData?pname="+pname+"&bp="+t1.getText()+""
					+ "&sugar="+t2.getText()+"&hb="+t3.getText()+"&bt="+t4.getText());
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			System.out.println("Response from API: "+con.getResponseCode());

			if (con.getResponseCode() == 200)
				JOptionPane.showMessageDialog(null, "Sensor Data Updated Successfully");
			else 
				JOptionPane.showMessageDialog(null, "Some Issue in data updation");

		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}

	}


	private int numInRange(int min, int max) {
		int num = -1;
		Random r=new Random();
		do {
			num =r.nextInt(max);
		} while (num <= min || num >= max);
		return num;
	}

	public void actionPerformed(ActionEvent ae)
	{

		if(ae.getSource()==button)
		{
			JOptionPane.showMessageDialog(this, "Data Transfered To HCC");
		}

		if(ae.getSource()==bs)
		{

			/* try
		 {

		 Thread.sleep(500);
		 icon44=new ImageIcon(this.getClass().getResource("senseman.png"));
		 man.setIcon(icon44);
		 man.setBounds(20, -30, 200, 200);


		 Thread.sleep(500);
		 ImageIcon icon=new ImageIcon(this.getClass().getResource("GreenNode.png"));
		 imgl1.setIcon(icon);
		 imgl1.setBounds(10, 300, 80, 50);



		 }
		 catch(Exception ex)
		 {
			 System.out.println(ex);
		 }*/




		}


	}


	public static void main(String[] args) {
		while (true)
			new StartBodySensor();



	}	



}