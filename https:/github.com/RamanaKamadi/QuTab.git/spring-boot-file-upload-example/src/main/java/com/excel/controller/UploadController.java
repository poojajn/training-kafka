package com.excel.controller;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.excel.model.ProjectInfo;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UploadController {

    //Save the uploaded file to this folder
    private static String UPLOADED_FOLDER = "/Users/ramana.k/Desktop/";
    
    @Autowired
    MongoTemplate mongoTemplate;
    
    @GetMapping("/")
    public String index() {
        return "upload";
    }

    @PostMapping("/upload") // //new annotation since 4.3
    public String singleFileUpload(@RequestParam("file") MultipartFile file,
                                   RedirectAttributes redirectAttributes) throws InvalidFormatException {

        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            return "redirect:uploadStatus";
        }

        try {

            // Get the file and save it somewhere
            byte[] bytes = file.getBytes();
            Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
            Files.write(path, bytes);
            System.out.println("**********1**********");
            /***********************************************************************************/
            List<ProjectInfo> tempStudentList = new ArrayList<ProjectInfo>();
            
           
//            
//	          XSSFWorkbook workbook = new XSSFWorkbook(file.getInputStream());
//	          XSSFSheet worksheet = workbook.getSheetAt(0);
            
          Workbook workbook = WorkbookFactory.create(file.getInputStream());
          Sheet worksheet = workbook.getSheetAt(0);
          System.out.println("**********2**********");
          
          System.out.println("rows:::::"+worksheet.getPhysicalNumberOfRows());
          
          
	          for(int i=1;i<worksheet.getPhysicalNumberOfRows();i++) {
	        	  
	        	  
	        	  ProjectInfo tempStudent = new ProjectInfo();

	              Row row = worksheet.getRow(i);
	              DataFormatter formatter = new DataFormatter();
               
	              System.out.println("rowname::type::"+formatter.formatCellValue(worksheet.getRow(i).getCell(0)));
	              
	             // System.out.println("rowname::::"+row.getCell(0).getStringCellValue());
	              
	             
	              
//	              tempStudent.setProjectId(formatter.formatCellValue(worksheet.getRow(i).getCell(0)));
//	              tempStudent.setProjectName(formatter.formatCellValue(worksheet.getRow(i).getCell(1)));
//	              tempStudent.setModuleId(formatter.formatCellValue(worksheet.getRow(i).getCell(2)));
//	              tempStudent.setModuleNeme(formatter.formatCellValue(worksheet.getRow(i).getCell(3)));
//	              tempStudent.setModuleDescri(formatter.formatCellValue(worksheet.getRow(i).getCell(4)));
//	              tempStudent.setRequirementId(formatter.formatCellValue(worksheet.getRow(i).getCell(5)));
//	              tempStudent.setRequirementName(formatter.formatCellValue(worksheet.getRow(i).getCell(6)));
//	              tempStudent.setRequirementCases(formatter.formatCellValue(worksheet.getRow(i).getCell(7)));
//	              tempStudent.setRequirDescri(formatter.formatCellValue(worksheet.getRow(i).getCell(8)));
////	              tempStudent.setProjectName(formatter.formatCellValue(worksheet.getRow(i).getCell(1)));
////	              tempStudent.setProjectName(formatter.formatCellValue(worksheet.getRow(i).getCell(1)));
//	              System.out.println("first column room::::::"+tempStudent.getProjectName());
	              
	              //System.out.println("first column room::::::"+row.getCell(0).getStringCellValue());
	              //System.out.println("first column room::::::"+row.getCell(1).getStringCellValue());
	                  tempStudentList.add(tempStudent);  
	                  
	                  	                  mongoTemplate.save(tempStudent);
            
	          }
            
	          System.out.println("*********3***********");
            redirectAttributes.addFlashAttribute("message",
                    "You successfully uploaded '" + file.getOriginalFilename() + "'");

        } catch (IOException e) {
            e.printStackTrace();
       
        }
        return "redirect:/uploadStatus";
        
    }

    @GetMapping("/uploadStatus")
    public String uploadStatus() {
        return "uploadStatus";
    }

}