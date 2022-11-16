import openpyxl 

book=openpyxl.load_workbook("土地別面積.xlsx")
sheets_name=book.sheetnames
print(sheet_name)