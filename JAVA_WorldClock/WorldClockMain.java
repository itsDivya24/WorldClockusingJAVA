import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.time.*;
import java.util.*;

class WorldClock
{
    public static void main (String [] rk)
     {
	Set <String> zones = ZoneId.getAvailableZoneIds();
	for(String s: zones)
	{
	       ZoneId z = ZoneId.of(s);
	       System.out.println(s + "\t" + z);
	}
	
     }
}


class WorldClockMain
{
     static public void main(String [] rk)
     {
	JFrame f = new JFrame();
	f.setSize(1150, 760);
	f.setLocationRelativeTo(null);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setResizable(false);

	JLabel l = new JLabel("Location of Mouse", JLabel.CENTER);
	f.add(l, BorderLayout.NORTH);
	l.setFont(new Font(Font.SERIF, 3, 36));
	
	JLabel jl = new JLabel(new ImageIcon("map.jpeg"));
	f.add(jl);

	class MyListener extends MouseAdapter
	{
		int x;
		int y, clicks;
	     public void mouseMoved(MouseEvent m)
	     {
		x = m.getX();
		y = m.getY();
		l.setText(x +", "+ y);
		 if((x>= 750 && x <=810) && (y<=480 && y >= 400))   //India
		{
			ZoneId z = ZoneId.of("Asia/Calcutta");
			LocalTime t = LocalTime.now(z);
			l.setText("Welcome to India. Time is: "+ t);
		}

	
		
	    else if((x>= 15 && x <=98) && (y<=280 && y >= 205))   //Us
		{
			ZoneId z = ZoneId.of("US/Arizona");
			LocalTime t = LocalTime.now(z);
			l.setText("Welcome to US. Time is: "+ t);
		}
		else if((x>= 900 && x <=1000) && (y<=600 && y >= 550))   //Australia
		{
			ZoneId z = ZoneId.of("Australia/Eucla");
			LocalTime t = LocalTime.now(z);
			l.setText("Welcome to Australia. Time is: "+ t);
		}

		/*else if((x>= 100 && x <=330) && (y<=342 && y >= 205)) //canada
		{
			ZoneId z = ZoneId.of("Canada/Central");
			LocalTime t = LocalTime.now(z);
			l.setText("Welcome to Canada. Time is: "+ t);
		}*/
		else if((x>= 800 && x <=900) && (y<=420 && y >= 370))   //china
		{
			ZoneId z = ZoneId.of("Asia/Shanghai");
			LocalTime t = LocalTime.now(z);
			l.setText("Welcome to China. Time is: "+ t);
		}
		else if((x>= 320 && x <=480) && (y<=275 && y >= 80))   //Greenland
		{
			ZoneId z = ZoneId.of("Asia/Calcutta");
			LocalTime t = LocalTime.now(z);
			l.setText("Welcome to Greenland. Time is: "+ t);
		}


		else if((x>= 185 && x <=236) && (y<=468 && y >= 50419))   //Mexico/General
		{
			ZoneId z = ZoneId.of("Mexico/General");
			LocalTime t = LocalTime.now(z);
			l.setText("Welcome to Mexico. Time is: "+ t);
		}

	

		else if((x>= 152 && x <=300) && (y<=422 && y >= 343))   //US/Central
		{
			ZoneId z = ZoneId.of("US/Central");
			LocalTime t = LocalTime.now(z);
			l.setText("Welcome to US/Central. Time is: "+ t);
		}

		
		else if((x>= 921 && x <=1134) && (y<=554 && y >= 309))   //Pacific/Eastern
		{
			ZoneId z = ZoneId.of("Pacific/Eastern");
			LocalTime t = LocalTime.now(z);
			l.setText("Welcome to Eastern Pacific. Time is: "+ t);
		}
		

		else if((x>= 970 && x <=1055) && (y<=287 && y >= 180))   //Asia/Srednekolymsk
		{
			ZoneId z = ZoneId.of("Asia/Srednekolymsk");
			LocalTime t = LocalTime.now(z);
			l.setText("Welcome to Srednekolymsk. Time is: "+ t);
		}

                else if((x>= 790 && x <=860) && (y<=333 && y >= 120))   //Asia/Krasnoyarsk
		{
			ZoneId z = ZoneId.of("Asia/Krasnoyarsk");
			LocalTime t = LocalTime.now(z);
			l.setText("Welcome to Krasnoyarsk. Time is: "+ t);
		}
                else if((x>= 860 && x <=910) && (y<=336 && y >= 240))   //Asia/Irkutsk 
		{
			ZoneId z = ZoneId.of("Asia/Irkutsk");
			LocalTime t = LocalTime.now(z);
			l.setText("Welcome to Irkutsk. Time is: "+ t);
		}
                else if((x>= 860 && x <=970) && (y<=365 && y >= 170))   //Ust-Nera
		{
			ZoneId z = ZoneId.of("Asia/Yakutsk");
			LocalTime t = LocalTime.now(z);
			l.setText("Welcome to Ust-Nera. Time is: "+ t);
		}
                else if((x>= 1055 && x <=1124) && (y<=330 && y >= 207))   //Asia/Kamchatka
		{
			ZoneId z = ZoneId.of("Asia/Kamchatka");
			LocalTime t = LocalTime.now(z);
			l.setText("Welcome to Kamchatka. Time is: "+ t);
		}                
		else if((x>= 624 && x <=790) && (y<=360 && y >= 170))   //Europe/Moscow
		{
			ZoneId z = ZoneId.of("Europe/Moscow");
			LocalTime t = LocalTime.now(z);
			l.setText("Welcome to Moscow. Time is: "+ t);
		}
                else if((x>= 350 && x <=370) && (y<=350 && y >= 325))   //Canada/Newfoundland
		{
			ZoneId z = ZoneId.of("Canada/Newfoundland");
			LocalTime t = LocalTime.now(z);
			l.setText("Welcome to Canada. Time is: "+ t);
		}
                else if((x>= 335 && x <=322) && (y<=330 && y >= 280))   //Canada/Atlantic
		{
			ZoneId z = ZoneId.of("Canada/Atlantic");
			LocalTime t = LocalTime.now(z);
			l.setText("Welcome to Canada. Time is: "+ t);
		}
                else if((x>= 195 && x <=260) && (y<=340 && y >= 170))   //Canada/Central  
		{
			ZoneId z = ZoneId.of("Canada/Central");
			LocalTime t = LocalTime.now(z);
			l.setText("Welcome to Canada. Time is: "+ t);
		}
                else if((x>= 260 && x <=335) && (y<=360 && y >= 165))   //Canada/Eastern
		{
			ZoneId z = ZoneId.of("Canada/Eastern");
			LocalTime t = LocalTime.now(z);
			l.setText("Welcome to Canada. Time is: "+ t);
		}
        	else if((x>= 100 && x <=160) && (y<=340 && y >= 200))   //Canada/Pacific
		{
			ZoneId z = ZoneId.of("Canada/Pacific");
			LocalTime t = LocalTime.now(z);
			l.setText("Welcome to Canada. Time is: "+ t);
		}
                else if((x>= 160 && x <=195) && (y<=340 && y >= 155))   //Canada/Mountain
		{
			ZoneId z = ZoneId.of("Canada/Mountain");
			LocalTime t = LocalTime.now(z);
			l.setText("Welcome to Canada. Time is: "+ t);
		}
		else if((x>= 312 && x <=428) && (y<=610 && y >= 511))   //Brazil
		{
			ZoneId z = ZoneId.of("Brazil/West");
			LocalTime t = LocalTime.now(z);
			l.setText("Welcome to Brazil. Time is: "+ t);
		}

		else if((x>= 532 && x <=615) && (y<=370 && y >= 312))   //Europe/London
		{
			ZoneId z = ZoneId.of("Europe/London");
			LocalTime t = LocalTime.now(z);
			l.setText("Welcome to Europe. Time is: "+ t);
		}

		else if((x>= 529 && x <=666) && (y<=619 && y >= 395))   //Africa
		{
			ZoneId z = ZoneId.of("Africa/Cairo");
			LocalTime t = LocalTime.now(z);
			l.setText("Welcome to Africa. Time is: "+ t);
		}

		else if((x>= 316 && x <=345) && (y<=704 && y >= 615))   //Argentina
		{
			ZoneId z = ZoneId.of("America/Argentina/Catamarca");
			LocalTime t = LocalTime.now(z);
			l.setText("Welcome to Argentina. Time is: "+ t);
		}

		else if((x>= 201 && x <=232) && (y<=468 && y >= 432))   //Mexico
		{
			ZoneId z = ZoneId.of("Mexico/BajaSur");
			LocalTime t = LocalTime.now(z);
			l.setText("Welcome to Mexico. Time is: "+ t);
		}
		
	     }
	    public void mouseClicked(MouseEvent m)
	    {
		clicks = m.getClickCount();
		System.out.println("Clicked");
		System.out.println(clicks + " times clicked");
                      }
	    public void mousePressed(MouseEvent m)
	    {
		System.out.println("Pressed");	
                      }
	    public void mouseReleased(MouseEvent m)
	    {
		System.out.println("Released");
		
                      }
	}

	MyListener ml = new MyListener();
	f.addMouseMotionListener(ml);
	f.addMouseListener(ml);
	f.setVisible(true);
     }
}
