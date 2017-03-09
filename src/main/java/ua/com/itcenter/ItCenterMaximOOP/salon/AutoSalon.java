package salon;

import java.util.ArrayList;
import java.util.Scanner;

public class AutoSalon {
	
	private String numb;
	private String col;
	private int indexOfCar;
	private int indexOfTrack;
	private int count;
	public ArrayList<Car> cars = new ArrayList<Car>();
	public ArrayList<Track> tracks = new ArrayList<Track>();
	
	Car car1 = new Car("AN 1276 UY", "Black", null);
	Car car2 = new Car("AD 4589 OP", "White", null);
	Car car3 = new Car("BR 6456 KL", "Blue", null);
	Car car4 = new Car("JJ 5606 JY", "Red", null);
	Car car5 = new Car("EE 1239 MM", "Green", null);
	Car car6 = new Car("QQ 1156 SS", "Gray", null);
	
	Track track1 = new Track("EE 2890", null);
	Track track2 = new Track("RT 1320", null);
	Track track3 = new Track("MM 5560", null);
	Track track4 = new Track("LC 3390", null);
	Track track5 = new Track("AA 8880", null);
	
	private String[] menuList = {"Добавить Новый Автомобиль - 1",
								 "Добавить Новый Прицеп - 2",
								 "Закрепить К Авто Прицеп - 3",
								 "Открепить От Авто Прицеп - 4",
								 "Отобразить Список Авто - 5",
								 "Отобразить Список Прицепов - 6",
								 "Отобразить Закрепления Авто За Прицепами - 7",
								 "Завести Определенный Автомобиль - 8",
								 "Поехать На Определенном Автомобиле - 9",
								 "Остановить Определенный Автомобил - 10",
								 "Отобразить Список Всех Авто и Прицепов с Закреплениями и Состояниями Авто и Прицепов - 11",
								 "Выход  - 12"}; 
 
	public  AutoSalon(){
		
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		cars.add(car5);
		cars.add(car6);
		
		tracks.add(track1);
		tracks.add(track2);
		tracks.add(track3);
		tracks.add(track4);
		tracks.add(track5);
		
	}
	
	public void start(){
		
		Scanner key = new Scanner(System.in);
		boolean runWhile = true;
		int numberOfOperation;
		
		while (runWhile) {
			
			printMenuAutoSalon();
		
				System.out.println("Выберите операцию: ");
				numberOfOperation = key.nextInt();
				
				
				switch (numberOfOperation) {
				
				case 1:	numberAuto();
					    colorAuto();
					    createNewCar(numb, col);
										     break;
										     
				case 2:	numberTrack();
					    createNewTrack(numb);			
										     break;
										     
				case 3:printArrayListCars();
					   indexOfAuto();
					   printArrayListTracks();
				       indexOfTrack(); 
					   joinTrackToCar(indexOfCar, indexOfTrack);
										     break;
										     
				case 4:	printArrayListCars();
						indexOfAuto();
						disconnectTrackOfCar(indexOfCar);
										     break;
										     
				case 5:	printArrayListCars();
											 break;
											 
				case 6: printArrayListTracks();
											 break;
											 
				case 7:	printAboutCarsWhithTracks();
											 break;
											 
				case 8: printArrayListCars();
						indexOfAuto();
						startAuto(indexOfCar);
											 break;
											 
				case 9:	printArrayListCars();
						indexOfAuto();
						moveAuto(indexOfCar);
											 break;
											 
				case 10: printArrayListCars();
						 indexOfAuto();
						 stoptAuto(indexOfCar);
						 					 break;
						 					 
				//case 11: System.out.println(car1.getTrack());
					//						 break;
											 
				case 12: runWhile = false;
									         break;
				}
				
			}
		}
	
	public void printArrayListCarsAndTrack(){
		
	}
	
	public String numberAuto(){
		Scanner keyb = new Scanner(System.in);
		System.out.println("Введите номер автомобиля и нажмите Enter:");
			numb = keyb.nextLine();
			
				return numb;
	}
	
	public String colorAuto(){
		Scanner keybo = new Scanner(System.in);
		System.out.println("Введите цвет автомобиля и нажмите Enter:");
			col = keybo.nextLine();
			
				return numb;
	}
	
	public void createNewCar(String numb, String col) {

		this.numb = numb;
		this.col = col;
		Car car =  new Car(numb, col, null);
		addCarInArrayList(car);
		System.out.println("Машина создана и добавлена в список");
										
	}

	public void printMenuAutoSalon() {
		
		for (String consol : menuList)
			System.out.println(consol);
		
	}
	
	public void addCarInArrayList(Car car){
		
		cars.add(car);
	}
	
	public void printArrayListCars(){
		for ( int i = 0; i < cars.size(); i++){
			System.out.println(cars.get(i).getColorOfCar() + " " + cars.get(i).getNumberOfCar() + " - индекс " + i);
		}
		System.out.println();
	}
	
	public String numberTrack(){
		Scanner keyb = new Scanner(System.in);
		System.out.println("Введите номер прицепа и нажмите Enter:");
			numb = keyb.nextLine();
			
				return numb;
	}
	
	public void createNewTrack(String numb) {

		this.numb = numb;
		
		Track track =  new Track(numb, null);
		addTrackInArrayList(track);
		System.out.println("Прицеп создан и добавлен в список");
										
	}
	
	public int indexOfAuto(){
		
		Scanner oto = new Scanner(System.in);
		boolean runWhile2 = true;
				
		while (runWhile2){
			System.out.println("Введите индес авто:");
			if(oto.hasNextInt()){
				indexOfCar = oto.nextInt();
					if (indexOfCar < 0 || indexOfCar >= cars.size()){
						System.out.println("Авто с таким индексом не существует, попробуйте еще раз ");
						System.out.println();
							
					} else {
						
							break;
					}
			} else {
		          System.out.println("Не корректный ввод, начиная сначал!");
		          System.out.println();
		          break;
		      }
			
		}
		return indexOfCar;
	}
	
	public void startAuto(int index){
		for ( int i = 0; i < cars.size(); i++){
			if(i == index){
				cars.get(i).start();;
			}
		}
	}
	
	public void moveAuto(int index){
		for ( int i = 0; i < cars.size(); i++){
			if(i == index){
				cars.get(i).move();;
			}
		}
	}
	
	public void stoptAuto(int index){
		for ( int i = 0; i < cars.size(); i++){
			if(i == index){
				cars.get(i).stop();;
			}
		}
	}
	
	public void addTrackInArrayList(Track track){
			tracks.add(track);
	}
	
	public void printArrayListTracks(){
		for ( int i = 0; i < tracks.size(); i++){
			System.out.println( tracks.get(i).getNumberOfTrack() + " - индекс " + i);
			
		}
		System.out.println();
	}
	
	public void joinTrackToCar(int indexOfCar, int indexOfTrack){
		
		
		if(cars.get(this.indexOfCar).getTrack() == null && cars.get(this.indexOfCar).getStateOfCar() == 0){
			cars.get(this.indexOfCar).setTrack(tracks.get(this.indexOfTrack));
			tracks.get(this.indexOfTrack).setCar(cars.get(this.indexOfCar));
			System.out.println("Прицеп с номером " + tracks.get(this.indexOfTrack).getNumberOfTrack() + " закреплен за авто с номером "
					+ cars.get(this.indexOfCar).getNumberOfCar());
			System.out.println();
			
		} else if (cars.get(this.indexOfCar).getTrack() != null){
			System.out.println("У авто с номером " + cars.get(this.indexOfCar).getNumberOfCar() + " уже есть прицеп " );
			System.out.println();
		} else{
			System.out.println("Error");
		}
		
	}
	
	public void disconnectTrackOfCar(int indexOfCar){
		
		if(cars.get(indexOfCar).getTrack() == null){
			System.out.println("У авто с номером " + cars.get(indexOfCar).getNumberOfCar() + " и так нет прицепа");
			System.out.println();
		} else if(cars.get(indexOfCar).getTrack() != null && cars.get(indexOfCar).getStateOfCar() == 0){
			cars.get(indexOfCar).setTrack(null);
			
			System.out.println("Прицеп откреплен");
			
			System.out.println();
		}
			
		
	}
	
	public int indexOfTrack(){
		
		Scanner oto = new Scanner(System.in);
		boolean runWhile = true;
				
		while (runWhile){
			System.out.println("Введите индес прицепа:");
			if(oto.hasNextInt()){
				indexOfTrack = oto.nextInt();
					if (indexOfTrack < 0 || indexOfTrack >= cars.size()){
						System.out.println("Прицепа с таким индексом не существует, попробуйте еще раз ");
						System.out.println();
							
					} else {
							break;
					}
			} else {
		          System.out.println("Не корректный ввод, начиная сначал!");
		          System.out.println();
		          break;
		      }
			
		}
		return indexOfTrack;
	}
	
	public Car returnCar (int indexOfCar){
		return cars.get(indexOfCar);
	}
	
	public Track returnTarck (int indexOfTrack){
		return tracks.get(indexOfTrack);
	}
	
	public void printAboutCarsWhithTracks(){
		for ( int i = 0; i < cars.size(); i++){
			if(cars.get(i).getTrack() != null){
				System.out.println("Прицеп с номером " + cars.get(i).getTrack().getNumberOfTrack() + " закреплен за авто с номером " 
						+ cars.get(i).getNumberOfCar());
				System.out.println();
			} else {
				count++;
			}
		}
		if(count == cars.size() ){
			System.out.println("Ни у одной машины нет прицепа");
			System.out.println();
		}
		
	}
}

