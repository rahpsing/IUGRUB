package app.com.iugrub.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import app.com.iugrub.pojo.Cuisine;
import app.com.iugrub.pojo.FoodItem;
import app.com.iugrub.pojo.FoodStore;
import app.com.iugrub.pojo.StoreContactDetails;

public class TestClass {

	@Autowired
	SessionFactory objSessionFactory;
	
	
	public static void main(String[] args) {
		  try
	        {
	            FileInputStream file = new FileInputStream(new File("howtodoinjava_demo.xlsx"));
	 
	            //Create Workbook instance holding reference to .xlsx file
	            XSSFWorkbook workbook = new XSSFWorkbook(file);
	 
	            //Get first/desired sheet from the workbook
	            XSSFSheet sheet = workbook.getSheetAt(0);
	 
	            //Iterate through each rows one by one
	            Iterator<Row> rowIterator = sheet.iterator();
	            while (rowIterator.hasNext()) 
	            {
	                Row row = rowIterator.next();
	                //For each row, iterate through all the columns
	                Iterator<Cell> cellIterator = row.cellIterator();
	                 
	                while (cellIterator.hasNext()) 
	                {
	                    Cell cell = cellIterator.next();
	                    //Check the cell type and format accordingly
	                    switch (cell.getCellType()) 
	                    {
	                        case Cell.CELL_TYPE_NUMERIC:
	                            System.out.print(cell.getNumericCellValue() + "t");
	                            break;
	                        case Cell.CELL_TYPE_STRING:
	                            System.out.print(cell.getStringCellValue() + "t");
	                            break;
	                    }
	                }
	                System.out.println("");
	            }
	            file.close();
	        } 
	        catch (Exception e) 
	        {
	            e.printStackTrace();
	        }
	}
	
	/*@Test
	public void testInsert() {
		
		Session session = objSessionFactory.getCurrentSession();

		//session.beginTransaction();
		
		FoodStore objStore = new FoodStore();
		objStore.setStrStoreName("DenByDenny's");
		
		Cuisine objCuisine = new Cuisine();
		objCuisine.setStrCuisineName("Chinese");
		
		Cuisine objCuisine2 = new Cuisine();
		objCuisine.setStrCuisineName("American");
		
		List<Cuisine> objList  = new ArrayList<Cuisine>();
		objList.add(objCuisine);
		objList.add(objCuisine2);
		
		StoreContactDetails objContacts = new StoreContactDetails();
		objContacts.setStrWebSiteLink("www.google.com");
		objContacts.setContacts(new ArrayList<String>());
		
		List<StoreContactDetails> lstContacts = new ArrayList();
		lstContacts.add(objContacts);
		
		FoodItem item1 = new FoodItem();
		item1.setObjCuisine(objCuisine2);
		item1.setPrice(75.00);
		item1.setStrItemName("CheeseBurger");
		item1.setObjFoodStore(objStore);
		
		FoodItem item2 = new FoodItem();
		item1.setObjCuisine(objCuisine2);
		item1.setPrice(85.00);
		item1.setStrItemName("Pizza");
		item1.setObjFoodStore(objStore);
		
		List<FoodItem> lstFoodItems = new ArrayList();
		lstFoodItems.add(item1);
		lstFoodItems.add(item2);
		
		
		objStore.setListCuisines(objList);
		objStore.setListContactNumbers(lstContacts);
		objStore.setListOfItems(lstFoodItems);
		
		session.save(objStore);
		session.getTransaction().commit();
		session.close();*/
	//}
}
