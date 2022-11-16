rem jc8.bat
rem コードページ932(ANSI/OEM-日本語Shift-JIS)のコマンドプロンプトで
rem UTF-8のJavaソースファイルをコンパイルするためのバッチファイル

javac -encoding utf-8 %1.java