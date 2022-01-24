import java.io.IOException;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

public class xmlDOMReaderTest {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {

		try {

			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse("zad1.xml");
			Element root = document.getDocumentElement();
			Node textNode = root.getFirstChild();
//			Node textNode = root.getLastChild();
			
			for(int i=0; i<root.getElementsByTagName("wizytowka").getLength(); i++){
			System.out.println(root.getElementsByTagName("wizytowka").item(i).getTextContent());
			}
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}
}
