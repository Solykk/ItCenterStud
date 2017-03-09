package week4.lesson2;



public class Node {
	
	Node nextElement;    
    int data;
    
    
	
	public Node(int data, Node nextElement) {
		
		this.data = data;
		this.nextElement = nextElement;
		
	}
	static class LinkList implements Comparable<Node>{
		
		
		 private Node firstElement;       
		
		 private int counter = 1;
		
		 
		 public void addNode(int element){
			 
				//Node no = new Node();
				//no.data = element;
				//no.nextElement = null;
		//   Node a = new Node();  //создаём новый элемент
		  //      a.data = element;
		       // System.out.println(" < " + a.data + ">");
		    //    if (firstElement == null)           //если список пуст
		      //  {                           //то указываем ссылки начала и конца на новый элемент
		     //   	firstElement = new Node(element);               //т.е. список теперь состоит из одного элемента
		     //   	firstElement.nextElement = null;
		     //   } else if(firstElement != null){
		      //  	firstElement.nextElement = new Node(element);
		        																//иначе "старый" последний элемент теперь ссылается на новый
		        	               //а в указатель на последний элемент записываем адрес нового элемента
		      //  }
		      //  
		        
		   // }
			
		     //   if ( firstElement.data == 0 && lastElement.data == 0)  { 
		        	
		       // 	firstElement.data = element;
		        //	lastElement.data =  firstElement.data;
		        	//firstElement.nextElement = null;
		        	//firstElement = no;               
		        	//lastElement = no;
		       // } else if(firstElement != null && lastElement.nextElement == null) {
		        //	Node n = new Node();
					//n.data = element;
		        //	n.nextElement = null;         
		        //	lastElement = n;  
		        //	firstElement.nextElement = n;
		       // }
		   // }
			 /*if(firstElement == null) {           
		                                  
		            firstElement = no;              
		            lastElement = no;
		            no.nextElement = null;
		            
		        }
			 else if(firstElement != null && lastElement != null){
				 	//lastElement = no;
		            //no.nextElement = null;
		            lastElement.nextElement = no;          
		            lastElement = no;    
			 }*/

			 
		// }
			firstElement = new Node(element, null);
			Node tmp = firstElement;
			 while (tmp != null)  	
		
				 tmp.nextElement = new Node(element, null);
			
		
				
		
		}
		 
		 public void set(int index, int element){
			 
		 }
		 
		public  void remove(int index){
			
		}
		
		public int indexOf(int element){
			return 0;
		}
		
		public void swapFirstLast(){
			
		}
		
		public void revert(){
			
		}
		
		public void swapMaxMin(){
			
		}
		
		public void sortPartial(int index){
			
		}
		
		public boolean equals(LinkList list){
			return true;
		}
		
		public LinkList concat(LinkList list){
			return  list;
		}
		
		public void sort(){
			
		}
		
		public void removeDuplicates(){
			
		}
		
		public void printList(){
			//System.out.println("<" + firstElement.data + ">" + "<" + firstElement.nextElement.data + ">" );
			 Node temp = firstElement; 
			 
		        while (temp != null)   {        
		        
		            System.out.print("<" + temp.data + "> ");
		            System.out.println();
		            System.out.println(" - " + counter + " - ");
		            temp = temp.nextElement;  
		            counter++;
		        }
		}
		
		@Override
		public int compareTo(Node o) {
			
		return 0;
		}
		
		
	}
	public static void main(String[] args) {
		LinkList l = new LinkList();
		l.addNode(987);
		l.addNode(345);
		l.addNode(67890);
		l.addNode(11111);
		l.addNode(33333);
		l.printList();
	}
}
