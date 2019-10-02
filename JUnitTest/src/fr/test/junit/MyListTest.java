package fr.test.junit;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.main.junit.MyList;
import fr.main.junit.MyListImpl;

public class MyListTest {

	private static MyList<Integer> sut;  //la classe à tester
	private static int expectedSize;  // la taille à l'origine
	private static Properties prop;  // les propriétés
	private static List<Integer> testSet;  //les nombres que nous mettrons dans notre class
	private static FileInputStream propFile;  //le fichier de propriétés
		
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		prop = new Properties();
		testSet = new LinkedList<Integer>();
		propFile = new FileInputStream("src/config.properties"); //charge le fichier de propriétés
		prop.load(propFile);
		setExpectedSize(Integer.parseInt(prop.getProperty("taille"))); //parse la taille
		String numbers = prop.getProperty("nombre"); //récupère les nombre à mettre dans la liste
		for(String i : numbers.split(" ")) { //pour chaque nombre 
			testSet.add(Integer.parseInt(i.trim()));  // l'enregistrer en tant que int
	        }
	        sut = new MyListImpl<Integer>();  // instancier la classe à tester
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		propFile.close();   // on ferme le fichier à la fin du test
	}

	@Before
	public void setUp() throws Exception {
		for (int i : testSet) {
			sut.add(new Integer(i));   //on ajoute les nombres au début de chaque test
	        }
	}
	@Test
	public void testAdd() {
		assertEquals(expectedSize, sut.getSize());
		sut.add(new Integer(8));
		assertEquals(expectedSize+1, sut.getSize());
		for(int i = 0; i < testSet.size(); i++) {
			assertEquals(testSet.get(i), sut.getAt(i));
	        }
	}

	@After
	public void tearDown() throws Exception {
		sut.reset();  // à la fin de chaque test, on reset notre liste
	}

	public static int getExpectedSize() {
		return expectedSize;
	}

	public static void setExpectedSize(int expectedSize) {
		MyListTest.expectedSize = expectedSize;
	}
	

}
