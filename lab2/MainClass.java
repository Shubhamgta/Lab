package lab2;

public class MainClass {

	
	public static void main(String []args) {
		MainClass mn = new MainClass();
		Item item[] = new Item[4];
		Book book1 = new Book("101", "JAVA", "Shanshank");	
		@SuppressWarnings("unused")
		Book book2 = new Book("101", "JAVA", "Shanshank");
		
		Journal Journal1 = new Journal("102", "JAVA", "Shanshank", "10/10/2020");
		
		Journal1.setAuthorName("new");
		Journal1.setIdNum("23");
		
		AudioCd ac1= new AudioCd("103", "Audio", "sing", "10/10/2020", 30);
		VideoCd vc1= new VideoCd("104", "video", "Dance", "Shanshank", "10/10/2020", 30);

		item[0] = Journal1;
		item[1] = vc1;
		item[2] = ac1;
		item[3] = book1;
		
		
		for(int i=0; i < item.length; i++) {
			if(item[i] instanceof Book) {
				System.out.println("first");
				Book b1 = (Book)item[i];
				mn.display(b1);
			} else if(item[i] instanceof VideoCd) {
				VideoCd b2 = (VideoCd)item[i];
				mn.display(b2);
				System.out.println("second");
			} else if(item[i] instanceof  AudioCd) {
				AudioCd b2 = (AudioCd)item[i];
				mn.display(b2);
				System.out.println("third");
			} else if(item[i] instanceof Journal) {
				Journal b2 = (Journal)item[i];
				mn.display(b2);
				System.out.println("forth");
			}
		}
		
		System.out.println(Book.getNOOfCopy());
		System.out.println(Journal.getNOOfCopy());
		System.out.println(AudioCd.getNOOfCopy());
		System.out.println(VideoCd.getNOOfCopy());
		
		Book b1 = new Book("101", "JAVA", "Shanshank");
		Book b2 = new Book("103", "JAVA", "Shanshank");
		
		if(b1.equals(b2))
			System.out.println("equal");
		else
			System.out.println("in equal");

			
	}

	
	public void display(Book book1) {
		System.out.println(book1.getIdNum());
		System.out.println(book1.getTitle());
		System.out.println(book1.getAuthorName());
		System.out.println('\n');
	}
	
	public void display(Journal Journal1) {
		System.out.println(Journal1.getIdNum());
		System.out.println(Journal1.getTitle());
		System.out.println(Journal1.getAuthorName());
		System.out.println(Journal1.getDate());
		System.out.println('\n');
	}
	
	public void display(AudioCd ac1) {
		System.out.println(ac1.getIdNum());
		System.out.println(ac1.getTitle());
		System.out.println(ac1.getArtist());
		System.out.println(ac1.getIdNum());
		System.out.println(ac1.getGenre());
		System.out.println(ac1.getRuntime());
		System.out.println('\n');
	}

	public void display(VideoCd vc1) {
		System.out.println(vc1.getIdNum());
		System.out.println(vc1.getTitle());
		System.out.println(vc1.getDir());
		System.out.println(vc1.getIdNum());
		System.out.println(vc1.getGenre());
		System.out.println(vc1.getRuntime());
		System.out.println('\n');
	}
}
