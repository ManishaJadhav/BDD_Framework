package Actions;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import utility.Constant;

public class htmlreport {

	public static void html() throws IOException {
		FileInputStream fis = new FileInputStream(Constant.Path_TestData+Constant.File_TestData);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");

		int row = sh.getLastRowNum();

		// define a HTML String Builder
		StringBuilder htmlStringBuilder = new StringBuilder();
		// append html header and title
		htmlStringBuilder.append("<html><head><title>Test Summary Report. </title></head>");
		// append body
		htmlStringBuilder.append("<body>");
		// append table

		htmlStringBuilder.append("<table border=\"1\" cellpadding=\"0\" width=\"100%;\">");

		htmlStringBuilder.append("<tbody>");

		htmlStringBuilder.append("<tr>");
		htmlStringBuilder.append("<td colspan=\"5\">");
		 DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm");
		 Date dateobj = new Date();
		 String s = df.format(dateobj);
		htmlStringBuilder.append(
				"<p align=\"center\" style=\"text-align:center\"><b><span>The Automation ran successfully last on: <span style=\"background:yellow\">" + s + "</span></b></p>");

		htmlStringBuilder.append("</td>");
		htmlStringBuilder.append(" </tr>");

		htmlStringBuilder.append("<tr>");
		htmlStringBuilder.append("<td colspan=\"5\">");

		htmlStringBuilder.append(
				"<h1 align=\"center\" style=\"text-align:center;margin:8px 0\"><span>Test Summary Report</span></h1>");

		htmlStringBuilder.append("</td>");
		htmlStringBuilder.append(" </tr>");

		htmlStringBuilder.append("<tr>");

		htmlStringBuilder.append("<td style=\"padding:0px 6px\" width=\"200px\">");
		htmlStringBuilder.append("<p><b font-size:14px;\">Test Case Name</b></p>");

		/*htmlStringBuilder.append("</td>");
		htmlStringBuilder.append("<td style=\"padding:0px 6px\" width=\"180px\">");

		htmlStringBuilder.append("<p><b font-size:14px;\">Start Time</b></p>");

		htmlStringBuilder.append("</td>");
		htmlStringBuilder.append("<td style=\"padding:0px 6px\" width=\"180px\">");

		htmlStringBuilder.append("<p><b font-size:14px;\">End Time</b></p>");

		htmlStringBuilder.append("</td>");
		htmlStringBuilder.append("<td style=\"padding:0px 6px\" width=\"180px\">");
		htmlStringBuilder.append("<p><b font-size:14px;\">Response Time(in sec)</b></p>");
		htmlStringBuilder.append("</td>");*/
		htmlStringBuilder.append("<td style=\"padding:0px 6px\">");
		htmlStringBuilder.append("<p><b font-size:14px;\">Result</b></p>");
		htmlStringBuilder.append("</td>");
		htmlStringBuilder.append(" </tr>");

		for (int j = 1; j <= row; j++) {
			String s1 = sh.getRow(j).getCell(0).getStringCellValue();
			//String s2 = sh.getRow(j).getCell(1).getStringCellValue();
			String s3 = sh.getRow(j).getCell(2).getStringCellValue();
			//String s4 = sh.getRow(j).getCell(3).getStringCellValue();
			//String s5 = sh.getRow(j).getCell(4).getStringCellValue();

			htmlStringBuilder.append("<tr>");

			htmlStringBuilder.append("<td style=\"padding:0px 6px\">");

			htmlStringBuilder.append(" <p><b font-size:14px;\">" + s1 + "</b></p>");

			htmlStringBuilder.append("</td>");

			//htmlStringBuilder.append("<td style=\"padding:0px 6px\">");

			//htmlStringBuilder.append("<p><b font-size:14px;\">" + s2 + "</b></p>");

			//htmlStringBuilder.append("</td>");

			//htmlStringBuilder.append("<td style=\"padding:0px 6px\">");

			//htmlStringBuilder.append("<p><b font-size:14px;\">" + s3 + "</b></p>");

			//htmlStringBuilder.append("</td>");

			//htmlStringBuilder.append("<td style=\"padding:0px 6px\">");

			//htmlStringBuilder.append("<p><b font-size:14px;\">" + s4 + "</b></p>");

			//htmlStringBuilder.append("</td>");

			if (s3.equals("Pass")) {
				htmlStringBuilder.append("<td style=\"background:#008000; padding:0px 6px\">");
				htmlStringBuilder.append("<p><b font-size:14px;\">" + s3 + "</b></p>");
			} else if (s3.equals("Fail")) {
				htmlStringBuilder.append("<td style=\"background:#F84A4A; padding:0px 6px\">");

				htmlStringBuilder.append("<p><b font-size:14px;\">" + s3 + "</b></p>");
			}

			htmlStringBuilder.append("</td>");

			htmlStringBuilder.append(" </tr>");

		}

		htmlStringBuilder.append("</td>");

		htmlStringBuilder.append(" </tr>");

		htmlStringBuilder.append("</tbody>");

		htmlStringBuilder.append("</table>");

		// write html string content to a file
		WriteToFile(htmlStringBuilder.toString(), "index.html");
	}

	public static void WriteToFile(String fileContent, String fileName) throws IOException {
		String projectPath = System.getProperty("user.dir");
		String tempFile = projectPath + File.separator + fileName;
		File file = new File(tempFile);
		// if file does exists, then delete and create a new file
		if (file.exists()) {
			try {
				File newFileName = new File(projectPath + File.separator + "backup_" + fileName);
				file.renameTo(newFileName);
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// write to file with OutputStreamWriter
		OutputStream outputStream = new FileOutputStream(file.getAbsoluteFile());
		Writer writer = new OutputStreamWriter(outputStream);
		writer.write(fileContent);
		writer.close();
	}

	

}

