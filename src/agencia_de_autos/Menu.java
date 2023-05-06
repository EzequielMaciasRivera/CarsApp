/**
 * 
 */
package agencia_de_autos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author ezmacias
 *
 */
public class Menu {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Cars> cars = new ArrayList<Cars>();

		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		boolean exit = false;
		int option = 0;

		while (option < 3 && option >= 0) {
			System.out.println("-------------------Car agency----------------");
			System.out.println("");
			System.out.println("Welcome!\n Choose your profile:\n");
			System.out.println("[1] Seller Menu ");
			System.out.println("[2] Buyer Menu ");
			System.out.println("[3] Exit");
			System.out.println("");

			option = keyboard.nextInt();

			switch (option) {
			case 1:
				int SellerMenu = 0;

				// option=3;
				while (SellerMenu != 3) {
					System.out.println("---------------------------Seller Menu-----------------------");
					System.out.println("");
					Seller userSeller = new Seller(1, "Ezequiel Macías Rivera", 20, 35000, "ezequiel@gmail.com",
							"Las vegas 28 Campeche Ags", 44990998);
					System.out.println("Welcome " + userSeller.getName());
					System.out.println("");
					System.out.println("What do you want to do?\n Choose an option:\n");
					System.out.println("[1] Seller data");
					System.out.println("[2] Car menu");
					System.out.println("[3] Return to Car agency menu");
					System.out.println("");
					SellerMenu = keyboard.nextInt();

					switch (SellerMenu) {
					case 1:
						System.out.println("---------------Seller data----------------");
						System.out.println("");
						Seller userSellerr = new Seller(1, "Ezequiel Macías Rivera", 20, 35000, "ezequiel@gmail.com",
								"Las vegas 28 Campeche Ags", 44990998);
						System.out.println("Id: " + userSellerr.getId());
						System.out.println("Name: " + userSellerr.getName());
						System.out.println("Age: " + userSellerr.getEdad());
						System.out.println("Salary: " + userSellerr.getSueldo());
						System.out.println("Email: " + userSellerr.getEmail());
						System.out.println("Address: " + userSellerr.getAddress());
						System.out.println("Phone number: " + userSellerr.getPhoneNumber());
						break;

					case 2:

						int limite = 0;
						while (limite == 0) {
							try {
								System.out.println("-------------------Car menu-------------------");
								System.out.println("\n");

								System.out.println("[1] Add car");
								System.out.println("[2] Modify car data by model");
								System.out.println("[3] Search car by model");
								System.out.println("[4] Delete car by model");
								System.out.println("[5] Show cars for sale");
								System.out.println("[6] Return to Seller data menu");
								System.out.println("");
								System.out.println("----------------------------------------");

								int SwitchAddCar = Integer.parseInt(bf.readLine());

								switch (SwitchAddCar) {
								case 1:
									// Addcar();

									System.out.println("*****  Add car  ********  :D  ");
									System.out.println("Write brand:");
									String brand = bf.readLine();

									System.out.println("Write model:");
									String model = bf.readLine();

									System.out.println("Write colour:");
									String colour = bf.readLine();

									System.out.println("Write year:");
									int year = Integer.parseInt(bf.readLine());

									System.out.println("Write price:");
									double price = Double.parseDouble(bf.readLine());

									System.out.println("max_speed (km/h):");
									int max_speed = Integer.parseInt(bf.readLine());

									Cars car = new Cars(brand, model, colour, year, price, max_speed);

									System.out.println("Successful car add!!     :D");

									cars.add(car);
									// System.out.println(cars);
									break;
								case 2:
									// Modifycardata();

									int found599 = 0;
									System.out.println("*****  Modify car data********  :D  ");
									System.out.println("");
									System.out.println("Enter Model to modify:");

									String mo = bf.readLine();
									for (int i = 0; i < cars.size(); i++) {
										String modelo = cars.get(i).getModel();

										if (modelo.equals(mo)) {
											System.out.println("Enter new brand:");
											String bra = bf.readLine();
											cars.get(i).setBrand(bra);

											System.out.println("Enter new model:");
											String mod = bf.readLine();
											cars.get(i).setModel(mod);

											System.out.println("Enter new colour:");
											String col = bf.readLine();
											cars.get(i).setColour(col);

											System.out.println("Enter new year:");
											int yea = Integer.parseInt(bf.readLine());
											cars.get(i).setYear(yea);

											System.out.println("Enter new price:");
											int pric = Integer.parseInt(bf.readLine());
											cars.get(i).setPrice(pric);

											System.out.println("Enter new max_speed (km/h):");
											int speed = Integer.parseInt(bf.readLine());
											cars.get(i).setMax_speed(speed);
											System.out.println("Successfully modified data!!");

											for (int e = 0; i < cars.size(); i++) {
												if (mod.equals(cars.get(e).getModel())) {

													System.out.println("");
													System.out.println("Brand: " + cars.get(i).getBrand());
													System.out.println("Model: " + cars.get(i).getModel());
													System.out.println("Colour: " + cars.get(i).getColour());
													System.out.println("Year: " + cars.get(i).getYear());
													System.out
															.println("max_speed (km/h): " + cars.get(i).getMax_speed());
													System.out.println("Price: " + cars.get(i).getPrice());
												}
											}
										}
										found599 = 1;

									}
									if (found599 == 0) {
										System.out.println("Car not found, please enter a valid value :(");
									}
									break;
								case 3:
									// Showcars by model();

									System.out.println("Enter Model: ");
									String m = bf.readLine();
									int found = 0;
									for (int i = 0; i < cars.size(); i++) {
										if (m.equals(cars.get(i).getModel())) {
											System.out.println("Car found!!  :)");
											System.out.println("");
											System.out.println("Brand: " + cars.get(i).getBrand());
											System.out.println("Model: " + cars.get(i).getModel());
											System.out.println("Colour: " + cars.get(i).getColour());
											System.out.println("Year: " + cars.get(i).getYear());
											System.out.println("max_speed (km/h): " + cars.get(i).getMax_speed());
											System.out.println("Price: " + cars.get(i).getPrice());

										}
										found = 1;
									}

									if (found == 0) {
										System.out.println("Car not found, please enter a valid value :(");
									}
									break;
								case 4:
									// Delete car by model

									int found56 = 0;
									System.out.println("*****  Delete car by model********  :)  ");
									System.out.println("Enter Model");
									String k = bf.readLine();
									for (int i = 0; i < cars.size(); i++) {
										String modelo = cars.get(i).getModel();
										if (modelo.equals(k)) {
											cars.remove(i);
											System.out.println("Successfully deleted car");
										}
										found56 = 1;
									}

									if (found56 == 0) {
										System.out.println("Car not found, please enter a valid value :(");
									}

									break;
								case 5:
									// Show cars for sale
									int found1 = 0;
									for (int i = 0; i < cars.size(); i++) {
										System.out.println("*****  Cars for sale!! ********  :)  ");
										System.out.println("Brand: " + cars.get(i).getBrand());
										System.out.println("Model: " + cars.get(i).getModel());
										System.out.println("Colour: " + cars.get(i).getColour());
										System.out.println("Year: " + cars.get(i).getYear());
										System.out.println("max_speed (km/h): " + cars.get(i).getMax_speed());
										System.out.println("Price: " + cars.get(i).getPrice());

										found1 = 1;
									}
									if (found1 == 0) {
										System.out.println("There is not cars :(");
									}

									break;
								case 6:
									limite++;

									break;
								default:
									System.out.println("Options are between 1 and 6");
									break;
								}// Fin de switch
							} catch (NumberFormatException i) {
								System.out.println("Enter an option");
							}
						}
						break;

					}
				}
				break;

			case 2:

				int BuyerMenu = 0;
				while (BuyerMenu != 3) {

					System.out.println("-------------------Buyer Menu----------------");
					System.out.println("");
					Buyer userBuyer3 = new Buyer(1, "Kelly Fer", "kelly678@gmail.com",
							"Las Palomas 89 Villa Sunción Ags", 982222222);
					System.out.println("Welcome " + userBuyer3.getName());
					System.out.println("");
					System.out.println("What do you want to do?\n Choose an option:\n");
					System.out.println("[1] Buyer data");
					System.out.println("[2] Catalog menu");
					System.out.println("[3] Return to Car agency menu");
					System.out.println("");
					BuyerMenu = keyboard.nextInt();
					try {
						switch (BuyerMenu) {
						case 1:
							System.out.println("------------Buyer data-----------");
							Buyer userBuyer = new Buyer(1, "Kelly Fer", "kelly678@gmail.com",
									"Las Palomas 89 Villa Sunción Ags", 982222222);
							System.out.println("Id: " + userBuyer.getId());
							System.out.println("Name: " + userBuyer.getName());
							System.out.println("Email: " + userBuyer.getEmail());
							System.out.println("Address: " + userBuyer.getAddress());
							System.out.println("PhoneNumber: " + userBuyer.getPhoneNumber());
							break;

						case 2:
							int limite = 0;
							while (limite == 0) {
								try {
									System.out.println("------------------- Catalog menu -------------------");
									System.out.println("\n");
									System.out.println("[1] Show cars for sale");
									System.out.println("[2] Search car by model");
									System.out.println("[3] Buy car by model");
									System.out.println("[4] Return to Buyer data menu");
									System.out.println("");
									System.out.println("----------------------------------------");

									int op = Integer.parseInt(bf.readLine());

									switch (op) {
									case 1:
										// Show cars for sale
										int found2 = 0;
										for (int i = 0; i < cars.size(); i++) {
											System.out.println("*****  Cars for sale!! ********  :)  ");
											System.out.println("Brand: " + cars.get(i).getBrand());
											System.out.println("Model: " + cars.get(i).getModel());
											System.out.println("Colour: " + cars.get(i).getColour());
											System.out.println("Year: " + cars.get(i).getYear());
											System.out.println("max_speed (km/h): " + cars.get(i).getMax_speed());
											System.out.println("Price: " + cars.get(i).getPrice());

											found2 = 1;
										}
										if (found2 == 0) {
											System.out.println("There is not cars :(");
										}

										break;
									case 2:
										// Search by model();
										System.out.println("Enter Model");
										String m = bf.readLine();
										int found = 0;
										for (int i = 0; i < cars.size(); i++) {
											if (m.equals(cars.get(i).getModel())) {
												System.out.println("Car found!!  :)");
												System.out.println("");
												System.out.println("Brand: " + cars.get(i).getBrand());
												System.out.println("Model: " + cars.get(i).getModel());
												System.out.println("Colour: " + cars.get(i).getColour());
												System.out.println("Year: " + cars.get(i).getYear());
												System.out.println("max_speed (km/h): " + cars.get(i).getMax_speed());
												System.out.println("Price: " + cars.get(i).getPrice());

												found = 1;
											}

										}

										if (found == 0) {
											System.out.println("Car not found, please enter a valid value :(");
										}

										break;
									case 3:
										// Buy car by model
										int found3 = 0;
										System.out.println("*****  Buy car by model********  :)  ");
										System.out.println("Enter Model");
										String k = bf.readLine();
										for (int i = 0; i < cars.size(); i++) {
											String modelo = cars.get(i).getModel();
											if (modelo.equals(k)) {
												cars.remove(i);
												System.out.println("Successfully purchased car");
											}
											found3 = 1;
										}
										if (found3 == 0) {
											System.out.println("Car not found, please enter a valid value :(");
										}
										break;
									case 4:
										limite++;

										break;
									default:
										System.out.println("Options are between 1 and 6");
										break;
									}// Fin de switch
								} catch (NumberFormatException i) {
									System.out.println("Enter an option");
								}

							}
						}
					} catch (NumberFormatException i) {
						System.out.println("Enter an option");
					}
				}
				break;// while buyer menu

			}
			System.out.println("Session ended");
		}
	}

}
