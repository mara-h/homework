package loose.oose.fis.processors;
import loose.oose.fis.documents.Document;
import java.util.ArrayList;


class ClasaNoua implements Procesor{

	 public ClasaNoua(String text){
		super(text);
	 }

	 public int proceseaza(ArrayList<Document> documente){
		if(documente.size()>2)
			return 1;
		return 2;
	 }

}