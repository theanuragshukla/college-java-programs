import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.*;
class MyFrame implements ActionListener {
	Frame f;
	public void actionPerformed(ActionEvent e){
		Color c = getColor(e.getActionCommand().toString());
		f.setBackground(c);

	}
	Color getColor(String col) {
		Color color = null;
		switch (col.toLowerCase()) {
			case "black":
				color = Color.BLACK;
				break;
			case "darkgray":
				color = Color.DARK_GRAY;
				break;
			case "green":
				color = Color.GREEN;
				break;
			case "yellow":
				color = Color.YELLOW;
				break;
			case "magneta":
				color = Color.MAGENTA;
				break;
			case "orange":
				color = Color.ORANGE;
				break;
			case "white":
				color = Color.WHITE;
				break;
		}
		return color;
	}

	MyFrame (){
		String[] clrs = {"green",  "yellow", "white", "black", "darkgray", "Orange", "magneta"};
		Button[] btns = new Button[clrs.length];

		f = new Frame("hello");
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		f.setSize(400, 400);
		f.setBackground(getColor(clrs[(int)Math.floor(Math.random()*clrs.length)]));
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent w){
				System.exit(0);
			}
		});

		for(int i = 0; i< clrs.length; i++){
			Button b = new Button(clrs[i]);
			b.setBackground(getColor(clrs[(int)Math.floor(Math.random()*clrs.length)]));
			b.addActionListener(this);
			f.add(b);
			btns[i] = b;
		}


	}
}

class Hello {
	public static void main (String[] args){
		MyFrame f = new MyFrame();
	}
}
