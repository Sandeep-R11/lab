LAB6(1)
import java.util.*;  
public class Example1 {  
  public static void main(String args[]){  
   // Create a tree map
   TreeMap<Integer,String> tree_map=new TreeMap<Integer,String>();      
  // Put elements to the map 
  tree_map.put(1, "Red");
  tree_map.put(2, "Green");
  tree_map.put(3, "Black");
  tree_map.put(4, "White");
  tree_map.put(5, "Blue");
    
   for (Map.Entry<Integer,String> entry : tree_map.entrySet())
   {
    System.out.println(entry.getKey() + "=>" + entry.getValue());
   }
}



LAB6(2)
import java.util.*;
public class DoublyLinkedListDemo {
    public static void main(String[] args) {
        int i,ch,element,position;
        LinkedList<Integer> dblList = new LinkedList<Integer>();
        System.out.println("1.Insert element at begining");
        System.out.println("2.Insert element at end");
        System.out.println("3.Insert element at position");
        System.out.println("4.Delete a given element");
        System.out.println("5.Display elements in the list");
        System.out.println("6.Exit");
        Scanner sc=new Scanner(System.in);
        do {
            System.out.print("Choose your choice(1 - 6) :");
            ch=sc.nextInt();
            switch(ch) {
                case 1: // To read element form the user
                        System.out.print("Enter an element to insert at begining : ");
                        element=sc.nextInt();
                        // to add element to doubly linked list at begining
                        dblList.addFirst(element);
                        System.out.println("Successfully Inserted");
                        break;
                case 2: // To read element form the user
                        System.out.print("Enter an element to insert at end : ");
                        element=sc.nextInt();
                        // to add element to doubly linked list at end
                        dblList.addLast(element);
                        System.out.println("Successfully Inserted");
                        break;
                case 3: // To read position form the user
                        System.out.print("Enter position  to insert element : ");
                        position=sc.nextInt();
                        // checks if the position is lessthan or equal to list size.
                        if(position<=dblList.size()) {
                            // To read element
                            System.out.print("Enter element : ");
                            element=sc.nextInt();
                            // to add element to doubly linked list at given position
                            dblList.add(position,element);
                            System.out.println("Successfully Inserted");
                        }
                        else {
                            System.out.println("Enter the size between 0 to"+dblList.size());
                        }
                        break;
                case 4:    // To read element form the user to remove
                        System.out.print("Enter element to remove : ");
                        Integer ele_rm;
                        ele_rm=sc.nextInt();
                        if (dblList.contains(ele_rm)){
                            dblList.remove(ele_rm);
                            System.out.println("Successfully Deleted");
                            Iterator itr=dblList.iterator(); 
                            System.out.println("Elements after deleting :"+ele_rm);
                            while(itr.hasNext()) {  
                                System.out.print(itr.next()+"<->"); 
                            }
                            System.out.println("NULL"); 
                        }
                        else {
                            System.out.println("Element not found");
                        }
                        break;
        
                case 5:    // To Display elements in the list
                        Iterator itr=dblList.iterator(); 
                        System.out.println("Elements in the list :");
                        while(itr.hasNext()) {  
                            System.out.print(itr.next()+"<->"); 
                        }
                        System.out.println("NULL");
                        break;

                case 6:    System.out.println("Program terminated");
                        break;
                default:System.out.println("Invalid choice");
            }
        }
        while(ch!=6);
    }
}


LAB6(3)
import java.io.*;
import java.util.Enumeration;
import java.util.Hashtable;
  
// Main class
// EnumerationOnKeys
public class GFG {
  
    // Main driver method
    public static void main(String[] args)
    {
        // Creating an empty hashtable
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
  
        // Inserting key-value pairs into hash table
        // using put() method
        ht.put(1, "Geeks");
        ht.put(2, "for");
        ht.put(3, "Geeks");
  
        // Now creating an Enumeration object
        //  to read elements
        Enumeration e = ht.elements();
  
        // Condition holds true till there is
        // single key remaining
  
        // Printing elements of hashtable
        // using enumeration
        while (e.hasMoreElements()) {
  
            // Printing the current element
            System.out.println(e.nextElement());
        }
    }
}
LAB6(4)
import java.util.*;
public class VectorExample
{

	public static void main(String[] args) 
	{
		Vector fruits = new Vector();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Pineapple");
		fruits.remove("Apple");
		System.out.println(fruits);
		for(Iterator it = fruits.iterator(); it.hasNext();)
                {
			System.out.println(it.next());
                }
			fruits.setElementAt("Melon", 2);
			System.out.println(fruits);
			

	}

}
LAB6(5)
import java.util.*;

public class HashMapExample 
{

	public static void main(String[] args) 
	{
		HashMap hm = new HashMap();
		hm.put("bags",new Integer(1600));
		hm.put("Wallet",new Integer(700));
		hm.put("Belt",new Integer(600));
		Set set = hm.entrySet();
		for(Iterator i = set.iterator();i.hasNext();)
		{
			Map.Entry me = (Map.Entry)i.next();
			System.out.println(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println("Size of hash map is :" + hm.size());
		System.out.println(hm.isEmpty());
	}
}

LAB7(1)
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
    
class P1 extends JFrame implements ActionListener 
{
        JFrame actualWindow;
        JPanel container;
        JTextField txt_num1, txt_num2, txt_result;
        JLabel x,y,z;
        JButton btn_div;
        P1()
        {
            actualWindow = new JFrame("Division");
            container = new JPanel();
            container.setLayout(new FlowLayout());
            txt_num1 = new JTextField(20);
            txt_num2 = new JTextField(20);
            txt_result = new JTextField(20);
            x=new JLabel("Num 1:");
            y=new JLabel("Num 2:");
            z=new JLabel("Result:");
            btn_div = new JButton("Divide");
            btn_div.addActionListener(this);           
            container.add(x);
            container.add(txt_num1);
            container.add(y);
            container.add(txt_num2);
            container.add(z);
            container.add(txt_result);
            container.add(btn_div);
            actualWindow.add(container);
            actualWindow.setSize(300, 300);
            actualWindow.setVisible(true);
        }
        public void actionPerformed(ActionEvent e)
        {
            int num1, num2;
            try 
            {
                num1 = Integer.parseInt(txt_num1.getText());
                num2 = Integer.parseInt(txt_num2.getText());
                txt_result.setText(num1/num2+"");
            }
            catch(NumberFormatException nfe) 
            {
                JOptionPane.showMessageDialog(actualWindow,"Please do enter only integers");  
            }
            catch(ArithmeticException ae) 
            {
                JOptionPane.showMessageDialog(actualWindow,"Divisor can not be ZERO");  
            }
        }
    public static void main(String[] args)
    {
        new P1();
    }
}
LAB7(2)
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
class LAB7_2 extends JFrame implements MouseListener
{
    JLabel lab;
    public LAB7_2()
    {
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        lab = new JLabel();
        Font f = new Font("Verdana", Font.ITALIC, 20);
        lab.setFont(f);
        lab.setForeground(Color.PINK);
        add(lab);
        addMouseListener(this);
        setVisible(true);
    }
    public void mouseExited(MouseEvent m)
    {
        lab.setText("Mouse Exited");
    }
    public void mouseEntered(MouseEvent m)
    {
        lab.setText("Mouse Entered");
    }
    public void mouseReleased(MouseEvent m)
    {
        lab.setText("Mouse Released");
    }
    public void mousePressed(MouseEvent m)
    {
        lab.setText("Mouse Pressed");
    }
    public void mouseClicked(MouseEvent m)
    {
        lab.setText("Mouse Clicked");
    }
    public static void main(String[] args)
    {
        LAB7_2 L = new LAB7_2();
    }
}
LAB7(3)
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
class TrafficLightStimulator extends JFrame implements ItemListener 
{
    JLabel lbl1, lbl2;
    JPanel nPanel, cPanel;
    CheckboxGroup cbg;
    public TrafficLightStimulator() 
    {
        setTitle("Traffic Light Simulator");
        setSize(600,400);
        setLayout(new GridLayout(2, 1));
        nPanel = new JPanel(new FlowLayout());
        cPanel = new JPanel(new FlowLayout());
        lbl1 = new JLabel();
        Font font = new Font("Verdana", Font.BOLD, 70);
        lbl1.setFont(font); 
        nPanel.add(lbl1);
        add(nPanel);
        Font fontR = new Font("Verdana", Font.BOLD, 20);
        lbl2 = new JLabel("Select Lights");
        lbl2.setFont(fontR);
        cPanel.add(lbl2);
        cbg = new CheckboxGroup();
        Checkbox rbn1 = new Checkbox("Red Light", cbg, false);
        rbn1.setBackground(Color.RED);
        rbn1.setFont(fontR);
        cPanel.add(rbn1);
        rbn1.addItemListener(this);
        Checkbox rbn2 = new Checkbox("Orange Light", cbg, false);
        rbn2.setBackground(Color.ORANGE);
        rbn2.setFont(fontR);
        cPanel.add(rbn2);
        rbn2.addItemListener(this);
        Checkbox rbn3 = new Checkbox("Green Light", cbg, false);
        rbn3.setBackground(Color.GREEN); 
        rbn3.setFont(fontR);
        cPanel.add(rbn3);
        rbn3.addItemListener(this);
        add(cPanel);
        setVisible(true);
        // to close the main window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    // To read selected item 
    public void itemStateChanged(ItemEvent i) {
        Checkbox chk = cbg.getSelectedCheckbox();
        String str=chk.getLabel();
        char choice=str.charAt(0);
        switch (choice) {
        case 'R':lbl1.setText("STOP");
                 lbl1.setForeground(Color.RED);
                 break;
        case 'O':lbl1.setText("READY");
                 lbl1.setForeground(Color.ORANGE);
                 break;
        case 'G':lbl1.setText("GO");
                 lbl1.setForeground(Color.GREEN);
                 break;
        }
    }
    // main method
    public static void main(String[] args) {
        new TrafficLightStimulator();
    }
}
LAB8(1)
import javax.swing.*;
import java.awt.*;

public class lab8_1 extends JFrame {
  public lab8_1() {
    setTitle("Button Frame");
    setSize(300, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());

    JButton button1 = new JButton("Button 1");
    add(button1);

    JButton button2 = new JButton("Button 2");
    add(button2);

    JTextField textField = new JTextField(10);
    add(textField);
  }

  public static void main(String[] args) {
    lab8_1 frame = new lab8_1();
    frame.setVisible(true);
  }
}
LAB8(2)
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class lab8_2 extends JFrame implements ActionListener {
  private JButton button;

  public lab8_2() {
    setTitle("Button Frame");
    setSize(300, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());

    button = new JButton("Click me");
    button.addActionListener(this);
    add(button);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button) {
      JOptionPane.showMessageDialog(this, "Button was clicked!");
    }
  }

  public static void main(String[] args) {
    lab8_2 frame = new lab8_2();
    frame.setVisible(true);
  }
}
LAB8(3)
import javax.swing.*;
import java.awt.*;

public class lab8_3 extends JFrame {
  private JTextField textField1;
  private JTextField textField2;
  private JTextArea textArea;

  public lab8_3() {
    setTitle("Text Field Frame");
    setSize(400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());

    textField1 = new JTextField(10);
    textField1.setEditable(true);
    add(textField1);

    textField2 = new JTextField(10);
    textField2.setEditable(true);
    add(textField2);

    textArea = new JTextArea(5, 20);
    textArea.setEditable(true);
    add(textArea);
  }

  public static void main(String[] args) {
    lab8_3 frame = new lab8_3();
    frame.setVisible(true);
  }
}
LAB8(4)
import javax.swing.*;
import java.awt.*;

public class lab8_4 extends JFrame {
  private JComboBox<String> comboBox;
  private JLabel label;

  public lab8_4() {
    setTitle("Combo Box Frame");
    setSize(400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());

    String[] choices = {"Item 1", "Item 2", "Item 3", "Item 4"};
    comboBox = new JComboBox<>(choices);
    comboBox.addActionListener(e -> {
      String selection = (String) comboBox.getSelectedItem() + " selected ";
      label.setText(selection);
    });
    add(comboBox);

    label = new JLabel();
    add(label);
  }

  public static void main(String[] args) {
    lab8_4 frame = new lab8_4();
    frame.setVisible(true);
  }
}
LAB8(5)
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class lab8_5 extends JFrame implements ActionListener {
  private JList<String> list;
  private JPopupMenu popupMenu;
  private JMenuItem menuItem;

  public lab8_5() {
    setTitle("List Frame");
    setSize(400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());

    String[] items = {"Item 1", "Item 2", "Item 3", "Item 4"};
    list = new JList<>(items);
    list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    list.addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON3) {
          popupMenu.show(list, e.getX(), e.getY());
        }
      }
    });
    add(new JScrollPane(list));

    popupMenu = new JPopupMenu();
    menuItem = new JMenuItem("Display message");
    menuItem.addActionListener(this);
    popupMenu.add(menuItem);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == menuItem) {
      int[] indices = list.getSelectedIndices();
      StringBuilder sb = new StringBuilder();
      for (int index : indices) {
        sb.append(list.getModel().getElementAt(index)).append("");
      }
      JOptionPane.showMessageDialog(this, "Selected items: " + sb.toString());
      }
      }

      public static void main(String[] args) {
      lab8_5 frame = new lab8_5();
      frame.setVisible(true);
      }
      }
LAB8(6)
import java.util.Scanner;

class OutOfRangeException extends Exception {
  public OutOfRangeException(String message) {
    super(message);
  }
}

public class lab8_6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scanner.nextInt();

    try {
      if (num < 10 || num > 50) {
        throw new OutOfRangeException("Number is out of range");
      }
      System.out.println("The square of the number is: " + num * num);
    } catch (OutOfRangeException e) {
      System.out.println(e.getMessage());
    }
  }
}
LAB8(7)
import java.util.*;
public class lab8_7 {
  public static void main(String[] args) {
    if (args.length < 2) {
      throw new IllegalArgumentException("Two numbers are required");
    }
    Scanner sc = new Scanner(System.in);
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    // System.out.println("Enter 2 numbers: ");
    // int num1=sc.nextInt();
    // int num2 = sc.nextInt();

    try {
      int result = num1 / num2;
      System.out.println("The result of the division is: " + result);
    } catch (ArithmeticException e) {
      System.out.println("Cannot divide by zero");
    }
  }
}


LAB9(1)
<html>
<head>
<title>Swap two numbers using JS(JavaScript)</title>
</head>
<body>
<h1>Swap two numbers using JS(JavaScript)</h1>
<p>Value of a: <input type="text" id="before_swap_first_value"></p><br>
<p>Value of b: <input type="text" id="before_swap_second_value"></p> <br>
<button type="button" onclick="swap()">Swap</button> 
<p>Value of a: <input type="text" id="after_swap_first_value"></p>
<p>Value of b: <input type="text" id="after_swap_second_value"></p>
<script>
function swap() {
	var a, b, c;
	a = Number(document.getElementById("before_swap_first_value").value);
	b = Number(document.getElementById("before_swap_second_value").value); 
	c = a;  
	a = b;	
	b = c;	
	document.getElementById("after_swap_first_value").value = a;
	document.getElementById("after_swap_second_value").value = b;
}		
</script>	
</body>
</html>





LAB9(2)
<html>
<body>
<p>Click the button to generate a random number between 1 and 100:</p>
<button onclick="generateRandomNumber()">Generate Random Number</button>
<p id="random-number"></p>
<script>
function generateRandomNumber() {
  var randomNumber = Math.floor(Math.random() * 100) + 1;
  document.getElementById("random-number").innerHTML = randomNumber;
}
</script>
</body>
</html>







LAB9(3)
<html>
<body>
<p>Enter a string: <input type="text" id="input-string"></p>
<p>Enter a character: <input type="text" id="input-char"></p>
<button onclick="countOccurrences()">Count Occurrences</button>
<p id="result"></p>
<script>
function countOccurrences() {
  var inputString = document.getElementById("input-string").value;
  var inputChar = document.getElementById("input-char").value;
  var count = 0;
  for (var i = 0; i < inputString.length; i++) {
    if (inputString[i] === inputChar) {
      count++;
    }
  }
  document.getElementById("result").innerHTML = "The character '" + inputChar + "' appears " + count + " times in the string.";
}
</script>
</body>
</html>






LAB9(4)
<html>
<body>
<p>Enter a string: <input type="text" id="input-string"></p>
<button onclick="countVowels()">Count Vowels</button>
<p id="result"></p>
<script>
function countVowels()
{
  var inputString = document.getElementById("input-string").value;
  var count = 0;
  var vowels = "aeiouAEIOU";
  
  for (var i = 0; i < inputString.length; i++) 
  {
    if (vowels.indexOf(inputString[i]) !== -1) 
    {
      count++;
    }
  }  
  document.getElementById("result").innerHTML = "The string contains " + count + " vowels.";
}
</script>
</body>
</html>






LAB9(5)
<html>
<body>
<p>Enter first number: <input type="text" id="num1"></p>
<p>Enter second number: <input type="text" id="num2"></p>
<button onclick="operate(add)">Add</button>
<button onclick="operate(multiply)">Multiply</button>
<p id="result"></p>
<script>
  function add(a, b) {
    return a + b;
  }
  function multiply(a, b) {
    return a * b;
  }

  function operate(operator) {
    var num1 = parseInt(document.getElementById("num1").value);
    var num2 = parseInt(document.getElementById("num2").value);
    document.getElementById("result").innerHTML = operator(num1, num2);
  }
</script>
</body>
</html>




LAB10(1)
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
	import java.nio.file.Paths;

	import java.util.Scanner;

	public class file1 {
	    public static void main(String[] args) throws IOException {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a file name: ");
	        String fileName = scanner.nextLine();
	        File file = new File(fileName);
	        
	        if (file.exists()) {
	            System.out.println("File exists");
	            if (file.canRead()) {
	                System.out.println("File is readable");
	            }
	            if (file.canWrite()) {
	                System.out.println("File is writable");
	            }
	            if (file.isDirectory()) {
//	                System.out.println("Type of file: " + Files.probeContentType(Paths.get(fileName)));
	            	System.out.println("Type of file: is a directory");
	            } else {
	                System.out.println("Type of file: not a directory");
	            }
	            System.out.println("Type of file: " + Files.probeContentType(Paths.get(fileName)));
	            System.out.println("Length of file in bytes: " + file.length());
	        } else {
	            System.out.println("File does not exist");
	        }
	    }
	}
LAB10(2)
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class file2 {
    public static void main(String[] args) {
        String fileName ="file1.txt";
        int characterCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                characterCount += line.length();
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        System.out.println("Character count: " + characterCount);
        System.out.println("Word count: " + wordCount);
        System.out.println("Line count: " + lineCount);
    }
}
LAB10(3)
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class file3 {
    public static void main(String[] args) {
        String fileName = "file1.txt";
        int lineNumber = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineNumber++;
                System.out.println(lineNumber + ": " + line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
LAB10(4)
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file4 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide two file names as command line arguments.");
            return;
        }

        String sourceFileName = args[0];
        String destinationFileName = args[1];

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileName));
             FileWriter fw = new FileWriter(destinationFileName)) {
            String line;
            while ((line = br.readLine()) != null) {
                fw.write(line + "\n");
                
            }
            System.out.println("Writing into file successful");
        } catch (IOException e) {
            System.out.println("An error occurred while reading or writing the file.");
            e.printStackTrace();
        }
    }
}
LAB10(5)
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class file5 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
				System.out.print("Enter the source file name: ");
				String sourceFileName = br.readLine();

				System.out.print("Enter the destination file name: ");
				String destinationFileName = br.readLine();

				try (BufferedReader reader = new BufferedReader(new FileReader(sourceFileName));
						FileWriter writer = new FileWriter(destinationFileName)) {
						String line;
						while ((line = reader.readLine()) != null) {
						writer.write(line + System.lineSeparator());
						}	
						System.out.println("Writing into file successful");
				} 
				catch (IOException e) {
						System.out.println("An error occurred while reading or writing the file.");
						e.printStackTrace();
				}
		} catch (IOException e) {
			System.out.println("An error occurred while reading the file names.");
			e.printStackTrace();
		}
	}
}

