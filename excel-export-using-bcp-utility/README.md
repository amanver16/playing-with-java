# Excel Export Using BCP Utility
BCP is a utility which is used to export the data returned by **Sql Server** query and export it to external file like excel, csv, text etc.

## Steps
1. Install BCP Command Line Utility. Download it from below mentioned website. (Ignore if already installed)  
	https://www.microsoft.com/en-us/download/details.aspx?id=53591
2. Check the installation using **bcp /v** command at command prompt.
3. The bcp command for exporting data from database to excel is:  

> **bcp** "sql_server_query" **queryout** "file_path.xls/csv/xlx/xlsx/txt/dat/etc" **-w -d** "database/schema name" **-S** "Server IP/Name/URL" **-U** "Username" **-P** "Password"   
		
If your server has trusted/integarated connection, means you don't have to give username or password. So the command would be,  
		
> **bcp** "sql_server_query" **queryout** "file_path.xls/csv/xlx/xlsx/txt/dat/etc" **-w -d** "database/schema name" **-S** "Server IP/Name/URL" **-T**  
		
	-T 			:		defines trusted connection (No need to give username or password)  
	queryout	        :		copies query result to specified file format  
	bcp			:		bulk copy program  
	-S			:		defines name/IP of the database host server (Don't give port address because BCP automatically handles it)  
	-d			:		defines database/schema name  
	-U			:		defines username of the database connection  
	-P			:		defines password of database connection  
	-w			:		represent wide character length  
		
There are many switches that can be applied to bcp command. check the website Microsoft Docs   
https://docs.microsoft.com/en-us/sql/tools/bcp-utility?view=sql-server-2017  
		
If you simply want to copy a table data to a file, then the command would be
		
> **bcp** database_table_name **out** "file_path.xls/csv/xlx/xlsx/txt/dat/etc" **-w -d** "database/schema name" **-S** "Server IP/Name/URL" **-U** "Username" **-P** "Password"

**Note :** file_path can be relative or absolute.