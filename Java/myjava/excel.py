import openpyxl as pl

book=pl.load_workbook("土地別面積.xlsx")
sheets_name=book.sheetsnames
print(sheet_name)